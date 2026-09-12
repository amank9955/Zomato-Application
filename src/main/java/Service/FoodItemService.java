package com.zamato.zomatoapplication.service;

import com.zamato.zomatoapplication.model.FoodItem;
import com.zamato.zomatoapplication.repository.FoodItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodItemService {

    private final FoodItemRepository foodItemRepository;

    public FoodItemService(FoodItemRepository foodItemRepository) {
        this.foodItemRepository = foodItemRepository;
    }

    public List<FoodItem> getFoodItemsByRestaurantId(Long restaurantId) {
        return foodItemRepository.findByRestaurantId(restaurantId);
    }
}