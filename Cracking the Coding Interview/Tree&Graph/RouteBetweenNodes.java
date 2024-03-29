import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class RouteBetweenNodes {
     public boolean validPath(int n, int[][] edges, int source, int destination) {
        // Store all edges in graph
        Map<Integer, List<Integer>> graph = new HashMap<Integer, List<Integer>>();
        for(int[] edge : edges) {
            int a = edge[0], b = edge[1];
            graph.computeIfAbsent(a, val -> new ArrayList<Integer>()).add(b);
            graph.computeIfAbsent(b, val -> new ArrayList<Integer>()).add(a);
        }

        boolean[] visited = new boolean[n];
        visited[source] = true;

        LinkedList<Integer> queue = new LinkedList<Integer>();
        queue.offer(source);

        while(!queue.isEmpty()) {
            int currNode = queue.poll();

            if(currNode == destination) return true;

            for(int nextNode : graph.get(currNode)) {
                if(!visited[nextNode]) {
                    visited[nextNode] = true;
                    queue.offer(nextNode);
                }
            }
        }

        return false;
    }
}