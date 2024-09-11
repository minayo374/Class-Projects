
public class Customer extends Person {
	private int customerNum;
	private boolean mailList;
	Customer(){
		super("", "", "");
		customerNum = 0;
		mailList = false;
	}
	Customer(String n, String add, String ph, int cnum, boolean m){
		super(n, add, ph);
		customerNum = cnum;
		mailList = m;
	}
	public int getCustomerNum() {
		return customerNum;
	}
	public void setCustomerNum(int customerNum) {
		this.customerNum = customerNum;
	}
	public boolean isMailList() {
		return mailList;
	}
	public void setMailList(boolean mailList) {
		this.mailList = mailList;
	}
	public String toString() {
		return super.toString() + " " + getCustomerNum() + " " + isMailList(); 
	}
}
