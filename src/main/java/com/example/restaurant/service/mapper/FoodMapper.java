package com.example.restaurant.service.mapper;

import com.example.restaurant.Model.Food;
import com.example.restaurant.service.dto.FoodDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoodMapper {

    public Food foodDTOtoFood(FoodDTO dto) {
        if (dto == null) {
            return null;
        } else {
            Food entity = new Food();
            entity.setId(dto.getId());
            entity.setName(dto.getName());
            entity.setDescription(dto.getDescription());
            entity.setFood_img(dto.getFood_img());
            entity.setPrice(dto.getPrice());
            entity.setRate(dto.getRate());
            entity.setFood_vote_quantity(dto.getFood_vote_quantity());
            entity.setFood_last_vote(dto.getFood_last_vote());
            entity.setCreated_at(dto.getCreated_at());
            entity.setCreated_by(dto.getCreated_by());
            entity.setFood_category_id(dto.getFood_category_id());
            return entity;
        }
    }

    public FoodDTO foodtoFoodDTO(Food entity) {
        if (entity == null) {
            return null;
        } else {
            FoodDTO dto = new FoodDTO();
            dto.setId(entity.getId());
            dto.setName(entity.getName());
            dto.setDescription(entity.getDescription());
            dto.setFood_img(entity.getFood_img());
            dto.setPrice(entity.getPrice());
            dto.setRate(entity.getRate());
            dto.setFood_vote_quantity(entity.getFood_vote_quantity());
            dto.setFood_last_vote(entity.getFood_last_vote());
            dto.setCreated_at(entity.getCreated_at());
            dto.setCreated_by(entity.getCreated_by());
            dto.setFood_category_id(entity.getFood_category_id());
            return dto;
        }
    }

    public List<FoodDTO> listFoodMapper(List<Food> food) {
        if (food == null) {
            return null;
        }

        List<FoodDTO> list = new ArrayList<>();
        food.forEach(f -> list.add(foodtoFoodDTO(f)));

        return list;
    }
}
