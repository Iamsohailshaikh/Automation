
 class Inherit{
	public void App() {
		System.out.println("Salary is 24000");
	}
	}

 class Sum extends Inherit
{ 
	public void Apple() {
		//App();
		System.out.println("Salary is 24770");
	}
	

public static void  main(String args[]) {

	//System.out.println("bnous is 5000");
	Sum ABB =new Sum();
	
	ABB.App();
	ABB.Apple();
	System.out.println("bnous is 5000");
}

}

