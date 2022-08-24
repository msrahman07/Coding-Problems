using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PickACardUI
{
    internal class CardPicker
    {
        /// <summary>
        /// Picks a number of cards and returns them.   
        /// </summary>
        /// <param name="numberOfCards">The number of cards to pick.</param>
        /// <returns></returns>
        public static string[] PickSomeCards(int numberOfCards)
        {
            string[] pickedCards = new string[numberOfCards];
            for(int i=0; i<numberOfCards; i++)
            {
                pickedCards[i] = RandomValue() + " of " + RandomSuit();
            }
            return pickedCards;
        }

        static Random random = new();
        private static string RandomSuit()
        {
            int value = random.Next(1, 5);

            switch (value)
            {
                case 1: return "Spades ♠";
                 
                case 2: return "Hearts ♥";

                case 3: return "Clubs ♣";

                default: return "Diamonds ♦";
            }
        }

        private static string RandomValue()
        {
            int value = random.Next(1, 14);

            switch (value)
            {
                case 1: return "Ace";
                case 11: return "Jack";
                case 12: return "Queen";
                case 13: return "King";
                default: return value.ToString();
            }

        }
    }

    
}
