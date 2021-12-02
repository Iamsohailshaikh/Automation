import java.util.*;
public class StringRev {

	
	public void Reverse(String str) {
		String reverse="";
	int length=str.length();
	for(int i=length-1;i>=0;i--) {
		reverse=reverse+str.charAt(i);
		
	}
	System.out.println("Reversed String is;"+reverse);
	}
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter a String");
	String orignal=input.nextLine();
	StringRev object = new StringRev();
	object.Reverse(orignal);
}
}