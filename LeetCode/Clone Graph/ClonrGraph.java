/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class CloneGraph {
//     public Node cloneGraph(Node node) {
// 		if (node == null) {
// 			return null;
// 		}
// 		Queue<Node> queue = new LinkedList<Node>();
// 		queue.add(node);
// 		Map<Node, Node> map = new HashMap<>();
// 		map.put(node, new Node(node.val));

// 		while (!queue.isEmpty()) {
// 			Node cur = queue.poll();
// 			Node curCopy = map.get(cur);

// 			for (Node neighbor:cur.neighbors) {
// 				if (!map.containsKey(neighbor)) {
// 					map.put(neighbor, new Node(neighbor.val));
// 					queue.add(neighbor);
// 				}
// 				Node curNeighbor = map.get(neighbor);
// 				curCopy.neighbors.add(curNeighbor);
// 			}
// 		}
// 		return map.get(node);

// 	}
    public Map<Node, Node> originalToCreated = new HashMap<>();

    public Node cloneGraph(Node node) {
        if (node == null) return null;

        if (originalToCreated.containsKey(node)) return null;

        ArrayList<Node> childrenCreated = new ArrayList<>();
        Node nodeCreated = new Node(node.val, childrenCreated);
        originalToCreated.put(node, nodeCreated);
        List<Node> children = node.neighbors;
        for (Node child: children) {
            Node childCreated = cloneGraph(child);
            if (childCreated != null) {
                childrenCreated.add(childCreated);
            } else {
                childrenCreated.add(originalToCreated.get(child));
            }
        }

        return nodeCreated;
    }
}
