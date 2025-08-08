package com.example.MotarMarketPro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MotarMarketPro.entity.SoldVehicleEntity;
import com.example.MotarMarketPro.entity.VehicleEntity;
import com.example.MotarMarketPro.repository.SoldVehicleRepo;
import com.example.MotarMarketPro.repository.VehicleRepo;

@Service
public class VehicleandsoldVehService {
	
		@Autowired
		private final VehicleRepo vehRepo;
		@Autowired
		private final SoldVehicleRepo soldRepo;
		
		public VehicleandsoldVehService(VehicleRepo vehRepo, SoldVehicleRepo soldRepo) {
			this.vehRepo = vehRepo;
			this.soldRepo = soldRepo;
		}

		//fetch vehicle by id
		  public VehicleEntity getVehicleById(int vehicle_id) {
			return vehRepo.findById(vehicle_id).orElse(null);
		  }
		 
		  //fetch all vehicle
		  public List<VehicleEntity> getAllVehicle(){
			  return vehRepo.findAll();
		  }
		 
		  // add new vehicle
		   public void addVehicle(VehicleEntity vehEn) {
			  try {
				  System.out.println("Service: Adding vehicle: " + vehEn);
				  VehicleEntity savedVehicle = vehRepo.save(vehEn);
				  System.out.println("Service: Vehicle saved successfully with ID: " + savedVehicle.getVehicle_id());
			  } catch (Exception e) {
				  System.err.println("Service: Error saving vehicle: " + e.getMessage());
				  e.printStackTrace();
				  throw e;
			  }
		  }
		 
		  //update vehicle
		  public void updateVehicle(VehicleEntity vehEn) {
			  vehRepo.save(vehEn);
		  }
		 
		  // delete vehicle by id
		  public void deleteVehicle(int vehicle_id) {
			  vehRepo.deleteById(vehicle_id);
		  }
		  
		
		  // add new soldVehicle
		   public void addSoldVehicle(SoldVehicleEntity soldEn) {
			  soldRepo.save(soldEn);
		  }

		 //fetch all sold vehicle
		  public List<SoldVehicleEntity> getAllSoldVehicle(){
			  return soldRepo.findAll();
		  }
} 