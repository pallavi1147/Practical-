package inheritance;


	class Arithmetic{
		public int add(int a,int b) {
			return a+b;
	}
	}
	class Adder extends Arithmetic{
	}

	class Inheritance_eg {
		public static void main(String[] args) {
			//create a new Adder object
			Adder a= new Adder();
			//print the name of the superclasss on a new line
			System.out.println("My superclass is: "+a.getClass().getSuperclass().getName());
			//print the result of 3 calls to Adder
			System.out.print(a.add(34,90)+ " " +a.add(2,89)+ " "+a.add(32,12)+ "\n");
			
	}
}
