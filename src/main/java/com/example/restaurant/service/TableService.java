package com.example.restaurant.service;

import com.example.restaurant.Model.TableE;
import com.example.restaurant.repository.TableRepository;
import com.example.restaurant.service.dto.TableDTO;
import com.example.restaurant.service.mapper.TableMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TableService {
    @Autowired
    private TableRepository tableRepository;
    @Autowired
    private TableMapper tableMapper;

    public List<TableE> listTable() {
        return tableRepository.findAll();
    }

    public TableDTO save(TableDTO dto) {
        TableE entity = tableMapper.toEntity(dto);
        entity = tableRepository.save(entity);
        return tableMapper.tabletoTableDTO(entity);
    }
}
