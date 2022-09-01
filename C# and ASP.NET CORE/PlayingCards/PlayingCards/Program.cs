using PlayingCards;

internal class Program
{
    private static readonly Random random = new Random();
    private static void Main(string[] args)
    {
        
        Deck deck = new Deck();
        List<Card> cards = deck.cards;
        /*
        Console.WriteLine("Enter number of Cards: ");
        if (int.TryParse(Console.ReadLine(), out int numberOfCards))
        {
            for(int i=0; i < numberOfCards; i++)
            {
                cards.Add(RandomCard());
            }
        }
        
        PrintCards(cards);
        Console.WriteLine("\n........Sorting cards........\n");
        CardComparerByValue cardComparerByValue = new CardComparerByValue();
        cards.Sort(cardComparerByValue.Compare);
        */
        PrintCards(cards);
        Console.WriteLine("\n........Sorting cards........\n");
        cards.Sort(ShuffleCards);
        PrintCards(cards);
        Console.WriteLine($"\n{cards.Count}");

    }
    private static Card RandomCard()
    {
        Card myCard = new Card((Values)random.Next(1, 14), (Suits)random.Next(3));

        return myCard;
    }
    private static void PrintCards(List<Card> cards)
    {
        foreach(Card card in cards)
        {
            Console.WriteLine(card);
        }
    }

    private static int ShuffleCards(Card x, Card y)
    {
        int num = random.Next(-1, 2);
        //Console.WriteLine(num);

        return num;
    }
}