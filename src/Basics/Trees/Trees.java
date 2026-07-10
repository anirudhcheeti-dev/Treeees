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


    public static void main(String[] args) {

    }
}
