package inheritance;
//simple example of inheritance(IS _A)
class Parents_Simple_Eg_IS_A {//parent class
	int marks=85;
}
class Simple_Eg_IS_A extends Parents_Simple_Eg_IS_A{//child class
	int Additional_percentage = 5;
	public static void main(String[] atgs) {
		Simple_Eg_IS_A obj = new Simple_Eg_IS_A();
		System.out.println("Total marks:"+(obj.marks+obj.Additional_percentage));
		
	}

}
