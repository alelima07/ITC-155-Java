// Seattle Central College
// ITC 155 - Data Structures
// Student - Alessandra Lima

// countEmpty - Ch17, Ex2, p1077
// isEmpty -  A method that is added to the IntTree class.
// Write a method called countEmpty that returns the number of empty
// branches in a tree. An empty tree is considered to have one empty
// branch (the tree itself). For nonempty trees, your methods should
// count the total number of empty branches among the nodes of the tree.
// A leaf node has two empty branches, a node with one nonempty child
// has one empty branch, and a node with two nonempty childred has no
// empty branches.

public class IntTree {

		private IntTreeNode overallRoot;
		
		// Constructor to create Empty IntTree
		public IntTree() {
			overallRoot = null;
		}
		
		public void add(int value) {
			overallRoot = add(overallRoot, value);
		}
		
		private IntTreeNode add(IntTreeNode root, int value) {
			if(root == null) {
				root = new IntTreeNode(value);
			} else if(value <= root.data) {
				root.left = add(root.left, value);
			} else {
				root.right = add(root.right, value);
			}
			return root;
		}
		
		public int countEmpty(){
		    return countEmpty(overallRoot);
		}

		private int countEmpty(IntTreeNode root){
		    if(root == null){
		        return 1;
		    } else {
		        return countEmpty(root.left) + countEmpty(root.right);
		    }
		}
}
