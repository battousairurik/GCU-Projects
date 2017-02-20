using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Week3Homework
{
    class Program
    {
        static void ch4ex14()
        {
            string choice = "Y";
            while (choice == "Y" || choice == "y")
            {
                Console.WriteLine("What is the Radius of your Circle?");
                double radius = double.Parse(Console.ReadLine());
                if (radius < 0.0) //This still needs to be set to an expression that can catch a character.
                    Console.WriteLine("Invalid Expression");
                double circumfrence = radius * Math.PI;
                Console.Write("The Circumfrence of your circle is {0}.", circumfrence);
                Console.Write("Would you like to enter another Radius? Y/N.");
                choice = Console.ReadLine();
            } 
        }
        static void ch4ex16()
        {
            Console.WriteLine("What number would you like to find the square root of?");
            double root = double.Parse(Console.ReadLine());
            double estimate = root / 2;
            double estimate2 = 0.0;
            double root2 = Math.Sqrt(root);
            int n = 0;
            while (n < 9)
            {
                estimate2 = root / estimate;
                estimate = (estimate + estimate2) / 2;
                Console.WriteLine(estimate);
                n++;
            }
            Console.WriteLine("The Square Root is {0}.", root2);
            Console.WriteLine("The Square Estimate is {0}.", estimate);
            Console.ReadLine();
        }
        static void ch4ex20()
        {
            string choice = "Y";
            while (choice == "Y" || choice == "y")
            {
                Console.Write("Hello, Welcome to Weaver Exchange.");
                Console.Write("Would you like to exchange Dollars or Pounds?");
                string type = Console.ReadLine();
                if (type == "Dollars" || type == "dollars")
                {
                    Console.Write("What is the amount you would like to exchange?");
                    double dollars = double.Parse(Console.ReadLine());
                    double pounds = (dollars / 1.6595);                    
                    Console.Write("Your exchange amount is {0} Pounds and {1} Pence.", Math.Floor(pounds) , 
                        Math.Floor((pounds % 1) * 100));
                }
                else if (type == "Pounds" || type == "pounds")
                {
                    Console.Write("What is the amount you wish to exchange?");
                    double pounds = double.Parse(Console.ReadLine());
                    double dollars = (pounds * 1.6595);
                    Console.Write("Your exchange amount is {0} Dollars and {1} Cents.", Math.Floor(dollars), 
                        Math.Floor((dollars % 1) * 100));
                }
                Console.Write("Would you like make another exchange?");
                choice = (Console.ReadLine());
            }
        }
        static void Main(string[] args)
        {
            ch4ex14();
            ch4ex16();
            ch4ex20();
            
        }
    }
}
