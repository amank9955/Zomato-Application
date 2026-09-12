package com.zamato.zomatoapplication.controller;

import com.zamato.zomatoapplication.service.RestaurantService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private final RestaurantService restaurantService;

    public HomeController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    @GetMapping("/")
    public String home(Model model) {

        model.addAttribute(
                "restaurants",
                restaurantService.getAllRestaurants()
        );

        return "index";
    }
}