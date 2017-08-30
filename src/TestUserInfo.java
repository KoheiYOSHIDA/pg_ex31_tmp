import static org.junit.Assert.*;

import org.junit.Test;

public class TestUserInfo {

	
	@Test
	public void testGetPhoneNumber() {
		User usr = new UserInfo("090-1234-0001");
		assertEquals("090-1234-0001",usr.getPhoneNumber());
	}
	

}
