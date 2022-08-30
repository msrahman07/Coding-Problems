using PlayingCards;

internal class Program
{
    private static readonly Random random = new Random();
    private static void Main(string[] args)
    {
        Card myCard = new Card((Values)random.Next(1, 14), (Suits)random.Next(3));
        Console.WriteLine(myCard.Name);
    }
}