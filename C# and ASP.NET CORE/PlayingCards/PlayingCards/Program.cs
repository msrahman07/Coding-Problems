using PlayingCards;
using System.Linq;
internal class Program
{
    private static readonly Random random = new Random();
    static string Output(Suits suit, int number) => $"Suit is {suit} and number is {number}";
    private static void Main(string[] args)
    {
        var deck = new Deck();
        var processedCards = deck.Take(3)
        .Concat(deck.TakeLast(3))
        .OrderByDescending(card => card)
        .Select(card => card.Value switch
        {
            Values.King => Output(card.Suite, 7),
            Values.Ace => $"It's an ace! {card.Suite}",
            Values.Jack => Output((Suits)card.Suite - 1, 9),
            Values.Two => Output(card.Suite, 18),
            _ => card.ToString(),
        });
        foreach (var output in processedCards)
        {
            Console.WriteLine(output);
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