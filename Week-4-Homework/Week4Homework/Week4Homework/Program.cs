using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Week4Homework
{
    public class BankAccount
    {
        private double balance;
        //From here
        public BankAccount()
        {
            balance = 0;
        }
        public BankAccount(double InitialAmount)
        {
            balance = InitialAmount;
        }
        //To here, is an example of Method Overloading
        public double GetBalance()
        {
            return balance;
        }
        public void Deposit(double amount)
        {
            balance += amount;
        }
        public double Withdraw (double amount)
        {
            if (balance >= amount)
            {
                balance -= amount;
                return balance;
            }
            else
                return -1;
        }
        public double Withdraw()
        {
            if (balance >= 40)
            {
                balance -= 40;
                return balance;
            }
            else
            {
                Console.WriteLine("Insufficient Funds");
                return -1;
            }
                
        }
    }
    public class RunPrograms
    {
        static void RunBankAccount()
        {
            BankAccount myAccount = new BankAccount(25.00);
            Console.WriteLine("My Balance = {0:c}", myAccount.GetBalance());
            myAccount.Deposit(700);
            Console.WriteLine("My Balance = {0:c}", myAccount.GetBalance());
            if (myAccount.Withdraw(300) < 0)
                Console.WriteLine("Insufficient Funds");
            Console.WriteLine("My Balance = {0:c}", myAccount.GetBalance());
            if (myAccount.Withdraw(450) < 0)
                Console.WriteLine("Insufficient Funds");
            Console.WriteLine("My Balance = {0:c}", myAccount.GetBalance());
            myAccount.Withdraw();
            myAccount.Withdraw();
            myAccount.Withdraw();
            Console.WriteLine("My Balance = {0:c}", myAccount.GetBalance());
            if (myAccount.Withdraw(25) < 0)
                Console.WriteLine("Insufficient Funds");
            while (myAccount.GetBalance() > 0)
            {
                myAccount.Withdraw();
                Console.WriteLine("My Balance = {0:c}", myAccount.GetBalance());
            }
            BankAccount yourAccount = new BankAccount();
            yourAccount.Deposit(1234.56);
            Console.WriteLine("Your Balance = {0:c}", yourAccount.GetBalance());
            Console.ReadLine();
        }

        static void Main(string[] args)
        {
            RunBankAccount();

        }
    }
}
