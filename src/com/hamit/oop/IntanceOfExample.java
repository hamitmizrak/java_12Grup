package com.hamit.oop;

public class IntanceOfExample {

	public static void main(String[] args) {
		Student student44 = new Student();
		
		if(student44 instanceof Student) {
			System.out.println("student44 bu nesne Student'a aittir");
		}else {
			System.out.println("Ait değidlir.");
		}
	}
}
