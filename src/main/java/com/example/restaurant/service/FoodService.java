package com.example.restaurant.service;

import com.example.restaurant.Model.Food;
import com.example.restaurant.exception.ResourceNotFoundException;
import com.example.restaurant.repository.FoodRepository;
import com.example.restaurant.service.dto.FoodDTO;
import com.example.restaurant.service.mapper.FoodMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
@Transactional
public class FoodService {
    @Autowired
    private FoodRepository foodRepository;
    @Autowired
    private FoodMapper foodMapper;

    @Transactional(readOnly = true)
    public List<FoodDTO> getAllFood(){
        return  foodMapper.listFoodMapper(foodRepository.findAll());
    }
    public FoodDTO getFoodById(Long id) throws ResourceNotFoundException
    {
       Food entity= this.foodRepository.findById(id).orElseThrow(() ->new ResourceNotFoundException("book id is not found: " + id));
       return this.foodMapper.foodtoFoodDTO(entity);
    }
    public  FoodDTO addFood(FoodDTO dto){
       Food entity= foodMapper.foodDTOtoFood(dto);
       entity= foodRepository.save(entity);
       return foodMapper.foodtoFoodDTO(entity);
    }
    public FoodDTO putFood(FoodDTO dto){
        Food entity= this.foodMapper.foodDTOtoFood(dto);
        entity= this.foodRepository.save(entity);
        return this.foodMapper.foodtoFoodDTO(entity);
    }
   public Map<String, Boolean> deleteFood(Long  foodid) throws ResourceNotFoundException
   {
       Food food= this.foodRepository.findById(foodid).orElseThrow(() ->new ResourceNotFoundException("book id is not found: " + foodid));
       this.foodRepository.delete(food);
       Map<String, Boolean> response= new HashMap<>();
       response.put("delete", Boolean.TRUE);
       return response;
   }
}
