package abstraction;
interface Shape{
	void shape_name();//abstract method
	
}
class User_Circle implements Shape{
	@Override
	public void shape_name() {
		System.out.println("Draw a circle");
	
	}
}
class User_Triangle implements Shape{
	@Override
	public void shape_name() {
		System.out.println("Draw a triangle");
	
	}
}

public class InterfaceEg2 {
	public static void main(String[] args) {
		Shape object = new User_Triangle();
		object.shape_name();
	}

}
