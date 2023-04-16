package super_eg;
/*super keyword---reference variable which refer immediate parent class object
(Tv,method,con)
usage of super keyword
refer immediate  parent class constructor*/
//by using super keyword we can use parent class data member
class Shape{//parent class
	String name = "circle";//data member of parent class
}
class Size extends Shape{//child class
	String name = "No Size";//datamember of child class
	void print() {//child class method
		System.out.println(name);
		//it represent child class)
		System.out.println(super.name);
	}
}
class SuperTv {
public static void main(String[] args) {
	Size obj= new Size();
	obj.print();
}
}
