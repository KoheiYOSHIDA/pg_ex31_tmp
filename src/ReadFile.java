import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
	
	final String CALUC_TOTAL_AND_CLEAR = "0";
	final String CRATE_NEW_MEMBER = "1";
	final String CREATE_NEW_PLAN = "2";
	final String RECORD_DETAIL = "5";
	final String INIT ="Initialization";
	
	User usr= new UserInfo(INIT);
	Plan bscpy=null,bscpyc1=null,bscpye1=null;
	CallPay call=null,callc1=null,calle1=null;

	public void readFile() {
		FileReader fr = null;
	    BufferedReader br = null;
	    String filePath = "/Users/koheiyoshida/eclipse-workspace/pg_ex31-1/src/record.log";
	    try {
	        fr = new FileReader(filePath);
	        br = new BufferedReader(fr);
	 
	        String line;
	        while ((line = br.readLine()) != null) {
	        		this.controller(line);
	        }
	    } catch (FileNotFoundException e) {
	        e.printStackTrace();
	    } catch (IOException e) {
	        e.printStackTrace();
	    } finally {
	        try {
	            br.close();
	            fr.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}
	
	public void controller(String line) {
		String[] str = line.split(" ");
		if(CALUC_TOTAL_AND_CLEAR.equals(str[0])) {
			if(INIT.equals(usr.getPhoneNumber())) {
				usr=null;
			} else {
				bscpy=null;bscpyc1=null;bscpye1=null;
				call=null;callc1=null;calle1=null;
				usr=null;
			}
		}
	}

}
