package JianZhiOffer;

import javax.swing.tree.TreeNode;

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

/*题目描述
输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）

解题思路
递归思想，如果根节点相同则递归调用IsSubtree()，如果根节点不相同，
则判断root1的左子树和roo2是否相同，再判断右子树和root2是否相同;
注意节点为空的条件，HasSubTree中，只要有树为空就返回false; IsSubtree中，
要先判断root2，如果root2为空，则说明第二棵树遍历完了，即匹配成功。*/
public class HasSubTree {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root1 == null || root2 == null){
            return false;
        }
        return IsSubtree(root1, root2) || 
               HasSubtree(root1.left, root2) ||
               HasSubtree(root1.right, root2);
    }
    public boolean IsSubtree(TreeNode root1, TreeNode root2){
        //要先判断roo2, 不然{8,8,7,9,2,#,#,#,#,4,7},{8,9,2}这个测试用例通不过。
        if(root2 == null)
            return true;
        if(root1 == null)
            return false;
        if(root1.val == root2.val){
            return IsSubtree(root1.left, root2.left) && 
                IsSubtree(root1.right, root2.right);
        }else
            return false;
    }
}
