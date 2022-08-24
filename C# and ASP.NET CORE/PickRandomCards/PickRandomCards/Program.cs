using PickRandomCards;

internal class Program
{
    private static void Main(string[] args)
    {
        Console.WriteLine("Enter a number of cards to pick: ");
        string line = Console.ReadLine();

        if(int.TryParse(line, out int numberOfCards))
        {
            string[] randomCards = CardPicker.PickSomeCards(numberOfCards);
            foreach(string card in randomCards)
            {
                Console.WriteLine(card);
            }
        }
        else
        {
            Console.WriteLine("Invalid input, please enter a number");
        }
    }
}