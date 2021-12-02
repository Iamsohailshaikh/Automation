import java.util.Scanner;
public class Index {
		  
		  public static void India(String str) {
			  
		 System.out.println("The characters of  string are =" +str)  ;
		  int index1=str.charAt(0);
		  int index2=str.charAt(6);
		   System.out.println("The character is at "+ (char)index1);
		    System.out.println("The character is at "+ (char)index2);
		  
		  }
		  public static void main(String[] args) {
		 // India("PalindromeString");
	
	 
	 Scanner in=new Scanner(System.in);
	 System.out.println("Enter a string ");  
	String orignal= in.nextLine();
	India(orignal);
		  }

}
