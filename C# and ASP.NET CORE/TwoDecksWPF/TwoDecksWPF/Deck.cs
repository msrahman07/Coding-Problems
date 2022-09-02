using System;
using System.Collections.Generic;

using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TwoDecksWPF
{
    using System.Collections.ObjectModel;
    internal class Deck : ObservableCollection<Card>
    {
        public List<Card> Cards { get; } = new List<Card> { };
        private static readonly Random random = new Random();
        public string DeckCards { get; set; } = null!;

        public Deck()
        {
            Reset();
        }
        public void Reset()
        {
            Clear();
            Cards.Clear();
            for (int suit = 0; suit <= 3; suit++)
            {
                for (int value = 1; value <= 13; value++)
                {
                    Cards.Add(new Card((Values)value, (Suits)suit));
                    Add(new Card((Values)value, (Suits)suit));
                }
            }
        }
        

        private int CompareCards(Card? x, Card? y)
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

        private int ShuffleCards(Card x, Card y)
        {
            int num = random.Next(-1, 2);
            //Console.WriteLine(num);

            return num;
        }

        public void Sort()
        {
            this.Cards.Sort(CompareCards);
            Clear();
            foreach(Card card in Cards)
            {
                Add(card);
            }
        }
        public void Shuffle()
        {
            this.Cards.Sort(ShuffleCards);
            Clear();
            foreach (Card card in Cards)
            {
                Add(card);
            }
        }

        
    }
}
