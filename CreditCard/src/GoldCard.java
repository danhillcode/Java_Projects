
public class GoldCard extends CreditCard {

	public int fee; 
	public int balance;
	//new variable
	
	public GoldCard  ( String Name,String AccountNumber, int Amount, int fee){
		super (Name,AccountNumber, Amount);
		//super goes after the first line of the constructor
		//dont need to decalre type e.g int etc.
		this.fee = fee;
		balance = getAmount() - fee;
		setAmount(balance);
	}
	
	public static void main (String[] args){
		GoldCard Tom = new GoldCard("Tom","123",9,9);
		//four params for the Goldcard
		CreditCard Jai = new CreditCard("Jai","632",9);
				//only need three params for creditcard
		System.out.println(Jai);
		System.out.println(Tom);
	}
	
}

//private variables can be access through getters and setters in inheritance
//interface is an abstract class so cannot be instanciated 
//classes can implement many interfaces 
//classes can only extend(inherit) one class
//java multiple inheritance is through class 1-> 2 2->3
