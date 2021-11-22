
 class Final{

	void mNumber() {
		System.out.println("9769757619");
	}
	 final void atmpin() {
		System.out.println("6648");
		}
}
class theif extends Final {
	@Override
	void mNumber() {
		System.out.println("9769757619");
	}
	@Override
	 void atmpin() {
		System.out.println("6648");
		}
}
class Clas{

   public static void  main(String args[]) {
   theif t=new theif();
   t.mNumber();
   t.atmpin();
   
}
}
