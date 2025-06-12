package com.ims.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Product 
{
	private int pid;
	private String pname;
	private int qty;
	private float costprice;
	private float sellingprice;
	private String description;
}
