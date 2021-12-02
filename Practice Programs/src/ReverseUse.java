import java.util.Scanner;

public class ReverseUse {
	
	public static String Reverse(String str) {
		new StringBuilder(str).reverse().toString();
	System.out.println("the reverse string is:" +str);
	return "hello";
}
	public static void main(String[] args) {
		Scanner Orignal=new Scanner(System.in);
		System.out.println("Enter a String");
	String input=Orignal.nextLine();
	Reverse(input);
		

	}

}
