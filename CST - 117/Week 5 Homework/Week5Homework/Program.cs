using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Week5Homework
{
    public class Warehouse
    {
        private int radios;
        private int televisions;
        private int computers;
        //From Here
        public Warehouse ()
        {
            radios = 0;
            televisions = 0;
            computers = 0;
        }
        public Warehouse(int amtR, int amtT, int amtC)
        {
            radios = amtR;
            televisions = amtT;
            computers = amtC;
        }
        //To Here is an example of method overloading.
        public void stockWarehouse()
        {
            Console.WriteLine("How many new radios were ordered?");
            radios += Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("How mant televisions were ordered?");
            televisions += Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("How many computers were ordered?");
            computers += Convert.ToInt32(Console.ReadLine());
        }
        public void displayWarehouse()
        {
            Console.WriteLine("Current radio stock is {0}.", radios);
            Console.WriteLine("Current television stock is {0}.", televisions);
            Console.WriteLine("Current computer stock is {0}.", computers);
        }
        
    }
    public class CoffeeMachine
    {
        private int cupsOfCoffee;
        private int costOfCoffee;
        private int payment;
        public CoffeeMachine()
        {
            cupsOfCoffee = 10;
            costOfCoffee = 50;
        }
        public CoffeeMachine (int cups, int cost)
        {
            cupsOfCoffee = cups;
            costOfCoffee = cost;
        }
        public void Menu()
        {
            Console.WriteLine("Available cups of coffe are {0}.", cupsOfCoffee);
            Console.WriteLine("Cost per cup is {0}", costOfCoffee);
        }
        public void Purchase()
        {
            Console.WriteLine("Please insert exact change, else you will recieve a refund.");
            payment = 0;
            while (payment != costOfCoffee)
            {
                Q1:
                Console.WriteLine("Insert a number of quarters.");
                string input = Console.ReadLine();
                int quarters = 0;
                if (!int.TryParse(input, out quarters))
                {
                    Console.WriteLine("Invalid Entry.");
                    goto Q1;
                }
                D1:
                Console.WriteLine("Insert a number of dimes.");
                string input2 = Console.ReadLine();
                int dimes = 0;
                if (!int.TryParse(input2, out dimes))
                {
                    Console.WriteLine("Invalid Entry.");
                    goto D1;
                }
                N1:
                Console.WriteLine("Insert a number of nickels.");
                string input3 = Console.ReadLine();
                int nickels = 0;
                if (!int.TryParse(input3, out nickels))
                {
                    Console.WriteLine("Invalid Entry.");
                    goto N1;
                }
                payment = (quarters * 25) + (dimes * 10) + (nickels * 5);
                if (payment > costOfCoffee)
                {
                    Console.WriteLine("You inserted too many coins, please try again.");
                    Console.WriteLine("Quarters {0}, Dimes {1}, Nickles {2}.", quarters, dimes, nickels);
                    goto Q1;
                }
                else if (payment < costOfCoffee)
                {
                    Console.WriteLine("You inserted too few coins, please try again.");
                    Console.WriteLine("Quarters {0}, Dimes {1}, Nickles {2}.", quarters, dimes, nickels);
                    goto Q1;
                }
                break;
            }
            Console.WriteLine("Thank you for your purchase. Here is your coffee!");
            cupsOfCoffee--;
        }
    }
    class Program
    {
        static void runWarehouse()
        {
            Warehouse warehouse1 = new Warehouse();
            warehouse1.displayWarehouse();
            warehouse1.stockWarehouse();
            warehouse1.displayWarehouse();
            Console.ReadLine();
        }
        static void runWarehouse2()
        {
            Warehouse warehouse2 = new Warehouse(10, 6, 2);
            warehouse2.displayWarehouse();
            warehouse2.stockWarehouse();
            warehouse2.displayWarehouse();
            Console.ReadLine();
        }
        static void coffeeMachine1()
        {
            CoffeeMachine machine1 = new CoffeeMachine();
            machine1.Menu();
            machine1.Purchase();
            machine1.Menu();
            Console.ReadLine();
        }
        static void coffeeMachine2()
        {
            CoffeeMachine machine2 = new CoffeeMachine(5, 75);
            machine2.Menu();
            machine2.Purchase();
            machine2.Menu();
            Console.ReadLine();
        }
        static void randomArray()
        {
            int[] testarray = new int[10000];
            double one = 0;
            double two = 0;
            double three = 0;
            double four = 0;
            foreach (int i in testarray)
            {
                Random randomnumber = new Random();
                testarray[i] = randomnumber.Next(0, 4);
                if (testarray[i] == 1)
                    one++;
                else if (testarray[i] == 2)
                    two++;
                else if (testarray[i] == 3)
                    three++;
                else
                    four++;
                //Console.WriteLine(testarray[i]);
            }
            Console.WriteLine("Percent of 1's = " + (one / 100));
            Console.WriteLine("Percent of 2's = " + (two / 100));
            Console.WriteLine("Percent of 3's = " + (three / 100));
            Console.WriteLine("Percent of 4's = " + (four / 100));
            Console.ReadLine();
        }


        static void Main(string[] args)
        {
            //runWarehouse();
            //runWarehouse2();
            //coffeeMachine1();
            //coffeeMachine2();
            //randomArray();
        }
    }
}
