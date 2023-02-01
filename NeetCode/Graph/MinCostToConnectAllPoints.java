/*
LeetCode: 1584. Min Cost to Connect All Points

You are given an array points representing integer coordinates of some points on a 2D-plane, where points[i] = [xi, yi].

The cost of connecting two points [xi, yi] and [xj, yj] is the manhattan distance between them: |xi - xj| + |yi - yj|, where |val| denotes the absolute value of val.

Return the minimum cost to make all points connected. All points are connected if there is exactly one simple path between any two points.
*/

class Solution {
    public int minCostConnectPoints(int[][] points) {
        // minHeap: [[edgeWeight, index of next node]] comparing edgeWeight for min heap
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a,b) -> a[0] - b[0]); 
        minHeap.add(new int[] {0,0});
        int numOfNodes = points.length;
        Set<Integer> visited = new HashSet<>();
        int cost = 0;

        // Prim's algorithm
        // when visited is equal to numOfNodes, end loop
        while(visited.size() < numOfNodes) {
            int[] arr = minHeap.poll();
            int weight = arr[0];
            int currNode = arr[1];

            if(visited.contains(currNode)) continue;

            visited.add(currNode);
            cost += weight;
            for(int nextNode = 0; nextNode < numOfNodes; nextNode++) {
                if(!visited.contains(nextNode)) {
                    int nextWeight = Math.abs(points[nextNode][0] - points[currNode][0]) +
                        Math.abs(points[nextNode][1] - points[currNode][1]);
                        minHeap.add(new int[] {nextWeight, nextNode});
                }
            }
        }
        return cost;
    }
}
