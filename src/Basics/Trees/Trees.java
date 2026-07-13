package Basics.Trees;

public class Trees {
    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    private TreeNode root;

    public Trees() {
        root = null;
    }

        //Insert in the TREE
        public void insert(int val) {
            root=insertrecursive(root, val);
        }
        private TreeNode insertrecursive(TreeNode root, int val) {
            if (root == null) {
                return new TreeNode(val);
            }
            if(root.val < val) {
                root.right=insertrecursive(root.right, val);
            }
            else if(root.val > val) {
                root.left=insertrecursive(root.left, val);
            }
            return root;
        }

        //Display the TREE
        public void display(){
            displaytree(root);
            System.out.println();
        }

        private void displaytree(TreeNode root){
            if(root==null){
                return;
            }
            displaytree(root.left);
            System.out.print(root.val + " ");
            displaytree(root.right);
        }


        //Search in a TREE
        public boolean search(int val){
            return searchrecursive(root, val);
        }
        private boolean searchrecursive(TreeNode root, int val){
            if(root==null){
                return false;
            }
            if(root.val == val){
                return true;
            }
            if(root.val<val) {
                return searchrecursive(root.right, val);
            }
                return searchrecursive(root.left, val);
        }
            //Total count of the tree
            public int count(){
                return countrecursive(root);
            }
            private int countrecursive(TreeNode root){
            if(root==null){
                return 0;
            }
            return countrecursive(root.left) + countrecursive(root.right) + 1;
            }

            //The height of the TREE
            public int depth(){
                return depthrecursive(root);
            }
            private int depthrecursive(TreeNode root){
            if(root==null){
                return 0;
            }
            return (Math.max(depthrecursive(root.left), depthrecursive(root.right)))+1;
        }

            //Find minimum in a BST;
            public int minval(){
                return recursiveminval(root);
            }
            private int recursiveminval(TreeNode root){
            if(root==null) {
                return 0;
            }
                int c=0;
           while(root.left!=null){
               c=root.left.val;
               root.left=root.left.left;
           }
           return c;
    }

        public int sum(){
            return sumrecursive(root);
        }
        private int sumrecursive(TreeNode root){
        if(root==null){
            return 0;
        }
        return sumrecursive(root.left) + sumrecursive(root.right) + root.val;
        }
}
