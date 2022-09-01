using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TwoDecksWPF
{
    internal class CardComparerByValue : IComparer<Card>
    {
        public int Compare(Card? x, Card? y)
        {
            if(x.Suite > y.Suite)
            {
                return 1;
            }
            if(x.Suite < y.Suite)
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
    }
}
