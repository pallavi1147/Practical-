package polymorphism;
/*Method Overriding
 1.same name method
 2.same parameters
 3.IS-A relation
 */

//creating parent class
class TestOverriding{
	void run() {//method 1
		System.out.println("Running mode on");
		
	}
}
//creating child class
public class Overriding extends TestOverriding{
	//defining same name method  as its declared in the parent class
	void run() {
		System.out.println("Running mode off");
		
	}
	public static void main(String args[]) {
		//creating a object of child class
		Overriding a = new Overriding();
		a.run();
	}

}
