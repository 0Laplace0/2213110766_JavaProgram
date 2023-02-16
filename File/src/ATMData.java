
public class ATMData {

	private String accountNumber, password;
	
	public ATMData(String accNum, String pass) {
		accountNumber = accNum;
		password = pass;
		
	}
	
	public String getID() {
		return this.accountNumber;
	}
	
	public String getPass() {
		return this.password;
	}
}
