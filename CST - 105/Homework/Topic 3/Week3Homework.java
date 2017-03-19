import java.util.Scanner;

public class Week3Homework 
{
	public static void chapter4question4_2()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter point 1 Latitude then Longitude in degrees: ");
		System.out.println("A positive value represents north and west coordinates, "
				+ "and a negative valiue represents south and east coordinates.");
		double x1 = Math.toRadians(input.nextDouble());
		double y1 = Math.toRadians(input.nextDouble());
		System.out.println("Enter point 2 Latitude then Longitude in degrees: ");
		System.out.println("A positive value represents north and west coordinates, "
				+ "and a negative valiue represents south and east coordinates.");
		double x2 = Math.toRadians(input.nextDouble());
		double y2 = Math.toRadians(input.nextDouble());
		input.close();
		double radius = 6371.01;
		double d = radius * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
		System.out.println("The distance between the two points is " + d + " km.");
	}
	public static void chapter4question4_11()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a decimal value (0 to 15): ");
		int i = input.nextInt();
		String hex = Integer.toHexString(i);
		System.out.println("The hex value is " + hex);
		input.close();
	}
	public static void chapter4question4_23()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the employee's name: ");
		String employee = input.next();
		System.out.print("Enter the number of hours worked this week: ");
		int hours = input.nextInt();
		System.out.print("Enter their hourly pay: ");
		double wages = input.nextDouble();
		System.out.print("Enter federal withholding rate as a percent: ");
		double federal = input.nextDouble();
		System.out.print("Enter the state withholding rate as a percent: ");
		double state = input.nextDouble();
		input.close();
		double grossPay;
		Boolean ot = false;
		if (hours > 40)
		{
			int overtime = hours - 40;
			grossPay = (wages * 40) + (overtime * (wages * 1.5));
			ot = true;
		}
		else
			grossPay = wages * hours;
		double federalHoldings = grossPay * (federal / 100);
		double stateHoldings = grossPay * (state / 100);
		double netPay = grossPay - federalHoldings - stateHoldings;
		System.out.println("Employee name: " + employee);
		System.out.println("Hours worked: " + hours);
		if (ot == true)
			System.out.println(employee + " worked overtime.");
		System.out.println("Payrate: " + wages);
		System.out.println("Gross pay: " + grossPay);
		System.out.println("Deductions: ");
		System.out.println("   Federal Withholdings: " + federalHoldings);
		System.out.println("   State Withholdings: " + stateHoldings);
		System.out.println("Net pay: " + netPay);
	}
	
	public static void displaySortedNumbers(double num1, double num2, double num3)
	{
		double [] array = {num1, num2, num3};
		
		double temp;
		int first, i, j;
		for (i = 2; i > 0; i--)
		{
			first = 0;
			for (j = 1; j <= i; j++)
			{
				if (array[i] < first)
					first = j;
			}
			temp = array[first];
			array[first] = array [i];
			array [i] = temp;
		}
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
	}
	public static void chapter6question6_5()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your three numbers: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		double z = input.nextDouble();
		input.close();
		displaySortedNumbers(x, y, z);
	}
	public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate)
	{
		investmentAmount *= (monthlyInterestRate / 100);
		return investmentAmount;
	}
	public static void chapter6question6_7()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your investment amount: ");
		double amount = input.nextDouble();
		System.out.println("Enter the interest rate as a percent: ");
		double rate = input.nextDouble();
		int years = 30;
		input.close();
		while (years > 0)
		{
			amount += futureInvestmentValue(amount, rate);
			System.out.println(amount);
			years--;
		}
	}
	public static void printChars (char ch1, char ch2, int numLine)
	{
		char [] storage = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o',
				+ 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 
				+ 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 
				+ 'X', 'Y', 'Z'};
		int count = 0;
		while (count < storage.length)
		{
			if (ch1 == storage[count])
				break;
			else
				count++;
		}
		int count2 = 1;
		while (count < storage.length)
		{
			System.out.print(storage[count] + " ");
			if (count2 % numLine == 0)
				System.out.print("\n" + storage[count] + " ");
		}
		
	}
	public static void chapter6question6_12()
	{
		printChars ('l', 'Z', 10);
	}
	
	public static void chapter18question18_2()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the index for the sequence that you wish to view: ");
		int n = input.nextInt();
		input.close();
		int currentFib = 0, f0 = 0, f1 = 1;
		for (int i = 1; i <= n; i++)
		{
			currentFib = f0 + f1;
			f0 = f1;
			f1 = currentFib;
		}
		System.out.println(currentFib);
	}
	public static void reverseDisplay(String value)
	{
		String value2 = new StringBuilder(value).reverse().toString();
		System.out.println(value2); 
	}
	public static void chapter18question18_9()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the string you wish to be reversed: ");
		String display = input.next();
		input.close();
		reverseDisplay(display);
	}
	
	public static void main(String[] args) 
	{
		//chapter4question4_2();
		//chapter4question4_11();
		//chapter4question4_23();
		//chapter6question6_3();
		//chapter6question6_5();
		//chapter6question6_7();
		//chapter6question6_12();
		//chapter6question6_18();
		//chapter6question6_31();
		//chapter18question18_2();
		//chapter18question18_9();
		//chapter18question18_10();
		//chapter18question18_15();
		//chapter18question18_17();
		//chapter18question18_25();
	}

}
