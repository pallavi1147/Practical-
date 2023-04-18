package array;
public class DuplicateNumber{
	
    public static void main(String[] args) {
    	
    	int[] arr = {6,8,9,5,7, 2, 4, 5, 7, 8};
    	System.out.println("The actual array is:");
    	for(int i:arr)//for each loop for print 
    	System.out.println(i);
    	
    	// Find duplicates in the array
        for (int i=0; i<arr.length-1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("The Duplicate numbers in an Array is: " + arr[i]);


    }
}
}
        }
    }
    

