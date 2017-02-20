using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PlinkoGame
{
    class Program
    {
        static Random random = new Random();
        

        static void Main(string[] args)
        {
            Console.WriteLine("Welcome to Plinko! \nHow many balls would you like to use?");
            int plays = Int32.Parse(Console.ReadLine());
            Console.WriteLine("How many slots are you playing with?");
            int Slots = Int32.Parse(Console.ReadLine());
            int[] slots = new int[Slots];
            
            while (plays > 0)
            {
                plays--;
                string drop = null;
                int i = 0;
                int slot = 0;
                int N = 0;
                while (N < (Slots - 1))
                {
                    N++;
                    int side = random.Next(1, 3);
                    if (side == 1)
                    {
                        drop += "L";
                        
                    }
                    else if (side == 2)
                    {
                        drop += "R";
                        slot++;
                    }
                }
                Console.WriteLine(drop);
                slots[i] = slot;
                i++;
            }
            foreach (int i in slots)
                Console.Write(slots[i]);
            Console.ReadLine();
        }
    }
}
