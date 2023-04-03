package inheritance;
	//Multilevel Inheritance
	 class Vehicle {//parent class A
		void running() {
			System.out.println("Running mode on");
		}
		}
	class Car extends Vehicle {//child class B whoose parent  class is vehicle
		void run() {
			System.out.println("Car run mode on");
		}
		}
	class I10 extends Car {//child class C whose parent class is Car
		void Speed() {
			System.out.println("Speed is very high");
		}
		}
	public class Multilevelin{
		public static void main(String[] args) {
			I10 d= new I10();//creating obj
			d.running();
			d.run();
			d.Speed();
		}
	}


