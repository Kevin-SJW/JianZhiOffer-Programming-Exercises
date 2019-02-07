package JianZhiOffer;

import java.util.ArrayList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

import java.util.LinkedList;
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
从上往下打印出二叉树的每个节点，同层节点从左至右打印。

解题思路
就是二叉树的层序遍历。借助一个队列就可以实现。
使用两个队列一个存放节点，一个存放值。先将根节点加入到队列中，然后遍历队列中的元素，遍历过程中，访问该元素的左右节点，再将左右子节点加入到队列中来。
注意Queue创建的方式：Queue<TreeNode> queue = new LinkedList<TreeNode>();
用add将元素添加到队列中，用remove来移除并返回队首元素。*/
public class PrintFromTopToBottom {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        if(root == null)
            return res;
        //Queue is abstract; 不能用 new Queue<TreeNode>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(queue.size() != 0){
            root = queue.remove();
            res.add(root.val);
            if(root.left != null){
                queue.add(root.left);
            }
            if(root.right != null){
                queue.add(root.right);
            }
        }
        return res;
    }
}
