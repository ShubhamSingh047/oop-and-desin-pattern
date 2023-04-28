package non_static_;

public class DataHidding {
	private int amt = 1000;
	private String username="Shubham";
	private String password ="psd";
	
	public void ShowAmt(String username, String password) {
		if(this.username.equals(username) && this.password.equals(password)) {
			System.out.println(amt);
		}else {
			System.out.println("Incorrect pasword ");
		}
	}
}
