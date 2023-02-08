package UnionFind;

public interface IUnionFind<T> {
    public void union(T firstPoint, T secondPoint);
    public boolean find(T firstPoint, T secondPoint);
}
