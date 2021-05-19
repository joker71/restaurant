package com.example.restaurant.Resource;

import com.example.restaurant.exception.ResourceNotFoundException;
import com.example.restaurant.service.FoodService;
import com.example.restaurant.service.dto.FoodDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/api")
@CrossOrigin(origins= "http://localhost:4200")
public class FoodResource {
    @Autowired
    private FoodService foodService;
    @GetMapping("/get-food")
    public List<FoodDTO> getAllFood(){
        return foodService.getAllFood();
    }
    @GetMapping("/get-food/{id}")
    public FoodDTO findById(@PathVariable(value="id") long foodid) throws ResourceNotFoundException {
        return this.foodService.getFoodById(foodid);
    }
    @CrossOrigin(origins= "http://localhost:4200")
    @PostMapping("/add-food")
    public FoodDTO postFood(@RequestBody FoodDTO dto){
        return this.foodService.addFood(dto);
    }
    @PutMapping("/put-food")
    public  FoodDTO putFoot(@RequestBody FoodDTO dto){
        return  this.foodService.putFood(dto);
    }
   @DeleteMapping("/delete-food/{id}")
   public Map<String, Boolean> deleteFoofbyId(@PathVariable(value="id") long foodid) throws ResourceNotFoundException
   {
       return this.foodService.deleteFood(foodid);
   }

}
