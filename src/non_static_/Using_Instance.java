package non_static_;

public class Using_Instance {
	
	public static void main(String[] args) {
		Instance_Variable obj1= new Instance_Variable();
		int vol;
		
		obj1.Assign(10,20,30);
		vol=obj1.Volume();
		System.out.println("Main function calling instance varible and volume is "+vol);
	}
}
