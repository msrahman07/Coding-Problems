package UnionFind;

public class WeightedQuickUnionUF extends QuickUnionUF {
    private static int[] size;

    public WeightedQuickUnionUF(int N) {
        super(N);
        size = new int[N];
    }

    private int root(int point) {
        while(point != connectedArray[point]) {
            connectedArray[point] = connectedArray[connectedArray[point]];
            point = connectedArray[point];
        }
        return point;
    }

    @Override
    public void union(Integer firstPoint, Integer secondPoint) {
        int i = root(firstPoint);
        int j = root(secondPoint);
        if(i == j) return;

        if(size[i] < size[j]) {
            connectedArray[i] = j;
            size[j] += size[i];
        } else {
            connectedArray[j] = i;
            size[i] += size[j];
        }
    }
    
}
