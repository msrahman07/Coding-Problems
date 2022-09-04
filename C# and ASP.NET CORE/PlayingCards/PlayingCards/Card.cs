using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PlayingCards
{
    internal class Card : IComparable<Card>
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
        public override string ToString()
        {
            return Name;
        }
        public int Compare(Card? x, Card? y)
        {
            if (x.Suite > y.Suite)
            {
                return 1;
            }
            if (x.Suite < y.Suite)
            {
                return -1;
            }
            if (x.Value > y.Value)
            {
                return 1;
            }
            if (x.Value < y.Value)
            {
                return -1;
            }
            return 0;
        }

        public int CompareTo(Card? other)
        {
            if (this.Suite > other.Suite)
            {
                return 1;
            }
            if (this.Suite < other.Suite)
            {
                return -1;
            }
            if (this.Value > other.Value)
            {
                return 1;
            }
            if (this.Value < other.Value)
            {
                return -1;
            }
            return 0;
        }
    }
}
