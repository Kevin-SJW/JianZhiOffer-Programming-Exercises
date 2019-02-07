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
�������ö�����A��B���ж�B�ǲ���A���ӽṹ����ps������Լ��������������һ�������ӽṹ��

����˼·
�ݹ�˼�룬������ڵ���ͬ��ݹ����IsSubtree()��������ڵ㲻��ͬ��
���ж�root1����������roo2�Ƿ���ͬ�����ж���������root2�Ƿ���ͬ;
ע��ڵ�Ϊ�յ�������HasSubTree�У�ֻҪ����Ϊ�վͷ���false; IsSubtree�У�
Ҫ���ж�root2�����root2Ϊ�գ���˵���ڶ������������ˣ���ƥ��ɹ���*/
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
        //Ҫ���ж�roo2, ��Ȼ{8,8,7,9,2,#,#,#,#,4,7},{8,9,2}�����������ͨ������
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
