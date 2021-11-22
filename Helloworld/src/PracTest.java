import java.util.ArrayList;
public class PracTest {
	public void A(ArrayList b) {
		 
     for (int i=0;i<b.size();i++) {
     ///	for(int i:) {
		System.out.println(b.get(i));
		}
	}
	public void B(int a[]) {
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
 
	public static void main(String[] args) {
		ArrayList<Integer> al= new ArrayList<Integer> ();
		al.add(34);
		al.add(546);
		al.add(542);
		al.add(13);
		int arr[]= {35,67,86,157,9,9,6,6,55,9};
		
		PracTest CB = new PracTest();
		PracTest CA = new PracTest();
			CB.A(al);
			CA.B(arr);
			
		}

	}

