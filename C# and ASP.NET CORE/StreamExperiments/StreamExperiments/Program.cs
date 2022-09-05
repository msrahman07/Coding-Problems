using System.IO;
internal class Program
{
    private static void Main(string[] args)
    {
        var folder = Environment.GetFolderPath(Environment.SpecialFolder.Personal);
        var reader = new StreamReader($"{folder}{Path.DirectorySeparatorChar}secret_plan.txt");
        var writer = new StreamWriter($"{folder}{Path.DirectorySeparatorChar}emailToCaptain.txt");
        writer.WriteLine("To: CaptainAmazing@objectville.net");
        writer.WriteLine("From: Commissioner@objectville.net");
        writer.WriteLine("Subject: Can you save the day... again?");
        writer.WriteLine();
        writer.WriteLine("We’ve discovered the Swindler’s terrible plan:");

        while (!reader.EndOfStream)
        {
            var lineFromPlan = reader.ReadLine();
            writer.WriteLine($"The Plan -> {lineFromPlan}");
        }
        writer.WriteLine();
        writer.WriteLine("Can you help us?");
        writer.Close();
        reader.Close();
        /*StreamWriter sw = new StreamWriter("secret_plan.txt");
        sw.WriteLine("How I'll defeat Captain Amazing");
        sw.WriteLine("Another genius secret plan by The Swindler");
        sw.WriteLine("I'll unleash my army of clones upon the citizens of Objectville.");
        string location = "the mall";
        for (int number = 1; number <= 5; number++)
        {
            sw.WriteLine("Clone #{0} attacks {1}", number, location);
            location = (location == "the mall") ? "downtown" : "the mall";
        }
        sw.Close();*/
    }
}