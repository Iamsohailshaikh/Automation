import java.util.HashSet; 
import java.util.*;
class HashSet1{  
	public void Apple(HashSet D) 
	{
		Iterator<String> i=D.iterator();  
	
         while(i.hasNext())  
         {  
         System.out.println(i.next());  
        }
	}	
	
 public static void main(String args[]){  
  //Creating HashSet and adding elements  
    HashSet<String> set=new HashSet<String>();
           set.add("Sohail");    
           set.add("Sunita");    
           set.add("babu");   
           set.add("Pinki");  
           set.add("Ankit");  
           HashSet1 Ab= new HashSet1();
           Ab.Apple(set);
       //   Iterator<String> i=set.iterator();  
         //  while(i.hasNext())  
           //{  
           //System.out.println(i.next());  
           //}  
 }  
}  
 