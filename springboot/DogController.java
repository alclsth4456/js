package com.LoversDogs.Lovers.controller;

import com.LoversDogs.Lovers.entity.DogForm;
import com.LoversDogs.Lovers.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/dogs")
public class DogController {

    @Autowired
    private DogService  dogService  ;

    @GetMapping("/byName/{name}")
    public Optional<DogForm> getDogByName(@PathVariable String name){
        return dogService.getDogByName(name);
    }

    @GetMapping("/dog/{id}")
    public List<DogForm> readAllDogs() {
        return dogService.readAllDogs();
    }

//    @PostMapping("/dog")
//    public DogDto createDog(@RequestBody DogDto dog) {
//
//        return dogService.saveDog(dog);
//    }

    @PutMapping("/dog/{id}")
    public DogForm updateDog(@PathVariable Long id, @RequestBody DogForm dog) {
        return dogService.updateDog(id, dog);
    }

    @DeleteMapping("/{id}")
    public void deleteDog(@PathVariable Long id) {

        dogService.deleteDog(id);
    }
}
