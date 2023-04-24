package string;
public class ImmutableTest {
	public static void main(String[] args) {
		String str="Pallavi";
		str.concat("Chavan"); //insert the string at the end
		str=str.concat("Chavan"); //it will print the PallaviChavan
		//it will print only Pallavi because "string is immutable" 
		System.out.println(str);
	}

}

