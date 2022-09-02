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
        //PrintCards(cards);
        Console.WriteLine("\n........Shuffling cards........\n");
        //cards.Sort(ShuffleCards);
        /*PrintCards(cards);*/
        //Console.WriteLine($"\n{cards.Count}");
        Console.WriteLine("\n........Grouping cards........\n");
        var grouped =
                    from card in cards
                    group card by card.Suite into suitGroup
                    orderby suitGroup.Key descending
                    select suitGroup;
        foreach (var group in grouped)
        {
            Console.WriteLine(@$"Group: {group.Key}
Count: {group.Count()}
Minimum: {group.Min()}
Maximum: {group.Max()}");
        }
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