package com.abbascoban.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abbascoban.model.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

}
