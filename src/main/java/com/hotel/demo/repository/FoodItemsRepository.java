package com.hotel.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.hotel.demo.model.FoodItems;

@Repository
public interface FoodItemsRepository extends MongoRepository<FoodItems, Integer> {

	@Query(value="{item_id : ?0}", delete = true)
	void deleteByItemId(Integer item_id);
	

}
