import java.util.*;
 class Room {
	int length,breadth; Room(int L , int B){
		length =L;
		breadth =B;
	}
	int area() {

		return(length*breadth);
		}
	}
class BedRoom1 extends Room{
	int height;
	BedRoom1(int x,int y,int z){
		super (x,y);
		height=z;
	}
	int volume () {
		return(length*breadth*height);
	}
	}
	class InherTest extends BedRoom1{
		public static void main (String args[])
		{
			InherTest Room1= new InherTest();
			int area1=Room1.Room(10,20);
			int volume1=Room1.volume();
			System.out.println("Area="+area1);
			System.out.println("Volume="+volume1);
		}
	}
	