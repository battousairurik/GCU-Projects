
public class CheckingAccount extends AccountExample{

	public void withdraw (double withdrawAmount){
		if (getBalance() > 0){
			withdraw(withdrawAmount);
		}
		if (getBalance() < 0){
			System.out.println("You have overdrafted by " + getBalance() + " amount.");
		}
		else
			System.out.println("Insufficient Funds.");
	}
	public static void main(String[] args){
		AccountExample account1 = new CheckingAccount();
		account1.setBalance(3000);
		//Not Working correctly
		account1.withdraw(3500);
		AccountExample account2 = new SavingsAccount();
		account2.setBalance(2500);
		//The classes are not mutating correctly.
	}
}
