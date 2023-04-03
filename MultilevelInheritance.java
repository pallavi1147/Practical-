package inheritance;

public class MultilevelInheritance {
//main class
	public static void main(String[] args) {
		SIChild2 child = new SIChild2();//create a object of childclass2
		//by using child object we can use parent class method
		child.display();
		child.show();
		child.print();
	
	}

}
class SIParent1 {//parent class
	void show() {//parent class user defined method
		System.out.println("Show the details of parent class 1");
		
	}
}
//child class of SIParent1 & parent class of SIChild2
class SIChild1 extends SIParent1{//child class
	void display() {//child class user defined method
		System.out.println("Display the result of child class 1");
	}
}
class SIChild2 extends SIChild1{//child class
	void print() {//child class user defined method
		System.out.println("Print the output of child class 2");
	}
}


