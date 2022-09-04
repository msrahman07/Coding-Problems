using System.Collections;

namespace IEnumerableClone
{
    internal class ManualSportEnumerator : IEnumerator<Sport>
    {
        int current = -1;
        public Sport Current => (Sport)current;

        object IEnumerator.Current => Current;

        public void Dispose()
        {
            return;
        }

        public bool MoveNext()
        {
            var maxEnumValues = Enum.GetValues(typeof(Sport)).Length;
            if((int)current >= maxEnumValues-1) return false;
            current++;
            return true;
        }

        public void Reset()
        {
            current = 0;
        }
    }
}