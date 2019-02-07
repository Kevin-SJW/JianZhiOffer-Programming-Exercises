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
/*��Ŀ����
����һ�ö��������������ö���������ת����һ�������˫������Ҫ���ܴ����κ��µĽ�㣬ֻ�ܵ������н��ָ���ָ��

����˼·
��Ŀ���ܱȽ�����⣬���Կ����µ�ͼ��������һ�ö�����������Ҫ����ұߵ�˫������
�ڶ����������У����ӽ���ֵ����С�ڸ�����ֵ�����ӽڵ��ֵ���Ǵ��ڸ�����ֵ�����������ת��������˫������ʱ��
ԭ��ָ�����ӽ���ָ�����Ϊ������ָ��ǰһ������ָ�룬ԭ��ָ�����ӽڵ��ָ�����Ϊ������ָ���һ������ָ�롣
��Ϊ��������ǰ��մ�С�����˳�������������������������������������е�ÿһ���ڵ�õ���������Ҫ����ź���ġ�
�����������£�
ÿ�α����ڵ�����ӡ��Һ��ӣ�������ָ��ת�������β�ڵ㣬����ĩβָ����Һ���ָ���Լ���
�Һ���ָ��ڵ���Һ��ӡ����û���Һ��Ӿͷ��ء���һ���̿����õݹ�ʵ�֡�*/
public class BinarySearchBilateralLinkedList {
    TreeNode head = null;
    TreeNode end = null;
    public TreeNode Convert(TreeNode pRootOfTree) {
        ConvertSub(pRootOfTree);
        return head;
    }
    public void ConvertSub(TreeNode pRootOfTree) {
        if(pRootOfTree == null)
            return ;
        Convert(pRootOfTree.left);
        if(end == null){
            head = pRootOfTree;
            end = pRootOfTree;
        }else{
            end.right = pRootOfTree;
            pRootOfTree.left = end;
            end = pRootOfTree;
        }
        Convert(pRootOfTree.right);
    }
}
//non-recursive
/*import java.util.Stack;
public class Solution {
    public TreeNode Convert(TreeNode pRootOfTree) {
        TreeNode head = null;
        TreeNode pre = null;
        Stack<TreeNode> stack = new Stack<>();
        while(pRootOfTree != null || !stack.isEmpty()){
            while(pRootOfTree != null){
                stack.push(pRootOfTree);
                pRootOfTree = pRootOfTree.left;
            }
            pRootOfTree = stack.pop();
            if(head == null){
                head = pRootOfTree;
                pre = pRootOfTree;
            }else{
                pre.right = pRootOfTree;
                pRootOfTree.left = pre;
                pre = pRootOfTree;
            }
            pRootOfTree = pRootOfTree.right;
        }
        return head;
    }
}*/
