import java.util.Scanner;

public class exercise_5_21 
{
	public static double loanAmt = 0;
	public static int loanPeriod = 0;
	public static void getInput ()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the loan amount: ");
		loanAmt = input.nextDouble();
		System.out.println("Enter the loan period: ");
		loanPeriod = input.nextInt();
		input.close();
	}
	public static void calculateInterest ()
	{
		double rate = 5.000;
		System.out.println("Interest Rate | Monthly Payment | Total Payment");
		while (rate <= 8)
		{
			double monthly = (loanAmt / (12 * loanPeriod)) + (loanAmt * (rate / 1200));
			double total = loanAmt + ((loanAmt * (rate / 1200) * 12 * loanPeriod));
			System.out.println(rate + "%          " + monthly + "            " + total);
			rate += 0.125;
		}
	}
	public static void main(String[] args) 
	{
		getInput();
		calculateInterest();
	}
}
