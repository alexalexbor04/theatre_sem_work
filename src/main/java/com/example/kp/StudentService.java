package com.example.kp;

import java.util.List;

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

    public void save(Theatre theatre) {
        repo.save(theatre);
    }

    public Theatre get(Long id) {
        return repo.findById(Math.toIntExact(id)).get();
    }

    public void delete(Long id) {
        repo.deleteById(Math.toIntExact(id));
    }
}
