
public class CreditCard {

	public String name;
	public String accountNumber;
	public int amount;
	
	public CreditCard(String Name,String AccountNumber, int Amount){
		this.name = Name;
		this.accountNumber = AccountNumber;
		this.amount = Amount;
		
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "CreditCard [name=" + name + ", accountNumber=" + accountNumber + ", amount=" + amount + "]";
	}
	
	
	
	
}
