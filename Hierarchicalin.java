package inheritance;
//Hierarchical Inheritance
class Operating_System {//parent class A
	void Boost() {
		System.out.println("Boosting mode on");
	}
	}
class Windows extends Operating_System{//child class1
	void run() {
		System.out.println("Run mode on");
	}
	}
class Linux extends Operating_System{//child class 2
	void storage_capacity() {
		System.out.println("Storage capacity is very high");
	}
	}
public class Hierarchicalin{
	public static void main(String[] args) {
		Operating_System a = new Operating_System();
		a.Boost();
		Windows b= new Windows();
	
		b.run();
		Linux c = new Linux();
	
		c.storage_capacity();
	}
}
