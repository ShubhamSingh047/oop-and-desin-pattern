package non_static_;

public class Story_Of_This2 {
	int num;
	Story_Of_This2(int num) {
		/*
		 * below this keyword help JVM/compiler to understand which this keyword 
		 * to point !
		 * otherwise JVM always tends to point to instance keyword in case of same 
		 * name ! 
		 * 
		 */
//		this.num=num;
		num =num;
	}
	
	public static void main(String[] args) {
		Story_Of_This2 Obj1 = new Story_Of_This2(100);
		System.out.println(Obj1.num);
	}
}
