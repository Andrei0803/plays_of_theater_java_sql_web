package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TheaterService {
    @Autowired
    private TheaterRepository repo;

    public List<Theater> listAll(String keyword) {
        if (keyword != null) {
            return repo.search(keyword);
        }
        return repo.findAll();
    }

    public void save(Theater Theater) {
        repo.save(Theater);
    }

    public List<String> amount(){ return repo.amount();}

    public Float avg(){return repo.avgPerDay();}

    public Theater get(Long id) {
        return repo.findById(id).get();
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }

}

