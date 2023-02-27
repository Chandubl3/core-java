package com.xworkz.icecream.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "icecream_table")
@Data
public class IceCreamEntity {

	@Column(name = "ic_id")
	@Id
	private int id;
	
	@Column(name = "ic_name")
	private String name;
	
	@Column(name = "ic_brandName")
	private String brandName;
	
	@Column(name = "ic_color")
	private String color;
	
	@Column(name = "ic_type")
	private String type;
	
	@Column(name = "ic_price")
	private double price;
}
