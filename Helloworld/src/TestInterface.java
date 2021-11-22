import java.util.*;
public class TestInterface {
	interface Drawable{  
		void draw();  
		static int cube(int x){return x*x*x;}  
		}  
	class Rectangle implements Drawable{ 
		public void draw(){System.out.println("drawing rectangle");} 
		} 
		class TestInterface{  
		public void main(String args[]){  
		Drawable d=new Rectangle();  
		d.draw();  
		System.out.println(Drawable.cube(3));  
		}
		}
}
