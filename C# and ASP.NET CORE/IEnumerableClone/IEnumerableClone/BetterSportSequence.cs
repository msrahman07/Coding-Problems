using System.Collections;
namespace IEnumerableClone;
internal class BetterSportSequence : IEnumerable<Sport>
{
    public BetterSportSequence()
    {
    }

    public IEnumerator<Sport> GetEnumerator()
    {
        var sports = Enum.GetValues(typeof(Sport));
        foreach (Sport sport in sports)
        {
            yield return sport;
        }
    }

    IEnumerator IEnumerable.GetEnumerator()
    {
        return GetEnumerator();
    }
    public Sport this[int index]
    {
        get
        {
            Console.WriteLine("This line");
            return (Sport)index;
        }
        set {
            var li = this.ToList();
            li[index] = value;
            
        }
    }
    
}