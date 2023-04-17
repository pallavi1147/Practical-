package array;

public class ArrayEg {
public static void main(String[] args) {
	int a[]=new int[5];//declaration & instantiation
	//initialization
	a[0]=2;
	a[1]=9;
	a[2]=5;
	a[3]=7;
	a[4]=1;
	//traversing(printing one after another) an array using for each loop
	System.out.println("Traversing an array by using for each loop");
	for(int i:a)
		System.out.println(i);
	//traversing(printing one after another) an array using for  loop
		System.out.println("Traversing an array by using for loop");
		for(int i=0;i<a.length;i++)//length is one of the property of an array
			System.out.println(a[i]);
	
}
}
