package pgm1;

public class Customer {
	int custId;
	String custName;
	long custPhone;
	int countryCode;
	public void displayDetails(){
		System.out.println(custId+"\t"+custName+"\t"+custPhone+"\t"+countryCode);
	}

}
