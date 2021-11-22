class C
{
	private int value;
	public void setValue(int x)
	{
		value=x;
	}
	
  public int getValue()
  {
	  return value;
	//  System.out.println(r.getValue());
	 // r.setValue(100);
  }
}
 class Encaps
 {
public static void main(String args[]) {
	C r=new C ();
	r.setValue(100);
	System.out.println(r.getValue());
}
}
