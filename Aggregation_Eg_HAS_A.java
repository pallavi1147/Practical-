package inheritance;

public class Aggregation_Eg_HAS_A {
public static void main(String[] args) {
	Address a = new Address("Jath","Sangli","India");
	Student s = new Student(01,"Pallavi",a);
	s.show();
}
}
