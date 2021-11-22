import java.util.Arrays; 
public class AddArray {

	public static void main(String[] args) {
		int[] firstArray = {3,55,42,78,4,90,1};   
		int[] secondArray = {77,16,42,13,62,56,3};
		int Farray = firstArray.length;       
		int Sarray = secondArray.length;   
		int[] result = new int[Farray+Sarray];  
		System.arraycopy(firstArray, 0, result, 0, Farray);  
		System.arraycopy(secondArray, 0, result, Farray, Sarray);  
		System.out.println(Arrays.toString(result));    
		
	}

}
