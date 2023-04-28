package non_static_;

public class CopyConstructor {
	int a; String b;
	CopyConstructor(int a, String b) {
		// TODO Auto-generated constructor stub
		this.a=a;
		this.b=b;
		System.out.println(a+" "+b);
	}
	CopyConstructor(CopyConstructor ref) {
		// TODO Auto-generated constructor stub
		a=ref.a;
		b=ref.b;
		System.out.println(a+" ref "+b);
	}
	public static void main(String[] args) {
		CopyConstructor c = new CopyConstructor(2, "shubham");
		CopyConstructor c1 = new CopyConstructor(c);
	}
}
