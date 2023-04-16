package abstraction;
//java 8 onwards, can have default method in an interface
interface Shape{
	void sides();//Abstract
	default void show() {//default method
		System.out.println("Default Method");
	}
	static int square (int a) {//static method
		return a*a;
	}
}
class Rectangle implements Shape{
	@Override
	public void sides() {
		System.out.println("Parent abstract method");
		
	}
}

public class InterfaceEg3 {
public static void main(String[] args) {
	Shape obj = new Rectangle();
	obj.show();//default method
	obj.sides();//abstract method
	
	System.out.println(Shape.square(2));

}
}
