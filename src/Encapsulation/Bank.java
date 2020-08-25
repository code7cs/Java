package Encapsulation;

public class Bank {
	private int accono;
	private String bankname;
	private String ifsccode;

	public int getAccono() {
		return accono;
	}

	public void setAccono(int accono) {
		this.accono = accono;
	}

	public String getBankname() {
		return bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	public String getIfsccode() {
		return ifsccode;
	}

	public void setIfsccode(String ifsccode) {
		this.ifsccode = ifsccode;
	}
}
