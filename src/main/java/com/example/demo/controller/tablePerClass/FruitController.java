package com.example.demo.controller.tablePerClass;

import java.util.List;

import com.example.demo.model.tablePerClass.Fruit;
import com.example.demo.repository.tablePerClass.FruitRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/fruit")
public class FruitController {

    FruitRepository fruitRepository;

    FruitController(FruitRepository fruitRepository) {
        this.fruitRepository = fruitRepository;
    }

    @GetMapping
    public List<Fruit> getAll() {
        return fruitRepository.findAll();
    }

    @PostMapping
    public Fruit post(@RequestBody Fruit fruit) {
        return fruitRepository.save(fruit);
    }
}
