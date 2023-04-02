//we are not creating any constructor so compiler provides us a default cons
// 0 and null default values provided by default cons	
package constructor;

public class Default_const2 {
int s1_no;
String Name; 
void result(){
	System.out.println(s1_no+" "+Name);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Default_const2 obj = new Default_const2();
System.out.println(obj.s1_no+" "+obj.Name);
	}

}
