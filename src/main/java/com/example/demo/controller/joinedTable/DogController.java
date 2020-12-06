package com.example.demo.controller.joinedTable;

import java.util.List;

import com.example.demo.model.joinedTable.Dog;
import com.example.demo.repository.joinedTable.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/dog")
public class DogController {

    @Autowired
    DogRepository dogRepository;


    @PostMapping
    public Dog post(@RequestBody Dog dog) {
        return dogRepository.save(dog);
    }

    @GetMapping
    public List<Dog> getAll() {
        return dogRepository.findAll();
    }
}
