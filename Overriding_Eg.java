package polymorphism;
class Exam{//parent class
	int marks() {//parent class method
		return 0;
		
	}
}
class comp extends Exam{//1st child class
	int marks() {//override method
		return 80;
	}
}
class math extends Exam{//2nd child class
	int marks() {//override method
		return 70;
	}
}
class science extends Exam{//3rd child class
	int marks() {//override method
		return 50;
	}
}
class eng extends Exam{//4th child class
	int marks() {//override method
		return 90;
	}
}
public class Overriding_Eg {
public static void main(String[] args) {
	comp c= new comp();
	math m = new math();
	science s = new science();
	eng e = new eng();
	System.out.println("computer marks is :"+c.marks());
	System.out.println("math marks is :"+m.marks());
	s.marks();
	e.marks();
	
}
}
