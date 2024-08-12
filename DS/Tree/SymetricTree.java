
public class SymetricTree {
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;
        if (p == null || q == null || p.val != q.val)
            return false;
        boolean resultLeft = isSameTree(p.left, q.right);
        boolean resultRight = isSameTree(p.right, q.left);
        return resultLeft && resultRight;
    }

    public boolean isSymmetric(TreeNode root) {
        if (root.left == null && root.right == null)
            return true;
        else
            return isSameTree(root.left, root.right);
    }

    public static void main(String[] args) {

    }
}
