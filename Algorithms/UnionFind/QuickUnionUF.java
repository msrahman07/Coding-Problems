package UnionFind;

public class QuickUnionUF implements IUnionFind<Integer>{

    protected static int[] connectedArray;

    public QuickUnionUF(int N) {
        connectedArray = new int[N];
        
        for (int i = 0; i < N; i++) {
            connectedArray[i] = i;
        }
    }

    private int root(int point) {
        while(point != connectedArray[point]) {
            point = connectedArray[point];
        }
        return point;
    }

    @Override
    public void union(Integer firstPoint, Integer secondPoint) {
        int i = root(firstPoint);
        int j = root(secondPoint);
        connectedArray[i] = j;
    }

    @Override
    public boolean find(Integer firstPoint, Integer secondPoint) {
        return root(firstPoint) == root(secondPoint);
    }
    
}
