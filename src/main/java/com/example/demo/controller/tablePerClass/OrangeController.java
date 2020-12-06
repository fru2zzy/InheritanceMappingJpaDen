package com.example.demo.controller.tablePerClass;

import java.util.List;

import com.example.demo.model.tablePerClass.Fruit;
import com.example.demo.model.tablePerClass.Orange;
import com.example.demo.repository.tablePerClass.OrangeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/orange")
public class OrangeController {

    @Autowired
    OrangeRepository orangeRepository;

    @GetMapping
    public List<Orange> getAll() {
        return orangeRepository.findAll();
    }

    @PostMapping
    public Fruit post(@RequestBody Orange orange) {
        return orangeRepository.save(orange);
    }
}
