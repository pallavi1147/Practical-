package inheritance;

public class SingleInheritance {//main mathod
	
	public static void main(String[] args) {
		SIChild child = new SIChild();//create a object of childclass
		//by using child object we can use parent class method
		child.display();
		child.show();
	
	}

}
class SIParent {//parent class
	void show() {//parent class user defined method
		System.out.println("Show the details of parent class");
		
	}
}
class SIChild extends SIParent{//child class
	void display() {//child class user defined method
		System.out.println("Display the result of child class");
	}
}