package constructor;

public class Const_overload {
int age;
String name;
String adress;
//constructor one with two argument
Const_overload(int a,String n){
	age=a;
	name=n;
}
//constructor twowith three arguments
Const_overload(int a, String n,String ad){
	age=a;
	name=n;
	adress=ad;
}
public void show() {
	System.out.println("Name="+name+" Age="+age+" Adress="+adress);
}
public static void main(String[] args) {
	Const_overload ob= new Const_overload(24,"Riya");
	Const_overload ob1=new Const_overload(34,"Priya","Solapur");
	ob.show();
	ob1.show();
}
}
