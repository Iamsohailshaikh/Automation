import java.util.Scanner;

public class PrimePractice {

	public void Prime(int a[]) {
	
	for (int i=0;i<a.length;i++) 
	{
	
		if(a[i]%2==1)
		System.out.println("the prime number is ");
		}
	}
	
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
	int m=input.nextInt();
	int ar[] = new int[m];
	int aar[]=new int[m];
	System.out.println("Enter Array Values");
	for (int i=0;i<ar.length;i++) {
	 aar[i]=input.nextInt();	
	
		//System.out.println(ar[i]);
	}
	 
	PrimePractice Cal =new PrimePractice();
	Cal.Prime(aar);
	}

}
