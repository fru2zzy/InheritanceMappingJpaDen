package com.example.demo.controller.singleTable;

import java.util.List;

import com.example.demo.model.singleTable.Pen;
import com.example.demo.repository.singleTable.PenRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pen")
public class PenController {

    PenRepository penRepository;

    PenController(PenRepository penRepository) {
        this.penRepository = penRepository;
    }

    @GetMapping
    public List<Pen> getAll() {
        return penRepository.findAll();
    }

    @PostMapping
    public Pen post(@RequestBody Pen pen) {
        return penRepository.save(pen);
    }
}
