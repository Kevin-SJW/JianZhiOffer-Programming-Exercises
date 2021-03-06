package JianZhiOffer;

/**
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
}
*/

/*解题思路
通过对以上两棵树的观察，我们可以总结出这两棵树的根节点相同，
但它们的左、右两个子节点交换了位置。所以我们可以得出求一棵树的镜像的过程：
先前序遍历这棵树的每个节点，如果遍历到的节点有子节点，就交换它的两个子节点。
当交换完所有非叶节点的左、右子节点之后，就得到了树的镜像。*/
public class BinaryTreeMirror {
    public void Mirror(TreeNode root) {
        //当前节点为空，直接返回
        if(root == null)
            return;
        //当前节点没有叶子节点，直接返回
        if(root.left == null && root.right == null)
            return;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        //递归交换叶子节点
        if(root.left != null)
            Mirror(root.left);
        if(root.right != null)
            Mirror(root.right);
    }
}
