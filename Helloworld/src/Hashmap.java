import java.util.*; 
public class Hashmap{ 
public static void main(String args[]){  
   HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap    
   map.put(1,"Mango");  //Put elements in Map  
   map.put(2,"Apple");    
   map.put(3,"Banana");   
   map.put(4,"Grapes");   
       
   System.out.println("Iterating Hashmap...");  
   //for(int i=0;i<map.size();i++){    
   // System.out.println(map(i));  
   //for (Map.Entry<Integer, String> entry : map.entrySet()) {
	//	System.out.println(entry.getKey() + "   " + entry.getValue());
	
    System.out.println(map.toString())   ;
}
} 
//}
//}  
