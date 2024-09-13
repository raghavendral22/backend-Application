package com.springrest.springrest.entity;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="loads")
public class Load {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int shipperId;
	
	public int getShipperId() {
		return shipperId;
	}
	public void setShipperId(int shipperId) {
		this.shipperId = shipperId;
	}
	public String getLoadingPoint() {
		return loadingPoint;
	}
	public void setLoadingPoint(String loadingPoint) {
		this.loadingPoint = loadingPoint;
	}
	public String getUnloadingPoint() {
		return unloadingPoint;
	}
	public void setUnloadingPoint(String unloadingPoint) {
		this.unloadingPoint = unloadingPoint;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getTruckType() {
		return truckType;
	}
	public void setTruckType(String truckType) {
		this.truckType = truckType;
	}
	public String getNoOfTrucks() {
		return noOfTrucks;
	}
	public void setNoOfTrucks(String noOfTrucks) {
		this.noOfTrucks = noOfTrucks;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getOptional() {
		return optional;
	}
	public void setOptional(String optional) {
		this.optional = optional;
	}
	
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	@JsonFormat(pattern="dd-MM-YYYY",shape=Shape.STRING)
	@Column(name="date")
    private String Date;
    
	


	@Column(name="loading_Point")
	private String loadingPoint;
	@Column(name="unloading_Point")
	private String unloadingPoint;
	@Column(name="product_Type")
	private String productType;
	@Column(name="truct_Type")
	private String truckType;
	@Column(name="noOf_Trucks")
	private String noOfTrucks;
	@Column(name="Weight")
	private String weight;
	@Column(name="Optional")
	private String optional;
	
	}
	
	
	
	
	
	
	
	
	


