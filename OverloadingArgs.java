package polymorphism;
/*method Overloading - same name method
 two way we can overload the methods
  1.changing no. of arguments
  2.changing data type of arguments*/

public class OverloadingArgs {
	static int sum(int a, int b) {//two parameters/arguments
		return a+b;
	}
	static int sum(int x, int y, int z) {//three parameters/arguments
		return x+y+z;
	}
	public static void main(String[] args) {
		System.out.println(OverloadingArgs.sum(435,7));
		System.out.println(OverloadingArgs.sum(435,7,8));
		
	}

}
