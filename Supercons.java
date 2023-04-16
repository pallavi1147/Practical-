package super_eg;
/*super keyword---reference variable which refer immediate parent class object
  (Tv,method,con)
  usage of super keyword
  refer immediate  parent class constructor*/
 class Shape2{//parent class
	 //Default constructor of parent class
	 Shape2()
	 {
		 System.out.println("Hello");
		 
	 }
 }
 class Size2{//child class
	 //Default constructor of child class
	 Size2()
	 {
		 //invoke immediate parent class constructor line no 7
	 super();
		 System.out.println("Hii");
	 }	 
	 }
 class Supercons {
public static void main(String[] args) {
	Size2 obj = new Size2();//creating obj of child class
}
}
 /*Super() is added in each class constructor automatically by comiler if there is no super()*/
