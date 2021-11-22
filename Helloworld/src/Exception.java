public class Exception{  
  
	
	public void Expect(int a ,int b)
	{
		int data;
		
		 try{  
			 data=a/b;
		   }catch(ArithmeticException e)
		   {
			   System.out.println(e);
			   }  
		   
		   System.out.println("rest of the code...");  
	}
	
	public static void main(String args[]){  
		Exception AB= new Exception();
		AB.Expect(120, 0);
	}
	}