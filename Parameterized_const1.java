package constructor;

public class Parameterized_const1 {
	int age;
	String name;
	int employeeID;
	//parameterized const where we have to pass the parameter/arguments
	Parameterized_const1(int a,String n,int b){
		age=a;
		name=n;
		employeeID=b;
	}
	void show() {
		System.out.println(age+" "+name+" "+employeeID);}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Parameterized_const1 d=new Parameterized_const1(20, "Pallavi",2345);
	Parameterized_const1 d1=new Parameterized_const1(23, "Rohini",3457);
	Parameterized_const1 d2=new Parameterized_const1(22, "Supriya",7867);
	Parameterized_const1 d3=new Parameterized_const1(26, "Riya",9767);
	Parameterized_const1 d4=new Parameterized_const1(32, "Pragati",7067);
	d.show();
	d1.show();
	d2.show();
	d3.show();
	d4.show();
		}
}
