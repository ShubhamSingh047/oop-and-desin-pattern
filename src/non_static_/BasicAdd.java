package non_static_;

public class BasicAdd {
	static void add() {
		int a=10, b=12;
		System.out.println("add "+(a+b));
	}
	
	public static void main(String[] args) {
		add();
	}
}
