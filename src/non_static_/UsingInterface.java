package non_static_;

import java.util.Scanner;

public class UsingInterface implements Basic1 {
	String name; Double sal; 
	
	public void input() {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter your name:- ");
		name = s1.nextLine();
		System.out.println("Enter your salary:- ");
		sal =s1.nextDouble();
	}
	public void output() {
		System.out.println("Yout Name is "+name);
		System.out.println("Yout Salary is "+sal);
	}
	public static void main(String[] args) {
		Basic1 v = new UsingInterface();
		v.input();
		v.output();
	}
}
