import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Account 
{
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private double monthlyRate = 0;
	private double monthInterest = 0;
	private int year, month, day;
	
	public Account() 
	{
		
	}
	public Account (int id, double balance)
	{
		this.id = id;
		this.balance = balance;
	}
	public void setDate()
	{
		Date date = new Date();
		LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		year = localDate.getYear();
		month = localDate.getMonthValue();
		day = localDate.getDayOfMonth();
	}
	public void setAnnualRate(double amount)
	{
		annualInterestRate = amount;
	}
	public void getMonthlyInterestRate()
	{
		monthlyRate = annualInterestRate / 1200;
	}
	public void getMonthlyInterest()
	{
		monthInterest = balance * monthlyRate;
	}
	public void withdraw (double amount)
	{
		balance -= amount;
	}
	public void deposit (double amount)
	{
		balance += amount;
	}
	public void accountBalance()
	{
		System.out.println("Current Balance on account " + id + " is : " + balance); 
	}
	public void printAccount()
	{
		System.out.println("Account ID: " + id);
		System.out.println("This account was created on " + month + " / " + day + " / " + year);
		System.out.println("Balance for account is: " + balance);
		System.out.println("Annual interest rate is: " + annualInterestRate);
		System.out.println("This months interest is: " + monthInterest);
	}
}
