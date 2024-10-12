package com.example.kp;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repo;

    public List<Theatre> listAll(String keyword) {
        if (keyword != null) {
            return repo.search(keyword);
        }
        return repo.findAll();
    }

    public List<Theatre> filterByDate(java.sql.Date date) {
        return repo.findByDate(date);
    }

//    public List<Object[]> countByDayChart() {
//        return repo.countByDayChart();
//    }

    public void save(Theatre theatre) {
        repo.save(theatre);
    }

    public Theatre get(Long id) {
        return repo.findById(Math.toIntExact(id)).get();
    }

    public void delete(Long id) {
        repo.deleteById(Math.toIntExact(id));
    }

    public String generateBarChart() throws IOException {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        List<Object[]> playData = repo.countByDayChart();

        for (Object[] data : playData) {
            String date = data[0].toString();
            Long count = (Long) data[1];
            dataset.addValue(count, "Кол-во", date);
        }

        JFreeChart chart = ChartFactory.createBarChart(
                "Количество спектаклей по дням",
                "Даты",
                "Количество спектаклей",
                dataset
        );

        String path = "src/main/resources/static/images/bar_chart.png";
        ChartUtils.saveChartAsPNG(new File(path), chart, 800, 600);
        return "/images/bar_chart.png";
    }
}
