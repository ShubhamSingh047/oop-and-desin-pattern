package non_static_;

public class Story_Of_This {
	
	void show() {
		System.out.println(this + " this keyword");
	}
	public static void main(String[] args) {
		Story_Of_This Obj1 = new Story_Of_This();
		System.out.println(" "+ Obj1 + " object one");
		Obj1.show();
	}
}
