using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace OOPExperiments
{
    internal class TallGuy : IClown
    {
        public string Name;
        public int Height;

        public string FunnyThingIHave
        {
            get { return "Big Shoes"; }
        }

        public void Honk()
        {
            Console.WriteLine("Honk Honk");
        }
        public void TalkAboutYourself()
        {
            Console.WriteLine($"My name is {Name} and I'm {Height} inches tall.");
        }
    }
}
