//package coreJava;
import java.util.Date;
public class DateTime {

	public static void main(String[] args) {
		Date d= new Date();
		System.out.println(d.toGMTString());
		System.out.println(d.toString());
		System.out.println(d.toLocaleString());
	}

}
