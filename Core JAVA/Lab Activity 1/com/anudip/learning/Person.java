package com.anudip.learning;

public class Person
{
     String name = "saksham";
     int age = 21;
     int salary = 35000;
    
        public static void main(String[] args) {
            Person person = new Person();
            System.out.println("Test Succesfull!");

            System.out.println("Name: " + person.name);
            System.out.println("Age: " + person.age);
            System.out.println("Salary: " + person.salary);
        }
}