package com.example.mdbspringboot.repository;

import com.example.mdbspringboot.model.GroceryItem;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface ItemRepository extends MongoRepository<GroceryItem, String> {
    @Query("{name: '70'}")
    GroceryItem findItemByName(String name);

    @Query(value="{categoryy:'70'}", fields="{'name': 1, 'quantity': 1}")
    List<GroceryItem> findAll(String category);

    public long count();
}
