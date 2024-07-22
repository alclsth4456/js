package com.LoversDogs.Lovers.service;

import com.LoversDogs.Lovers.entity.DogForm;
import com.LoversDogs.Lovers.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DogServiceImpl implements DogService {
    @Autowired
    private DogRepository dogRepository;



    @Override
    public List<DogForm> readAllDogs() {
        return dogRepository.findAll();
    }


    @Override
    public DogForm updateDog(Long id, DogForm dog) {
        Optional<DogForm> odog = dogRepository.findById(id);
//        if (!optionalDog.isPresent()) {
//            // Handle not found case, e.g., log it or return a default value
//            throw new RuntimeException("Dog not found");
//        }
        if(!odog.isPresent()) {
            throw new RuntimeException("Dog not found");
        }else {
            DogForm newdog = odog.get();
            dog.setId(id);
            newdog.setName(dog.getName());
            newdog.setAge(dog.getAge());
            newdog.setGender(dog.getGender());
            newdog.setSpecial(dog.getSpecial());
            newdog.setVaccination(dog.getVaccination());
            newdog.setNeutered(dog.getNeutered());
            newdog.setReason(dog.getReason());
            newdog.setNoticeNumber(dog.getNoticeNumber());


            return dogRepository.save(newdog);
    }
      //  return null;
  }

    @Override
    public void deleteDog(Long id) {
        dogRepository.deleteById(id);
    }

    @Override
    public DogForm saveDog(DogForm dog) {
        return dogRepository.save(dog);
    }

    @Override
    public Optional<DogForm> getDogByName(String name) {
        Optional<DogForm> optionalDog = dogRepository.findByName(name);
        if(!optionalDog.isPresent()) {
            throw new RuntimeException("Dog not found");
        }
            return optionalDog;

    }
//        return dogRepository.findByName(name);


    //public DogDto getDog(String name) {
    //    Optional<DogDto> optionalDog = dogRepository.findByName(name);
//        if (!optionalDog.isPresent()) {
//            // Handle not found case, e.g., log it or return a default value
//            throw new RuntimeException("Dog not found");
//        } return optionalDog.get();
      //  return dogRepository.findByName(name).isPre(() -> new RuntimeException("Dog not found"));
  //  }

}