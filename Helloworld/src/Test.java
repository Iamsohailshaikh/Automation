
import java.util.*;
 

class Test{
 
    public static void main(String args[])
    {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Sohail");
        al.add("Shaikh");
 
        // Here we are mentioning the index
        // at which it is to be added
        al.add(1, "Zahid");
 
        // Printing all the elements in an ArrayList
        System.out.println(al);
    }
}