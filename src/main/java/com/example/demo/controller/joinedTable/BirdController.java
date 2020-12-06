package com.example.demo.controller.joinedTable;

import java.util.List;

import com.example.demo.model.joinedTable.Bird;
import com.example.demo.repository.joinedTable.BirdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/bird")
public class BirdController {

    @Autowired
    BirdRepository birdRepository;


    @PostMapping
    public Bird post(@RequestBody Bird bird) {
        return birdRepository.save(bird);
    }

    @GetMapping
    public List<Bird> getAll() {
        return birdRepository.findAll();
    }
}
