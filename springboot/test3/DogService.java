package com.LoversDogs.Lovers.service;

import com.LoversDogs.Lovers.entity.DogForm;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface DogService {

    public List<DogForm> readAllDogs();
    public DogForm updateDog(Long id, DogForm dog);
    public void deleteDog(Long id);
    public DogForm saveDog(DogForm dog);
    public Optional<DogForm> getDogByName(String name);
  //  List<DogDto> getDog(String name);


}
