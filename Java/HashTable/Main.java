package HashTable;

public class Main {
    public static void main(String[] args) {
        HashTable<Integer, Integer> table = new HashTable<Integer, Integer>();

        table.put(1, 100);
        table.put(2, 200);

        System.out.println(fibonacci(20));
        System.out.println(fibonacciTab(20));
        
    }
    public static int fibonacci(int n) {
        return fibonacciMemo(n, new int[n+1]);
    }

    public static int fibonacciMemo(int n, int[] cache) {
        if(n <= 1) {
            return n;
        } else if (cache[n] > 0) {
            return cache[n];
        }
        cache[n] = fibonacciMemo(n-1, cache) + fibonacciMemo(n-2, cache);
        return cache[n];
    }
    // No recursion - Tabulation approach - bottom-up
    public static int fibonacciTab(int n) {
        if(n <= 1) return n;

        int first = 1;
        int second = 0;
        int result = 0;

        for(int i=1; i<n; i++) {
            result = first + second;
            second = first;
            first = result;

        }
        return result;
    }
}
