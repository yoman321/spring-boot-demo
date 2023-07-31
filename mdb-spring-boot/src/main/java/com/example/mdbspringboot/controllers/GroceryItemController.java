package com.example.mdbspringboot.controllers;

import com.example.mdbspringboot.services.GroceryItemService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GroceryItemController {

    @GetMapping("/groceryItem")
    public GroceryItemService groceryItem (@RequestParam(defaultValue = "id") String name){
        return new GroceryItemService(1, "cucumber", 12, "vegetable");
    }
}
