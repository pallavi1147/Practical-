package inheritance;
//multilevel inheritance
class A {//create class A
void print(){
	System.out.println("The class A");
}
}
class B extends A{ //create class B
	void show() {
		System.out.println("The class B");
	}
}
class C extends B{//create class C
	void display() {
		System.out.println("The class C");
	}
}

public class Multilevel_Eg2{
	public static void main(String [] args) {
		C c= new C();
		c.print();
		c.show();
		c.display();
	}
}