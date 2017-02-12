using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;


namespace Week6Homework
{
    public interface IBendable
    {
        //This is like an abstract class
        void Bend();
    }
    public class Spoon : IBendable
    {
        public void Bend()
        {
            Console.WriteLine("Bend the spoon with your mind!");
        }
        public void Eat()
        {
            Console.WriteLine("Eat with your spoon!");
        }
    }
    public class Arm : IBendable
    {
        public void Bend()
        {
            Console.WriteLine("Bend your arm!!!");
        }
        public void Raise()
        {
            Console.WriteLine("Raise your hand in class.");
        }
    }
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
        static void bending()
        {
            Spoon first = new Spoon();
            first.Bend();
            first.Eat();
            Console.WriteLine();
            Arm second = new Arm();
            second.Bend();
            second.Raise();
            Console.ReadLine();
        }
        static void companysales()
        {
            int[] sales = new int[5];
            int x;
            for (x =0; x <5; x++)
            {
                Console.WriteLine("Enter sales for Store {0}: ", x);
                sales[x] = Convert.ToInt32(Console.ReadLine());
            }
            int max = sales.Max();
            int min = sales.Min();
            int range = (max - min);
            foreach (int i in sales)
            {
                if (i > range)
                {
                    Console.WriteLine("Store {0} is doing very well.", Array.IndexOf(sales, i));
                }
            }
            Console.ReadLine();
        }
        static void arraysorting()
        {
            int[] example = new int[5];
            for (int i = 0; i < 5; i++)
            {
                Console.Write("Please enter your integer. ");
                example[i] = Convert.ToInt32(Console.ReadLine());
            }
            int minimum;
            int templocation;
            for (int x = 0; x < 4; x++)
            {
                minimum = x;
                for(int y = x+1; y < 5; y++)
                {
                    if (example[y] < example[minimum])
                        minimum = y;
                    Console.WriteLine(System.Environment.TickCount + "Y Change");
                }
                if (minimum != x)
                {
                    templocation = example[x];
                    example[x] = example[minimum];
                    example[minimum] = templocation;
                    Console.WriteLine(System.Environment.TickCount + "Swap");
                }
                Console.WriteLine(System.Environment.TickCount + "X Change");
            }
            
            //Array.Sort(example);
            foreach (int z in example)
            {
                Console.Write(z + " ");
            }
            Console.ReadLine();
        }
        static void Main(string[] args)
        {
            //letterswap();
            //bending();
            //companysales();
            //arraysorting();
        }
    }
}
/*
namespace InterfacePractice
{
    public interface IDrivablePractice
    {
        void Start();
        void Stop();
        void Accelerate();
        void Decelerate();
        void Turn(string direction);
    }
    public class Van : IDrivablePractice
    {
        
        public void Start()
        {
            Console.WriteLine("Van turning on.");
        }
        public void Stop()
        {
            Console.WriteLine("Van coming to a stop.");
        }
        public void Accelerate()
        {
            Console.WriteLine("Van slowly speeding up.");
        }
        public void Decelerate()
        {
            Console.WriteLine("Van skidding to slow down.");
        }
        public void Turn(String direction)
        {
            Console.WriteLine("Turning {0} like a Van.", direction);
        }
    }
    public class TestDrivablePractice
    {
        public static void GoForward(IDrivablePractice d)
        {
            d.Start();
            d.Accelerate();
            d.Decelerate();
        }
        static void Main(string[] args) 
        {
            Van mini = new Van();
            GoForward(mini);
            Console.ReadLine();
        }
    }
}
*/
