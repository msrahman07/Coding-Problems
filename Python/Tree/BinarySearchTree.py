from typing import Tuple
from InsertIntoBST import Solution

class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

COUNT = [10]

class Tree:
    def __init__(self):
        self._root = None
        self._number_of_elements = 0

    def insert(self, val):
        self._root = Solution.insertIntoBST(self, self._root, val)
        self._number_of_elements += 1

    def search(self, val) -> bool:
        return self._recursiveSearch(self._root, val)

    def _recursiveSearch(self, root, val) -> bool:
        if(not root):
            return False
        if(val == root.val):
            return True
        elif(val < root.val):
            return self._recursiveSearch(root.left, val)
        else:
            return self._recursiveSearch(root.right, val)

    def delete(self, val):
        temp = self._number_of_elements
        self._root = self._recursiveDelete(self._root, val)
        if(temp == self._number_of_elements):
            print("Node doesn't exist")
        else:
            print("Deleted node with val: ", val)
   


    def _recursiveDelete(self, root, val):
        if(not root):
            return root       
        if(val < root.val):
            root.left = self._recursiveDelete(root.left, val)
        elif(val > root.val):
            root.right = self._recursiveDelete(root.right, val)
        else:
            # Node has no child (leaf node)
            if(not root.left and not root.right):
                root = None
                self._number_of_elements -= 1
                return root
            elif(root.left and not root.right):
                temp = root.left
                self._number_of_elements -= 1
                root = None
                return temp
            elif(not root.left and root.right):
                temp = root.right
                root = None
                self._number_of_elements -= 1
                return temp
            else:
                successor_parent = root
                successor = root.right

                while(successor.left):
                    successor_parent = successor
                    successor = successor.left

                if(successor_parent != root):
                    successor_parent.left = successor.right
                else:
                    successor_parent.right = successor.right
                root.val = successor.val
                self._number_of_elements -= 1
            
        return root

    def print2DUtil(self, root, space) :
 
        # Base case
        if (root == None) :
            return
    
        # Increase distance between levels
        space += COUNT[0]
    
        # Process right child first
        self.print2DUtil(root.right, space)
    
        # Print current node after space
        # count
        print()
        for i in range(COUNT[0], space):
            print(end = " ")
        print(root.val)
    
        # Process left child
        self.print2DUtil(root.left, space)
    
    # Wrapper over print2DUtil()
    def print2D(self) :
        
        # space=[0]
        # Pass initial space count as 0
        self.print2DUtil(self._root, 0)

if __name__ == "__main__":
    T = Tree()
    T.insert(6)
    T.insert(4)
    T.insert(5)
    T.insert(8)
    T.insert(7)
    T.insert(3)
    T.insert(10)
    
    T.print2D()

    T.delete(8)
    T.delete(6)
    T.delete(10)
    T.delete(10)
    T.delete(7)
    print("\n")
    print("\n")
    T.print2D()
    print(T.search(3) == True)
    print(T.search(5) == True)
    print(T.search(20) == False)