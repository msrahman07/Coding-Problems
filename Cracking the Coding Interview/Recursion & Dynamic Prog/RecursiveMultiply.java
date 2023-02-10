public class RecursiveMultiply {
    public static int recursiveMultiply(int x, int y) { 
        int smallNumber=0, largeNumber=0;
        if(x < y) {
            smallNumber = x;
            largeNumber = y;
        } else {
            smallNumber = y;
            largeNumber = x;
        }

        return recursiveMultiplyHelper(smallNumber, largeNumber);
    }
    private static int recursiveMultiplyHelper(int smallNumber, int largeNumber) {
        if(smallNumber == 0) {
            return 0;
        } else if(smallNumber == 1) {
            return largeNumber;
        }
        int smallNumberHalf = smallNumber >> 1; // Divide by 2
        int halfProduct = recursiveMultiplyHelper(smallNumberHalf, largeNumber);
        if(smallNumber % 2 == 0) {
            return halfProduct + halfProduct;
        } else {
            return halfProduct + halfProduct + largeNumber;
        }
        
    }

    public static int multiply(int x, int y) { 
        return x*y;
    }

    public static void main(String[] args) {
        int x = 0;
        int y = 10;

        while(x < y) {
            if(recursiveMultiply(x, y) == multiply(x,y)) {
                System.out.println("For x: "+x+" and y: "+y);
            }
            x++; y--;
        }
        System.out.println(recursiveMultiply(10, 20));

    }
}
