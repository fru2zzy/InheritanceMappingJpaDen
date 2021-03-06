package com.example.demo.controller.mappedSuperclass;

import java.util.List;

import com.example.demo.model.mappedSuperclass.Bus;
import com.example.demo.repository.mappedSuperclass.BusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/bus")
public class BusController {

    @Autowired
    BusRepository busRepository;

    @GetMapping
    public List<Bus> getAll() {
        return busRepository.findAll();
    }

    @PostMapping
    public Bus post(@RequestBody Bus bus) {
        return busRepository.save(bus);
    }
}
