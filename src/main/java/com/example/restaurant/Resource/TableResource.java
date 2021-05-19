package com.example.restaurant.Resource;


import com.example.restaurant.Model.TableE;
import com.example.restaurant.service.TableService;
import com.example.restaurant.service.dto.TableDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins= "http://localhost:4200")
public class TableResource {
    @Autowired
    private TableService tableService;

    @GetMapping("/get-table")
    public List<TableE> listTable() {
        return tableService.listTable();
    }

    @PostMapping("/post-table")
    public TableDTO postTable(@RequestBody TableDTO dto) {
        return tableService.save(dto);
    }
}
