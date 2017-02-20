using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ChickenHouse
{
    class ChickenHouse
    {
        static string[] SunnyDayFarm;
        
        static int findchicken()
        {
            Console.WriteLine("What chicken are you looking for?");
            string check = Console.ReadLine();
            int x = SunnyDayFarm.IndexOf(check);
            Console.WriteLine(x);
        }
        
        static void consolidate()
        {
            var sorted = SunnyDayFarm.OrderBy(i => i);
            foreach (string i in SunnyDayFarm)
                Console.WriteLine(i);
        }
        static void Main(string[] args)
        {
            SunnyDayFarm = new string[6];
            SunnyDayFarm[0] = "Sister";
            SunnyDayFarm[1] = "Beulah";
            SunnyDayFarm[2] = null;
            SunnyDayFarm[3] = "Ms. Sassy";
            SunnyDayFarm[4] = null;
            SunnyDayFarm[5] = "Crispy";
            foreach (string i in SunnyDayFarm)
                Console.WriteLine(i);
            findchicken();
            consolidate();
            Console.ReadLine();
        }
    }
}
