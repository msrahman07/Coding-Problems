package programming.problems;

import java.util.ArrayDeque;
import java.util.Deque;

public class FlattenMultiLevelDList {
    class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;
    };
    public Node flatten(Node head) {
        Deque<Node> stack = new ArrayDeque<Node>();
        Node curr = head;

        while(curr != null || !stack.isEmpty()) {
            if(curr.child != null) {
                Node childHold = curr.child;
                if(curr.next != null) {
                    stack.push(curr.next);
                }
                curr.next = childHold;

                childHold.prev = curr;
                curr.child = null;
            }

            if(curr.next == null && !stack.isEmpty()) {
                Node dummy = stack.pop();
                curr.next = dummy;
                dummy.prev = curr;
                System.out.println(dummy.val);
            } else {
                curr = curr.next;
            }
        }
        return head;
    }
    // Recursive solution
    /*
    public Node flatten(Node head) {
        if (head == null) {
            return null;
        }

        Node dummy = new Node();
        dummy.next = head;
        head.prev = dummy;

        flattenRecursive(dummy, head);

        // Disconnect the dummy node from the result and fix the prev pointers.
        head = dummy.next;
        head.prev = null;

        return head;
    }

    private Node flattenRecursive(Node prev, Node curr) {
        if (curr == null) {
            return prev;
        }

        prev.next = curr;
        curr.prev = prev;

        Node originalNext = curr.next; // Store the original next pointer.

        if (curr.child != null) {
            Node childTail = flattenRecursive(curr, curr.child);
            curr.child = null;

            if (originalNext != null) {
                childTail.next = originalNext;
                originalNext.prev = childTail;
            }

            prev = childTail;
        } else {
            prev = curr;
        }

        return flattenRecursive(prev, originalNext);
    }
    */
}
