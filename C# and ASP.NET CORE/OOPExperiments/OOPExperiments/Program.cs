using OOPExperiments;

internal class Program
{
    private static void Main(string[] args)
    {
        IClown[] newClown = new IClown[2];
        TallGuy tallGuy = new TallGuy() { Height = 76, Name = "Jimmy" };
        tallGuy.TalkAboutYourself();
        Console.WriteLine($"The tall guy has {tallGuy.FunnyThingIHave}");
        tallGuy.Honk();
    }
}