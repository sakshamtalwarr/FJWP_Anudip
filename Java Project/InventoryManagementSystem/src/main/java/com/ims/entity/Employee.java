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

public class Employee {
	private int empcode;
	private String empname;
	private String phone;
	private float salary;
	private String password;
	private int age;
	private String gender;
	
}