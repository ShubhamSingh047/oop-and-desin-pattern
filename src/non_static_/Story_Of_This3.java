package non_static_;

public class Story_Of_This3 {
	int num;
	
	public Story_Of_This3() {
		// TODO Auto-generated constructor stub
		System.out.println("Defualt constructor");
//		this.num=10;
	}
	
	Story_Of_This3(int num){
		this();
		this.num=100;
	}
	
	public static void main(String[] args) {
		Story_Of_This3 Obj1 = new Story_Of_This3();
//		Obj1.num=20;
		System.out.println(Obj1.num);
	}
}
