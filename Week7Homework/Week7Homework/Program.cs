using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
namespace Explanation 
{
    /*
    Chapter 3: 16
        Write a C# program to find the minimum of a sequence of nonnegative numbers en-tered by the user, 
        where the user enters a negative number to terminate the input.

    Chapter 3: 22
        Generalize Exercise 21 by having the user enter the interest rate, the initial balance, and the final balance. 
        Write a C# program to calculate the number of years it will take be-fore the account balance reaches the specified final balance.

        Suppose you have an account that earns 5% interest that is credited to your account at the end of each year. 
        Write a C# program to calculate the number of years it will takebefore the account balance is at least $2000 
        if the initial account balance is $1000. 

    Chapter 3: 24
        Generalize Exercise 23 by having the user input the annual inflation rate, the cost ofthe item, and the number of years. 
        Write a C# program that outputs the cost of that itemafter the specified number of years. 

        Suppose an annual inflation rate of 4%. Because of inflation, an item that costs $1.00today will cost $1.04 one year from now. 
        (We assume, for simplicity, that the item weconsider will rise in price exactly at the rate of inflation.) 
        Write a C# program that in-puts the cost of an item and outputs its cost three years from now. 

    Chapter 4: 26
        Calculate pi using the series
        pi / 4 = 1 - 1/3 + 1/5 - 1/7 + 1/9 - ... and so on.
        Output the estimate of pi after computing 100, 1000, 10,000, and 100,000 terms of the series. 
    */
}

namespace Week7Homework
{
    class Program
    {
        static void chapter_3_ex_16() 
        {
            int size = 1;
            int[] minimum = new int [size];
            try {
                for (int i = 0; i < size; i++)
                {
                    Console.WriteLine("Please enter your input.");
                    int holder = Convert.ToInt32(Console.ReadLine());
                    if (holder > 0)
                        minimum[i] = holder;
                    if (minimum[i] > 0)
                    {
                        size++;
                        Array.Resize(ref minimum, minimum.Length + 1);
                    }
                }
            }
            catch (Exception)
            {
                Console.WriteLine("There was an error, please try again.");
            }
            Console.WriteLine(minimum.Min());
            Console.ReadLine();
        }
        static void chapter_3_ex_22()
        {
            Console.WriteLine("What is your initial Balance?");
            double initial = Convert.ToDouble(Console.ReadLine());
            Console.WriteLine("What interest rate would you like to use?");
            double rate = Convert.ToDouble(Console.ReadLine());
            Console.WriteLine("What amount would you like to end up with?");
            double final = Convert.ToDouble(Console.ReadLine());
            int years = 0;
            while (initial < final)
            {
                initial += initial * (rate / 100);
                years++;
            }
            Console.WriteLine("It will take you {0} years to achieve this balance.", years);
            Console.ReadLine();
        }
        static void chapter_3_ex_24()
        {
            double initial = 0;
            double rate = 0;
            int years = 0;
            tryagain:
            Console.WriteLine("what is the cost of the item?");
            try
            {
                initial = Convert.ToDouble(Console.ReadLine());
            }
            catch (Exception)
            {
                Console.WriteLine("Invalid input, please try again");
                goto tryagain;
            }
            tryagain2:
            Console.WriteLine("What is the rate of inflation?");
            try
            {
                rate = Convert.ToDouble(Console.ReadLine());
            }
            catch (Exception)
            {
                Console.WriteLine("Invalid input, please try again");
                goto tryagain2;
            }
            tryagain3:
            Console.WriteLine("How many years from now would you like to know the inflation cost for?");
            try
            {
                years = Convert.ToInt32(Console.ReadLine());
            }
            catch (Exception)
            {
                Console.WriteLine("Invalid input, please try again");
                goto tryagain3;
            }
            double final = 0;
            int loop = years;
            while (loop > 0)
            {
                initial += (rate / 100);
                loop--;
            }
            final = initial;
            Console.WriteLine("Your cost is {0} after {1} years of inflation.", final, years);
            Console.ReadLine();
        }
        static void chapter_4_ex_26()
        {
            decimal result = 1;
            decimal denominator = 1;
            decimal change = 1;
            int iteration1 = 100;
            int iteration2 = 1000;
            int iteration3 = 10000;
            int iteration4 = 100000;
            while (iteration1 > 0)
            {
                change *= -1;
                denominator += 2;
                result += (change / denominator);
                iteration1--;
            }
            Console.WriteLine("Pi / 4 after 100 iterations is equal to: {0}", result);
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
            Console.WriteLine("Pi / 4 after 1000 iterations is equal to: {0}", result);
            result = 1;
            denominator = 1;
            change = 1;
            while (iteration3 > 0)
            {
                change *= -1;
                denominator += 2;
                result += (change / denominator);
                iteration3--;
            }
            Console.WriteLine("Pi / 4 after 10000 iterations is equal to: {0}", result);
            result = 1;
            denominator = 1;
            change = 1;
            while (iteration4 > 0)
            {
                change *= -1;
                denominator += 2;
                result += (change / denominator);
                iteration4--;
            }
            Console.WriteLine("Pi / 4 after 100000 iterations is equal to: {0}", result);
            Console.ReadLine();
        }
        
        static void Main(string[] args)
        {
            chapter_3_ex_16();
            //chapter_3_ex_22(); 
            //chapter_3_ex_24();
            //chapter_4_ex_26();
        }
    }
}
