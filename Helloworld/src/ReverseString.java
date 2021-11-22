

	public class ReverseString {
		public static void abc() { 
		  
		    
		    String S1 = "Football is life";
		    String reversedString = "";
		    
		    for(int i = S1.length()-1; i>=0; i=i-1)
		    {
		      reversedString = reversedString + S1.charAt(i);
		    }
		    
		    System.out.print("The reversed string of the '"+S1+"' is: " );
		    System.out.println(reversedString);
		  }
		public static void main(String[] args) {
             abc();
             
		}
}