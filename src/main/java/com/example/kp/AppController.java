package com.example.kp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {

    @Autowired
    private StudentService service;

    @RequestMapping("/")
    public String viewHomePage(Model model, @Param("keyword") String keyword) {
        List<Theatre> listPLays = service.listAll(keyword);
        model.addAttribute("listPLays", listPLays);
        model.addAttribute("keyword", keyword);
        return "index";
    }

    @RequestMapping("/filterByDate")
    public String filterByDate(Model model, @Param("date") String date) {
        List<Theatre> listPLays = service.filterByDate(date);
        model.addAttribute("listPLays", listPLays);
        return "index";
    }

    @RequestMapping("/new")
    public String showNewPlayForm(Model model) {
        Theatre play = new Theatre();
        model.addAttribute("play", play);
        return "new_place";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String savePlay(@ModelAttribute("play") Theatre play) {
        service.save(play);
        return "redirect:/";
    }

    @RequestMapping("/edit/{id}")
    public ModelAndView showEditPlayForm(@PathVariable(name = "id") Long id) {
        ModelAndView mav = new ModelAndView("edit_place");
        Theatre play = service.get(id);
        mav.addObject("play", play);
        return mav;
    }

    @RequestMapping("/delete/{id}")
    public String deletePlay(@PathVariable(name = "id") Long id) {
        service.delete(id);
        return "redirect:/";
    }

//    @RequestMapping("/playCountByDay")
//    public String getPlayCountByDay(Model model) {
//        List<Object[]> playCountData = service.getPlayCountByDay();
//        model.addAttribute("playCountData", playCountData);
//        return "chart";
//    }

}


