
import java.util.ArrayList;
public class Constrat {
	//public void ArrayList() {
   // Constrat(int arr[])
    Constrat(ArrayList val)
	{
    	
  // ArrayList<Integer> arrlist = new ArrayList<Integer>();

    	for (int i=0;i<val.size();i++) {
    	//for (int i=0;i<arrlist.size();i++) {
    		System.out.println(val.get(i));
    	}
    }
    	Constrat(int ab[]){
    		for (int i=0;i<ab.length;i++) 
    		{
    			System.out.println(ab[i]);
    		}
    	}
    
public static void main(String args[]) {
	
	 ArrayList<Integer> arrlist = new ArrayList<Integer>();
	 arrlist.add(5);
	 arrlist.add(45);
	 arrlist.add(556);
	 arrlist.add(55);
	 arrlist.add(533);
	 int ar[]= {45,3,5,7,8,2,46,356,3,7,47,88};
	Constrat pen=new Constrat(arrlist);
	Constrat ABB=new Constrat(ar);
}
}

