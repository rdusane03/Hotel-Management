package com.hotel.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotel.demo.model.FoodItems;


@Repository
public interface FoodItemsRepository extends JpaRepository<FoodItems, Integer> {

}
