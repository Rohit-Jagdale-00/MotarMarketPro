package com.example.MotarMarketPro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.MotarMarketPro.entity.VehicleEntity;

@Repository
public interface VehicleRepo extends JpaRepository<VehicleEntity, Integer> {

} 