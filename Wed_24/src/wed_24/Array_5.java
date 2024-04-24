package wed_24;
import java.util.Scanner;
public class Array_5 {

	public static void main(String[] args) {
		int A[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 Number:");
		for(int i=0; i<5; i++) {
			A[i] = sc.nextInt();//or taking inputs from user
			}
		System.out.println("The Array formed is: ");
		for(int i=0; i<5; i++) {
			System.out.print(A[i]+" ");//printing array elements
		}

	}

}
