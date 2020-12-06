package com.example.demo.controller.joinedTable;

import java.util.List;
import java.util.stream.Collectors;

import com.example.demo.model.joinedTable.Animal;
import com.example.demo.model.joinedTable.Bird;
import com.example.demo.model.joinedTable.Dog;
import com.example.demo.repository.joinedTable.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/animal")
public class AnimalController {

    @Autowired
    AnimalRepository animalRepository;

    @GetMapping
    public List<Animal> getAll() {
        return animalRepository.findAll();
    }

    @PostMapping
    public Animal post(@RequestBody Animal animal) {
        return animalRepository.save(animal);
    }

    @PostMapping(value = "/bird")
    public Bird post(@RequestBody Bird bird) {
        return animalRepository.save(bird);
    }

    @PostMapping(value = "/dog")
    public Dog post(@RequestBody Dog dog) {
        return animalRepository.save(dog);
    }

    @GetMapping(value = "/birds")
    public List<Bird> getBirds() {
        List<Animal> allAnimals = animalRepository.findAll();
        return allAnimals.stream()
                         .filter(animal -> animal instanceof Bird)
                         .map(animal -> (Bird) animal)
                         .collect(Collectors.toList());
    }

    @GetMapping(value = "/dogs")
    public List<Dog> getDogs() {
        List<Animal> allAnimals = animalRepository.findAll();
        return allAnimals.stream()
                         .filter(animal -> animal instanceof Dog)
                         .map(animal -> (Dog) animal)
                         .collect(Collectors.toList());
    }
}
