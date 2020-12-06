package com.example.demo.model.tablePerClass;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) // создаются mango + orange + fruit таблицы
// но fruit - пустая???
public class Fruit {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE) // GenerationType.TABLE, не IDENTITY
    private int fruitId;
    private String size;
}
