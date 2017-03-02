
public class Invoice {
	
	private String accountNumber;
	private String sortCode;
	private double amount; 
	
	public Invoice (String AccountNumber, String SortCode,double Amount) {
		this.accountNumber = AccountNumber;
		this.sortCode = SortCode;
		this.amount = Amount;
	}
	
	public double getMeasure(){
		return this.amount;
	}
	
	//Your implementations may be minimal so that they just provide implementations to the Measurable 
	//interface so that getMeasure() returns the amount and the weight, respectively.
}
