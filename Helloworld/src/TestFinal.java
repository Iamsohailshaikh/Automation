
class Fine{
void mNumber()
{
	System.out.println("9769757619");
}
 final void atmpin() {
	System.out.println("8887");

}
}
class Theif extends Fine {
	
	void mNumber() {
		System.out.println("9769757619");
	}
	
	void atmpin() {
		System.out.println("8887");
	}
}
class TestFinal{
	public static void main(String[] args) {
		Theif t=new Theif();
		t.mNumber();
				t.atmpin();
	}
}

