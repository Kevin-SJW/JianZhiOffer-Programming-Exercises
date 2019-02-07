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
/*��Ŀ����
�������´�ӡ����������ÿ���ڵ㣬ͬ��ڵ�������Ҵ�ӡ��

����˼·
���Ƕ������Ĳ������������һ�����оͿ���ʵ�֡�
ʹ����������һ����Žڵ㣬һ�����ֵ���Ƚ����ڵ���뵽�����У�Ȼ����������е�Ԫ�أ����������У����ʸ�Ԫ�ص����ҽڵ㣬�ٽ������ӽڵ���뵽����������
ע��Queue�����ķ�ʽ��Queue<TreeNode> queue = new LinkedList<TreeNode>();
��add��Ԫ����ӵ������У���remove���Ƴ������ض���Ԫ�ء�*/
public class PrintFromTopToBottom {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        if(root == null)
            return res;
        //Queue is abstract; ������ new Queue<TreeNode>();
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
