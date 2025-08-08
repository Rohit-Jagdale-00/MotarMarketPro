package com.example.MotarMarketPro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.example.MotarMarketPro.entity.SoldVehicleEntity;
import com.example.MotarMarketPro.entity.VehicleEntity;
import com.example.MotarMarketPro.service.VehicleandsoldVehService;

@RestController
@RequestMapping("api/vehicle")
public class VehicleRestController {

		@Autowired
		private final VehicleandsoldVehService vehSer;

		public VehicleRestController(VehicleandsoldVehService vehSer) {
			this.vehSer = vehSer;
		}
		// Vehicle
		@GetMapping("/test")
		public String test() {
			return "API is working!";
		}
		
		@GetMapping("/allvehicle")
		public List<VehicleEntity> listVehicle(){
			return vehSer.getAllVehicle();
		}
		// Sold Vehicle
		@GetMapping("/allsoldvehicle")
		public List<SoldVehicleEntity> listsoldVehicle(){
		return vehSer.getAllSoldVehicle();
		}
				
		@PostMapping("/addvehicle")
		public VehicleEntity saveVeh(@RequestBody VehicleEntity veh) {
			try {
				System.out.println("Received vehicle data: " + veh);
				vehSer.addVehicle(veh);
				System.out.println("Vehicle added successfully with ID: " + veh.getVehicle_id());
				return veh;
			} catch (Exception e) {
				System.err.println("Error adding vehicle: " + e.getMessage());
				e.printStackTrace();
				throw e;
			}
		}
		
		@PostMapping("/addSoldvehicle")
		public SoldVehicleEntity saveSoldVeh(@RequestBody SoldVehicleEntity soldveh) {
			vehSer.addSoldVehicle(soldveh);
			return soldveh;  
		}
		
		@GetMapping("/{id}")
		public VehicleEntity getVehicleById(@PathVariable("id") int id) {
			VehicleEntity v=vehSer.getVehicleById(id);
			if(v!=null) {
				System.out.println("Vehicle :"+v);
				return v;
			}
			throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Vehicle with "+id+" not found");
		}
		
		@PutMapping("/update/{id}")
		public VehicleEntity updateVehicle(@PathVariable("id") int id,@RequestBody VehicleEntity veh) {
			VehicleEntity existVeh=vehSer.getVehicleById(id);
			if(existVeh!=null) {
				existVeh.setVehicle_id(veh.getVehicle_id());
				existVeh.setVehicle_type(veh.getVehicle_type());
				existVeh.setManufacturer(veh.getManufacturer());
				existVeh.setModel(veh.getModel());
				existVeh.setFuel_type(veh.getFuel_type());
				existVeh.setOwnership(veh.getOwnership());
				existVeh.setReg_data(veh.getReg_data());
				existVeh.setVeh_number(veh.getVeh_number());
				existVeh.setPrice(veh.getPrice());
			    vehSer.updateVehicle(existVeh);
			    return existVeh;
	      	}
			return null;
	     }
		
		@DeleteMapping("/delete/{id}")
		public String deleteVeh(@PathVariable("id") int id) {
			VehicleEntity existVeh = vehSer.getVehicleById(id);
			if(existVeh != null) {
				vehSer.deleteVehicle(id);
				return "Vehicle with " + id + " deleted Successfully";
			}
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Vehicle with " + id + " not found");
		}
	}

