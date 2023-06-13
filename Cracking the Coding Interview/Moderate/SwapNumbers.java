public class SwapNumbers {
    public static void swap(int a, int b) {
        System.out.println(a+", "+b);
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println(a+", "+b);
    }
    public static void main(String[] args) {
        swap(12, 3);
        swap(35, 12);
        System.out.println("Hello, World!");
    }
}