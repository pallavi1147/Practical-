package constructor;

public class Parameterizedconst {
int age;
String name;
//parameterized const where we have to pass the parameter/arguments
Parameterizedconst(int age,String name){
	this.age=age;
	this.name=name;
}
void show() {
	System.out.println(age+" "+name);}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Parameterizedconst d=new Parameterizedconst(20, "Pallavi");
Parameterizedconst d1=new Parameterizedconst(23, "Rohini");
Parameterizedconst d2=new Parameterizedconst(22, "Supriya");
d.show();
d1.show();
d2.show();
	}

}
