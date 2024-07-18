package com.LoversDogs.Lovers.repository;


import com.LoversDogs.Lovers.entity.DogForm;
//import com.LoversDogs.Lovers.dto.DogForm;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Optional;

public interface DogRepository extends JpaRepository<DogForm,Long> {
Optional<DogForm> findByName(String name);

}
