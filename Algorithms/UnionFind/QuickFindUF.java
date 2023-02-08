package UnionFind;


public class QuickFindUF implements IUnionFind<Integer>{

    private static int[] connectedArray;

    public QuickFindUF(int N) {
        connectedArray = new int[N];

        for(int i = 0; i < N; i++) {
            connectedArray[i] = i;
        }
    }

    // Union is too expensive, takes O(N^2) for N objects
    @Override
    public void union(Integer firstPoint, Integer secondPoint) {
        int changeValue = connectedArray[firstPoint];
        for(int i = 0; i < connectedArray.length; i++) {
            if(connectedArray[i] == changeValue) {
                connectedArray[i] = connectedArray[secondPoint];
            }
        }
    }

    @Override
    public boolean find(Integer firstPoint, Integer secondPoint) {
        return connectedArray[firstPoint] == connectedArray[secondPoint];
    }

    public void printConnections() {
        System.out.print("Index: \t ");
        for(int i=0; i<connectedArray.length; i++) {
            System.out.print(i + " ");
        }

        System.out.println(" ");
        System.out.print("Value: \t ");

        for(int val: connectedArray) {
            System.out.print(val+ " ");
        }
    }

}