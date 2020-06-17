// Seattle Central College
// ITC 155 - Data Structures
// Student - Alessandra Lima
// Final Exam
// Write a method called isFull that return true if a binary tree is
// full and false if it is not. A full binary tree is one in which 
// every node has 0 or 2 children. By definition, an empty tree is
// considered full.

public class IntTree {
    private IntTreeNode overallRoot;

    public IntTree() {
    	overallRoot = null;
    }
    
    public IntTree(int max) {
        if (max <= 0) {
            throw new IllegalArgumentException("max: " + max);
        }
        overallRoot = buildTree(1, max);
    }

    private IntTreeNode buildTree(int n, int max) {
        if (n > max) {
            return null;
        } else {
            return new IntTreeNode(n, buildTree(2 * n, max),
                                   buildTree(2 * n + 1, max));
        }
    }
    
// Constructor for no parameters that redirects to private constructor
    public boolean isFull() {
    	return isFull(overallRoot);
    }
    
// Constructor with IntTreeNode parameter
    private boolean isFull(IntTreeNode root) {
    	
// If tree is empty, return true, as an empty tree is considered full.
// Else if the left branch is not null, but the right branch is, return false
    	if (root == null) {
    		return true;	
    	} else if (root.left != null && root.right == null) {
    		return false;
    	} else if (root.right != null && root.left == null) {
    		return false;
    	} else {
    		return isFull(root.left) && isFull(root.right);
    		
    	} 
    }
    
    public int countEmpty() {
    	return countEmpty(overallRoot);
    }
    
    private int countEmpty(IntTreeNode root) {
    	
    	if (root == null) {
    		return 1;
    	} else if (root.left == null) {
    		return 1 + countEmpty(root.right);
    	} else if (root.right == null) {
    		return 1 + countEmpty(root.left);
    		
    	} else {
    		return countEmpty(root.left) + countEmpty(root.right);
    	}
    }
    
    public void printPreorder() {
        System.out.print("preorder:");
        printPreorder(overallRoot);
        System.out.println();
    }

    private void printPreorder(IntTreeNode root) {
        if (root != null) {
            System.out.print(" " + root.data);
            printPreorder(root.left);
            printPreorder(root.right);
        }
    }

    public void printInorder() {
        System.out.print("inorder:");
        printInorder(overallRoot);
        System.out.println();
    }

    private void printInorder(IntTreeNode root) {
        if (root != null) {
            printInorder(root.left);
            System.out.print(" " + root.data);
            printInorder(root.right);
        }
    }

    public void printPostorder() {
        System.out.print("postorder:");
        printPostorder(overallRoot);
        System.out.println();
    }

    private void printPostorder(IntTreeNode root) {
        if (root != null) {
            printPostorder(root.left);
            printPostorder(root.right);
            System.out.print(" " + root.data);
        }
    }

    public void printSideways() {
        printSideways(overallRoot, 0);
    }

    private void printSideways(IntTreeNode root, int level) {
        if (root != null) {
            printSideways(root.right, level + 1);
            for (int i = 0; i < level; i++) {
                System.out.print("    ");
            }
            System.out.println(root.data);
            printSideways(root.left, level + 1);
        }
    }
}