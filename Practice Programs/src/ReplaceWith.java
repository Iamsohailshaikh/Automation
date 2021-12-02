import java.util.*;
public class ReplaceWith {

	public void replace (String str) {
		String alphabetS="abcdefghijklmnopqrstuvwxyz";
		StringBuilder Alpha=new StringBuilder(str);
		
		for (int i=0,relativePosition=0;i<str.length();i++,relativePosition++) 
		{
		char currChar=str.charAt(i);
		if (currChar==' ') {relativePosition=-1;continue;}
		int idx=alphabetS.indexOf(currChar);
		if (idx!=-1)
			if(relativePosition%2==1)
				Alpha.setCharAt(i,'c');
		}
		System.out.println(Alpha);
	}
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter a Sting");
		String orignal = input.nextLine();
		ReplaceWith Change=new ReplaceWith();
		Change.replace(orignal);
	}

}
