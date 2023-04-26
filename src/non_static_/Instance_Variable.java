package non_static_;

public class Instance_Variable {
	int width;
	int height;
	int depth;
	
	public int Volume() {
		return height*width*depth;
	}
	
	public void Assign(int w, int h, int d) {
		width=w;
		height=h;
		depth=d;
	}
}
