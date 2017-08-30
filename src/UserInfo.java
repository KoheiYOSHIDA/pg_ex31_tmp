
public class UserInfo implements User {
	String phoneNumber = "";
	
	UserInfo(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	
	
}
