package Method;
import java.util.*;
public class User_defined2 {
  
	  public static void positive_or_not(int number) {
		  if(number>0) {
			  System.out.println("Positive");
		  }
		  else {
			  System.out.println("Negative");
		  }
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enetr the number:");
int number=sc.nextInt();
positive_or_not(number);

	}

}
