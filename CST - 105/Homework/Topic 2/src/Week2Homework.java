import java.util.Random;
import java.util.Scanner;
import java.io.*;
public class Week2Homework 
{
	public static void chapter3question3_2()
	{
		char playagain;
		Scanner input = new Scanner(System.in);
		do 
		{
			int num1 = (int)(System.currentTimeMillis() % 10); 
			int num2 = (int)(System.currentTimeMillis() / 7 % 10);
			int num3 = (int)(System.currentTimeMillis() / 4 % 10);
			
			System.out.println("What is " + num1 + " + " + num2 + " + " + num3 + " ?");
			int answer = input.nextInt();
			System.out.println(num1 + " + " + num2 + " + " + num3 + " = " + answer + " is " 
					+ (num1 + num2 + num3 == answer));
			System.out.println("Would you like to play again? y/n");
			playagain = input.next().charAt(0);
			
		} while (playagain == 'y' || playagain == 'Y');
		input.close();
	}
	public static void chapter3question3_3()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the X value, Y value, and Solution for equation 1.");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double e = input.nextDouble();
		System.out.println("Then Enter the X value, Y value, and Solution for equation 2.");
		double c = input.nextDouble();
		double d = input.nextDouble();
		double f = input.nextDouble();
		input.close();
		double solutionx = ((e * d) - (b * f)) / ((a * d) - (b * c));
		double solutiony = ((e * d) - (b * f)) / ((a * d) - (b * c));
		double comparison = (a * d) - (b * c);
		if (comparison == 0)
			System.out.println("There is no solution.");
		else
			System.out.println("X is " + solutionx + " and Y is " + solutiony);
	}
	public static void chapter3question3_4()
	{
		Random rMonth = new Random();
		int selection = rMonth.nextInt(12) + 1;
		String month = null;
		switch (selection)
		{
			case 1: month = "January";
				break;
			case 2: month = "February";
				break;
			case 3: month = "March";
				break;
			case 4: month = "April";
				break;
			case 5: month = "May";
				break;
			case 6: month = "June";
				break;
			case 7: month = "July";
				break;
			case 8: month = "August";
				break;
			case 9: month = "September";
				break;
			case 10: month = "October";
				break;
			case 11: month = "November";
				break;
			case 12: month = "December";
				break;
		}
		System.out.println("The month is " + month);
	}
	
	public static void chapter3question3_12()
	{
		Scanner input = new Scanner(System.in);
		int selection = 0;
		while (selection < 100 || selection > 999)
		{
			System.out.println("Please enter your three digit integer: ");
			selection = input.nextInt();
			if (selection < 100 || selection > 999)
				System.out.println("Invalid entry, please try again.");
			
		}
		input.close();
		int comparison = selection;
		int hundred = 0, ten = 0, one = 0;
		while (comparison > 0)
		{
			while (comparison >= 100)
			{
				comparison -= 100;
				hundred++;
			}
			while (comparison >= 10)
			{
				comparison -= 10;
				ten++;
			}
			while (comparison > 0)
			{
				comparison -= 1;
				one++;
			}
		}
		if (hundred == one)
			System.out.println(selection + " is a palindrome.");
		else
			System.out.println(selection + " is not a palindrome.");
	}
	public static void chapter3question3_13()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("(0-single filer, 1-married jointly or " 
			+"qualifying widow(er), 2-married separately, 3-head of " 
			+"household) Enter the filing status: " );
		int status = input.nextInt();
		System.out.println("Enter the taxable income: ");
		double income = input.nextDouble();
		input.close();
		double tax = 0;
		if (status == 0)
		{
			if (income <= 8350)
				tax = income * 0.10;
			else if (income <= 33950)
				tax = 8350 * 0.10 
				+ (income - 8350) * 0.15;
			else if (income <= 82250)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 
				 + (income - 33950) * 0.25;
			else if (income <= 171550)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 
				+ (82250 - 33950) * 0.25 + (income - 82250) * 0.28;
			else if (income <= 372950)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 
				+ (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 
				+ (income - 171550) * 0.33;
			else 
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 
				+ (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 
				+ (372950 - 171550) * 0.33 + (income - 372950) * 0.35; 
		}
		else if (status == 1)
		{
			if (income <= 16700)
				tax = income * 0.10;
			else if (income <= 67900)
				tax = 16700 * 0.10
				+ (income - 16700) * 0.15;
			else if (income <= 137050)
				tax = 16700 * 0.10 + (67900 - 16700) * 0.15
				+ (income - 67900) * 0.25;
			else if (income <= 208850)
				tax = 16700 * 0.10 + (67900 - 16700) * 0.15
				+ (137050 - 67900) * 0.25 + (income - 137050) * 0.28;
			else if (income <= 372950)
				tax = 16700 * 0.10 + (67900 - 16700) * 0.15
				+ (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28
				+ (income - 208850) * 0.33;
			else 
				tax = 16700 * 0.10 + (67900 - 16700) * 0.15
				+ (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28
				+ (372950 - 208850) * 0.33 + (income - 372950) * 0.35;
			
		}
		else if (status == 2)
		{
			if (income <= 8350)
				tax = income * 0.10;
			else if (income <= 33950)
				tax = 8350 * 0.10 + (income - 8350) * 0.15;
			else if (income <= 68525)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15
				+ (income - 33950) * 0.25;
			else if (income <= 104425)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15
				+ (68525 - 33950) * 0.25 + (income - 68525) + 0.28;
			else if (income <= 186475)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15
				+ (68525 - 33950) * 0.25 + (104425 - 68525) + 0.28
				+ (income - 104425) * 0.33;
			else
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15
				+ (68525 - 33950) * 0.25 + (104425 - 68525) + 0.28
				+ (186475 - 104425) * 0.33 + (income - 186475) * 0.35;
		}
		else if (status == 3)
		{
			if (income <= 11950)
				tax = income * 0.10;
			else if (income <= 45500)
				tax = 11950 * 0.10 + (income - 11950) * 0.15;
			else if (income <= 117450)
				tax = 11950 * 0.10 + (45500 - 11950) * 0.15
				+ (income - 45500) * 0.25;
			else if (income <= 190200)
				tax = 11950 * 0.10 + (45500 - 11950) * 0.15
				+ (117450 - 45500) * 0.25 + (income - 117450) * 0.28;
			else if (income <= 372950)
				tax = 11950 * 0.10 + (45500 - 11950) * 0.15
				+ (117450 - 45500) * 0.25 + (190200 - 117450) * 0.28
				+ (income - 190200) * 0.33;
			else
				tax = 11950 * 0.10 + (45500 - 11950) * 0.15
				+ (117450 - 45500) * 0.25 + (190200 - 117450) * 0.28
				+ (372950 - 190200) * 0.33 + (income - 372950) * 0.35;
		}
		else
		{
			System.out.println("Error: Invalid Status.");
			System.exit(1);
		}
		System.out.println("Tax is " + (int) (tax * 100) / 100);
	}
	
	public static void chapter9question9_2()
	{
		Stock firststock = new Stock ("ORCL", "Oracle Corperation");
		firststock.previousClosingPrice = 34.5;
		firststock.currentPrice = 34.35;
		firststock.getChangePercent();
		firststock.displayStock();
	}
	public static void chapter9question9_6()
	{
		int [] selection = new int [100000];
		stopWatch watch1 = new stopWatch();
		int x = 0;
		Random ranNum = new Random();
		while (x < 100000)
		{
			selection[x] = ranNum.nextInt();
			x++;
		}
		watch1.start();
		int i, j, first, temp;
		for (i = 99999; i > 0; i--)
		{
			first = 0;
			for (j = 1; j <= i; j++)
			{
				if (selection[i] < first)
					first = j;
			}
			temp = selection[first];
			selection[first] = selection [i];
			selection [i] = temp;
		}
		watch1.stop();
		System.out.println("Elapsed time is : " + watch1.getElapsedTime() + " seconds.");
		
	}
	public static void chapter9question9_7()
	{
		Account testAccount = new Account (1122, 20000);
		testAccount.setAnnualRate(4.5);
		testAccount.setDate();
		testAccount.withdraw(2500);
		testAccount.accountBalance();
		testAccount.deposit(3000);
		testAccount.accountBalance();
		testAccount.getMonthlyInterestRate();
		testAccount.getMonthlyInterest();
		testAccount.printAccount();
	}
	
	public static void main(String[] args)
	{
		//chapter3question3_2();
		//chapter3question3_3();
		//chapter3question3_4();
		//chapter3question3_5();
		//chapter3question3_12();
		//chapter3question3_13();
		//chapter3question3_17();
		//chapter3question3_18();
		//chapter3question3_26();
		//chapter3question3_29();
		//chapter3question3_33();
		//chapter9question9_2();
		//chapter9question9_6();
		//chapter9question9_7();
		//chapter9question9_10();
		//chapter9question9_13();
	}

}
