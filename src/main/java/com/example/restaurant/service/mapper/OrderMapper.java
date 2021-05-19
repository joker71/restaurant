package com.example.restaurant.service.mapper;

import com.example.restaurant.Model.*;
import com.example.restaurant.service.dto.OderDTO;

import org.springframework.stereotype.Service;



import java.util.ArrayList;
import java.util.List;
public class OrderMapper {
    
    public Order DTOtoEntity(OderDTO dto)
    {
        if(dto==null) return null;
        else
        {
            Order entity= new Order();
            entity.setChef_id(dto.getChef_id());
            entity.setCreated_at(dto.getCreated_at());
            entity.setCustomer_id(dto.getCustomer_id());
            entity.setDescription(dto.getDescription());
            entity.setId(dto.getId());
            entity.setStatus(dto.getStatus());
            return entity;
        }
    } 
    
    public OderDTO enityTOderDTO(Order entity)
    {
        if(entity==null) return null;
        else{
            OderDTO dto= new OderDTO();
            dto.setChef_id(entity.getChef_id());
            dto.setCreated_at(entity.getCreated_at());
            dto.setCustomer_id(entity.getCustomer_id());
            dto.setDescription(entity.getDescription());
            dto.setId(entity.getId());
            dto.setStatus(entity.getStatus());
            return dto;
        }
    }
    public List<OderDTO> listOrderMapper(List<Order> list)
    {
        if(list==null) return null;
            List<OderDTO> dtoList= new ArrayList<>();
            list.forEach( entity -> dtoList.add(enityTOderDTO(entity)));
            return dtoList;
        
    }
}
