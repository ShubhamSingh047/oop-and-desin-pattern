package non_static_;

public class Non_Static_variable {
	//non static variable;
	int num;

	
	//constructor
	Non_Static_variable(){
		System.out.println("this is is constructor as the name "
				+ "is same as class and does not have a return type");
		System.out.println(num);
	}
	
	
	//Non Static block
	{
		System.out.println("Non static block");
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		System.out.println("inside main");
		new Non_Static_variable();
	}
}
