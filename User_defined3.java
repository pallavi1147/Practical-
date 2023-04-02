package Method;
import java.util.*;
public class User_defined3 {
public static void main(String args[]) {
	//creating the object
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Three Numbers");
	int a= sc.nextInt();
		int b= sc.nextInt();
			int c= sc.nextInt();
			System.out.println("Sum is" + (a+b+c));
			System.out.println("Average is " + (a+b+c)/3.0);
}
}
