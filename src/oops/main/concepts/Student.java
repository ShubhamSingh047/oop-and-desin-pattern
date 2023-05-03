package oops.main.concepts;
import java.util.*;

public class Student extends Inheritance_Simple {
	static int r; 
	static String str;
	static void display() {
		Scanner s = new Scanner(System.in);
		r=s.nextInt();
		str=s.next();
		
	}
	public static void main(String[] args) {
		Student std = new Student();
		display();
		std.roll_num=r;
		std.name=str;
		std.Message();
	}

}
