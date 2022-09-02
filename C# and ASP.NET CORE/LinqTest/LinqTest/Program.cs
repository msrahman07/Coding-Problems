using System.Collections.Generic;
using System.Linq;

namespace LinqTest;

internal class Program
{
    private static void Main(string[] args)
    {
        IEnumerable<Comic> mostExpensive = from comic in Comic.Catalog
                                           where Comic.Prices[comic.Issue] > 500
                                           orderby Comic.Prices[comic.Issue] descending
                                           select comic;
        foreach (Comic comic in mostExpensive)
        {
            Console.WriteLine($"{comic} is worth {Comic.Prices[comic.Issue]:c}");
        }

        List<object> list = new() { 1, 2, "string", new Comic()};
        Console.WriteLine(String.Join(", ", list.Take(2)));
        /*List<int> numbers = new List<int>();

        for (int i = 2; i <= 99; i++)
        {
            numbers.Add(i);
        }
        IEnumerable<int> firstAndLastFive = numbers.Take(5).Concat(numbers.TakeLast(5));
        firstAndLastFive = numbers.TakeWhile((num, j) => num <= 5 || num >= 95);
        foreach (int i in firstAndLastFive)
        {
            //Console.WriteLine(i);
        }
        int[] values = new int[] { 0, 12, 44, 36, 92, 54, 13, 8 };

        IEnumerable<int> result = from v in values
                                  where v <= 37
                                  orderby -v
                                  select v;
        foreach (int i in result)
        {
            Console.WriteLine(i);
        }*/

    }
}