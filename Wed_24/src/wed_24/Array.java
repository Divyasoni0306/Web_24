package wed_24;
import java.util.Arrays;
public class Array {

	public static void main(String[] args) {
		int A[] = {2,4,5,3,6,7,9,4,5,6};
		int N = A.length;
		System.out.println("Length of Array :"+N);
		
		
//		printing subarray from index 2 to 6
		System.out.println("SubArray of the Array from index 2 to 6: ");
		for (int a=2; a<7; a++) {
			System.out.print(A[a]+" ");
		}
		System.out.println(" ");
		
		int max = 9;
		int max2 = A[0];
		System.out.println("max Element of array :"+max);//max of Array

				
		for (int i=2; i<7; i++) {
			if (A[i] < max && A[i]> max2) {
				max2 = A[i];

	         }
		}
		System.out.println( "Second max element of array from subarray: "+max2);// max of subarray
		
		
}
}
