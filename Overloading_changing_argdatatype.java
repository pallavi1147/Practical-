package polymorphism;
/*method Overloading - same name method
two way we can overload the methods
 1.changing no. of arguments
 2.changing data type of arguments*/


public class Overloading_changing_argdatatype {

	static int sum(int a, int b) {// integer type arguments
		return a+b;
	}
	//double type arguments
	static double sum(double a, double b) {//three parameters/arguments
		return a+b;
	}
	public static void main(String[] args) {
		System.out.println(Overloading_changing_argdatatype.sum(435,7));
		System.out.println(Overloading_changing_argdatatype.sum(435,7.9));
		
	}
}
