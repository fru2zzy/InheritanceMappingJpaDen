package com.example.demo.controller.tablePerClass;

import java.util.List;

import com.example.demo.model.tablePerClass.Mango;
import com.example.demo.repository.tablePerClass.MangoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/mango")
public class MangoController {

    @Autowired
    MangoRepository mangoRepository;

    @GetMapping
    public List<Mango> getAll() {
        return mangoRepository.findAll();
    }

    @PostMapping
    public Mango post(@RequestBody Mango mango) {
        return mangoRepository.save(mango);
    }
}
