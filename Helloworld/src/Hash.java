import java.util.HashMap;
import java.util.*;

public class Hash {
	public void A (HashMap<Integer,String> b)
	{
		for(Map.Entry<Integer,String> pairentry :b.entrySet()) {
		
			System.out.println(pairentry.getKey()+":"+pairentry.getValue());
		
			//for(Map.Entry i:b.entrySet())
		//{   
	//System.out.println(i.getkey()+i.getvalue());
		//}
		}
	}
	public static void main(String[] args) {
	   HashMap<Integer,String> map= new HashMap<Integer,String> ();
		   
	   map.put(24, "Sohail");
	   map.put(25, "Ankit");
	   map.put(26, "Garima");
	   map.put(27, "Pinki");
	   map.put(28, "A dilli");
	   map.put(29, "Sunita");
	   Hash C=new Hash();
	   C.A(map);
	   

	
	}
}
