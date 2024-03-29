﻿using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PlayingCards
{
    internal class Deck : IEnumerable<Card>
    {
        public readonly List<Card> cards = new List<Card> { };

        public Deck()
        {
            for (int suit = 0; suit <= 3; suit++)
            {
                for (int value = 1; value <= 13; value++)
                {
                    cards.Add(new Card((Values)value, (Suits)suit));
                }
            }
        }

        public IEnumerator<Card> GetEnumerator()
        {
            return cards.GetEnumerator();
        }

        public void PrintCards()
        {
            for (int i = 0; i < cards.Count; i++)
                Console.WriteLine(cards[i].Name);
        }

        IEnumerator IEnumerable.GetEnumerator()
        {
            foreach(Card card in cards)
            {
                yield return card;
            }
        }
    }
}
