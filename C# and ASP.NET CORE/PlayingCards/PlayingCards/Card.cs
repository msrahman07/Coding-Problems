using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PlayingCards
{
    internal class Card
    {
        public Values Value { get; set; }
        public Suits Suite { get; set; }
        public string Name { get
            {
                return $"{Value.ToString()} of {Suite.ToString()}";
            } 
        }
        public Card(Values value, Suits suite)
        {
            Value = value;
            Suite = suite;
        }
    }
}
