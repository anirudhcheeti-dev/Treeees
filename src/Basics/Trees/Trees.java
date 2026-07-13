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
}
