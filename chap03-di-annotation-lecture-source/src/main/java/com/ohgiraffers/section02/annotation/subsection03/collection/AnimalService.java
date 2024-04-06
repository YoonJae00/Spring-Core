package com.ohgiraffers.section02.annotation.subsection03.collection;

import com.ohgiraffers.section02.common.Animal;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("animalCollection")
public class AnimalService {

    private List<Animal> animalList;


    public AnimalService(List<Animal> animalList) {
        this.animalList = animalList;
    }

    public void animalEat(){
        for(Animal animal : animalList){
            animal.eat();
        }
    }
}
