using IEnumerableClone;
using System.Collections.Immutable;

internal class Program
{
    private static void Main(string[] args)
    {
        var sports = new ManualSportSequence();
        var betterSport = new BetterSportSequence();
        var revSports = betterSport.Reverse();
        /*foreach (var sport in revSports)
            Console.WriteLine(sport);*/
        betterSport[1] = Sport.Fencing;

        Console.WriteLine(betterSport[1]);
    }
}