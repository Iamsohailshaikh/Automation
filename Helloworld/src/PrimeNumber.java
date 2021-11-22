import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the size of array");
		  int n= sc.nextInt();
		 int []arr=new int[n];
		 System.out.println("Enter the Number");  
		 for( int i=0;i<n;i++) {
		  arr[i]=sc.nextInt();
		  
		}
		 System.out.println("Display the prime number");
		 for( int i=0;i<n;i++) {
			 if (arr[i]%2==1)
			  System.out.println(arr[i]);
		 }	  
}
}