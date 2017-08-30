import static org.junit.Assert.*;

import org.junit.Test;

public class TestInputFile {

	String Expected = "";
	
	@Test
	public void testReadFile() {
		ReadFile fb = new ReadFile();
		fb.readFile();
//		assertEquals(Expected,fb.readFile());
	}

}
