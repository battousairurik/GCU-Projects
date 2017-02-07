using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Week6Homework
{
    class Program
    {
        static void letterswap()
        {
            Console.WriteLine("Please enter your phrase.");
            string input = Console.ReadLine();
            var change = input.Select(x => x == 'p' ? 'q' : (x == 'P' ? 'Q' : x)).ToArray();
            input = new string(change);
            Console.Write("With the letter p swapped for q, your new string looks like this: ");
            Console.Write(input);
            Console.ReadLine();

        }

        static void Main(string[] args)
        {
            letterswap();
        }
    }
}
