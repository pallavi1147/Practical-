package com.cognizant.shapes;

import java.util.Scanner;

public class Circle {
		private float radius;//declaring instance variable radius
		static float pi=3.5f;
		//default constructor
		Circle() {
			radius=1.5f;
		}
		//const2
		Circle(float radius) {
			this.radius=radius;
			
		}
		//const3
		Circle(float radius,float pi) {
			//const chaining using const2
			this.radius=radius;
		}
		//method1
		static float calculateCircleArea(float radius) {
			return pi*radius*radius;
		}
		//method2
		static float calculateCircumference(float radius) {
			return 2*pi*radius;
		}
		public static void main(String[] args) {
			Circle obj= new Circle();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the radius");
		}

	}


