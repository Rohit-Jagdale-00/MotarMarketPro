package com.example.MotarMarketPro.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "vehicle")
public class VehicleEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int vehicle_id;
	
	@Column(name = "vehicle_type")
	private String vehicle_type;
	
	@Column(name = "manufacturer")
	private String manufacturer;
	
	@Column(name = "model")
	private String model;
	
	@Column(name = "fuel_type")
	private String fuel_type;
	
	@Column(name = "ownership")
	private String ownership;
	
	@Column(name = "reg_data")
	private String reg_data;
	
	@Column(name = "veh_number")
	private String veh_number;
	
	@Column(name = "price")
	private double price;
	
	public VehicleEntity() {
	}
	
	public VehicleEntity(int vehicle_id, String vehicle_type, String manufacturer, String model, String fuel_type,
			String ownership, String reg_data, String veh_number, double price) {
		this.vehicle_id = vehicle_id;
		this.vehicle_type = vehicle_type;
		this.manufacturer = manufacturer;
		this.model = model;
		this.fuel_type = fuel_type;
		this.ownership = ownership;
		this.reg_data = reg_data;
		this.veh_number = veh_number;
		this.price = price;
	}
	
	public int getVehicle_id() {
		return vehicle_id;
	}
	public void setVehicle_id(int vehicle_id) {
		this.vehicle_id = vehicle_id;
	}
	public String getVehicle_type() {
		return vehicle_type;
	}
	public void setVehicle_type(String vehicle_type) {
		this.vehicle_type = vehicle_type;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getFuel_type() {
		return fuel_type;
	}
	public void setFuel_type(String fuel_type) {
		this.fuel_type = fuel_type;
	}
	public String getOwnership() {
		return ownership;
	}
	public void setOwnership(String ownership) {
		this.ownership = ownership;
	}
	public String getReg_data() {
		return reg_data;
	}
	public void setReg_data(String reg_data) {
		this.reg_data = reg_data;
	}
	public String getVeh_number() {
		return veh_number;
	}
	public void setVeh_number(String veh_number) {
		this.veh_number = veh_number;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "VehicleEntity [vehicle_id=" + vehicle_id + ", vehicle_type=" + vehicle_type + ", manufacturer="
				+ manufacturer + ", model=" + model + ", fuel_type=" + fuel_type + ", ownership=" + ownership
				+ ", reg_data=" + reg_data + ", veh_number=" + veh_number + ", price=" + price + "]";
	}
} 