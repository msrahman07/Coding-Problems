package UnionFind;

public class Main {
    public static void main(String[] args) {
        IUnionFind<Integer> qf = new QuickFindUF(10);
        IUnionFind<Integer> qu = new WeightedQuickUnionUF(10);

        qf.union(4, 3);
        qu.union(4, 3);
        qf.union(3, 8);
        qu.union(3, 8);
        qf.union(6, 5);
        qu.union(6, 5);
        qf.union(9, 4);
        qu.union(9, 4);
        qf.union(2, 1);
        qu.union(2, 1);
        qf.union(5, 0);
        qu.union(5, 0);
        qf.union(7, 2);
        qu.union(7, 2);
        qf.union(6, 1);
        qu.union(6, 1);
        qf.union(3, 4);
        qu.union(3, 4);
        qf.union(8, 3);
        qu.union(8, 3);
        qf.union(4, 9);
        qu.union(4, 9);

        System.out.println(qf.find(0, 3) == qu.find(0, 3));
        System.out.println(qf.find(0, 2) == qu.find(0, 2));
        System.out.println(qf.find(1, 8) == qu.find(1, 8));
        System.out.println(qf.find(4, 9) == qu.find(4, 9));
        System.out.println(qf.find(8, 3) == qu.find(8, 3));

        // qf.printConnections();
    }
}
