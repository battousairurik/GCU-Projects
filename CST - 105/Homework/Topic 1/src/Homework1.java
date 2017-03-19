import java.util.Scanner;
public class Homework1 {

	public static void chapter1question1_4()
	{
		System.out.println("a  a^2  a^3");
		int a = 1;
		while (a < 5)
		{
			double b = Math.pow(a, 2);
			double c = Math.pow(a, 3);
			System.out.println(a + "  " + b + "  " + c);
			a++;
		}
	}
	public static void chapter1question1_7()
	{
		 double result = 1;
         double denominator = 1;
         double change = 1;
         int iteration1 = 6;
         int iteration2 = 7;
         while (iteration1 > 0)
         {
             change *= -1;
             denominator += 2;
             result += (change / denominator);
             iteration1--;
         }
         System.out.print("Pi through 6 iterations is : "); 
         System.out.print(4*result);
         System.out.println(" "); 
         result = 1;
         denominator = 1;
         change = 1;
         while (iteration2 > 0)
         {
             change *= -1;
             denominator += 2;
             result += (change / denominator);
             iteration2--;
         }
         System.out.print("Pi through 7 iterations is : ");
         System.out.print(4*result);
	}
	public static void chapter1question1_8()
	{
		double radius = 5.5;
		System.out.println("The perimeter of the circle is: " + (2*radius*Math.PI)); 
		System.out.println("The Radius of the circle is: " + (radius*radius*Math.PI)); 
	}
	public static void chapter1question1_10()
	{
		double kilometers = 14;
		double miles = kilometers / 1.6;
		double minutes = 45.5;
		double hour = minutes / 60;
		System.out.println("The runners average MPH is: " + (miles/hour)); 
	}
	public static void chapter1question1_11()
	{
		int population = 312032486;
		double seconds = (24*60*60);
		double births = seconds / 7;
		double deaths = - (seconds / 13);
		double immigrants = seconds / 45;
		double change = births + deaths + immigrants;
		int x = 1;
		while (x < 6)
		{
			population += change;
			System.out.println("The population after " + x + " years of growth will be: " + population); 
			x++;
		}
	}
	public static void chapter1question1_13()
	{
		
	}
	public static void chapter2question2_4()
	{
		Scanner pounds = new Scanner (System.in);
		System.out.println("Please enter the pounds you would like to convert: ");
		double pound = pounds.nextDouble();
		double kilograms = pound * 0.454;
		System.out.println(pound + " pounds is " + kilograms + " kilograms.");
		pounds.close();
	}
	public static void chapter2question2_5()
	{
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter the Subtotal for the bill: ");
		double subtotal = input.nextDouble();
		System.out.println("Enter the percent of gratuity that you would like to pay: ");
		double gratuity = input.nextDouble();
		input.close();
		double tip = subtotal * (gratuity / 100);
		double total = subtotal + tip;
		System.out.println("Your Gratuity for the bill is " + tip + " and your total is " + total);
	}
	public static void chapter2question2_20()
	{
		Scanner input = new Scanner (System.in);
		System.out.println("What is the balance for your account? : ");
		double balance = input.nextDouble();
		System.out.println("What is the yearly interest rate? : ");
		double rate = input.nextDouble();
		input.close();
		double interest = balance * (rate/1200);
		System.out.println("The monthly interest is : " + interest);
	}
	public static void chapter2question2_23()
	{
		
	}
	public static void chapter4question4_2()
	{
		
	}
	public static void chapter4question4_17()
	{
		
	}
	public static void chapter4question4_22()
	{
		
	}
	public static void chapter24question24_1()
	{
		
	}
	public static void chapter24question24_4()
	{
		
	}
	public static void main(String[] args) 
	{
		//chapter1question1_4();
		//chapter1question1_7();
		//chapter1question1_8();
		//chapter1question1_10();
		//chapter1question1_11();
		
		//chapter2question2_4();
		//chapter2question2_5();
		//chapter2question2_20();
		
		//chapter4question4_2();
		
	}

}
