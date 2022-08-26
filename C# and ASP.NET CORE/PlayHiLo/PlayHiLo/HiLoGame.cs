// See https://aka.ms/new-console-template for more information
internal static class HiLoGame
{
    public const int MAXIMUM = 10;
    private static Random random = new();
    private static int currentNumber = random.Next(1,MAXIMUM+1);
    private static int pot = 10;

    public static int GetPot()
    {
        return pot;
    }

    public static void Guess(bool higher)
    {
        int nextNumber = random.Next(1, MAXIMUM);
        if ((higher && nextNumber >= currentNumber) || (!higher && nextNumber <= currentNumber))
        {
            Console.WriteLine("You guessed it right!");
            pot++;
        }else
        {
            Console.WriteLine("Bad luck, you guessed wrong!");
            pot--;
        }
        currentNumber = nextNumber;
        Console.WriteLine($"The current number is {currentNumber}");
    }

    public static void Hint()
    {
        int half = MAXIMUM / 2;
        if(currentNumber >= half)
        {
            Console.WriteLine($"The number is at least {half}");
        }
        else
        {
            Console.WriteLine($"The number is at most {half}");
        }
        pot--;
    }
}

