
public class SavingsAccount extends AccountExample{

	public void withdraw (double withdrawAmount){
		if (withdrawAmount <= getBalance()){
			withdraw(withdrawAmount);
		}
		else
			System.out.println("Insufficient Funds.");
	}
}
