package com.example.MotarMarketPro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.MotarMarketPro.entity.SoldVehicleEntity;

@Repository
public interface SoldVehicleRepo extends JpaRepository<SoldVehicleEntity, Integer> {

} 