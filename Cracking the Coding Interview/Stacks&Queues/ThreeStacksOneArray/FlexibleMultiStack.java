package ThreeStacksOneArray;

public class FlexibleMultiStack {
    /* StackInfo is a simple class that holds a set of data about each stack.
     * It does not hold the actual items in the stack.
     */

    private class StackInfo {
        public int start, size, capacity;

        public StackInfo(int start, int capacity) {
            this.start = start;
            this.capacity = capacity;
        }

        // Check if an index on the full array is within
        // the stack boundaries. The stack can wrap around to the start of the array
        public boolean isWithinStackCapacity(int index) {
            if(index < 0 || index >= values.length) {
                return false;
            }
            // if index wraps around, adjust it
            int contiguousIndex = (index < start) ? index + values.length : index;
            int end = start + capacity;
            return start <= contiguousIndex && contiguousIndex < end;
        }

        public int lastCapacityIndex() {
            return adjustIndex(start + capacity - 1);
        }

        public int lastElementIndex() {
            return adjustIndex(start + size - 1);
        }
        private boolean isEmpty() {
            return size == 0;
        }
    
        private boolean isFull(int stackNum) {
            return size == capacity;
        }
    }
    
    private StackInfo[] info;
    private int[] values;
    public int adjustIndex(int i) {
        return 0;
    }
}
