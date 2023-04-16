package abstraction;
//Multiple Inheritance
interface Vehicle{//parent interface A
	void running();
	interface Heavy_vehicle{//parent interface b
		void capacity();
	}
	class car implements Vehicle,Heavy_vehicle{//child class C
		void speed() {//child class own method
			System.out.println("Car speed is very high");
		}
		@Override
		public void capacity() {
			System.out.println("2nd parent interface method");
		}
		@Override
		public void running() {
			System.out.println("1st parent interface method");
	}
}
public class MultipleIn {
	public static void main(String[] args) {
		car d = new car();//object of child class car
		d.capacity();//child class method
		d.running();
			d.speed();
	}
}

}
