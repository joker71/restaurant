package com.example.restaurant.repository;

import com.example.restaurant.Model.TableE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TableRepository extends JpaRepository<TableE, Long> {
    
}