package JianZhiOffer;

import java.util.ArrayList;

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
����һ�Ŷ�������һ����������ӡ���������н��ֵ�ĺ�Ϊ��������������·����
·������Ϊ�����ĸ���㿪ʼ����һֱ��Ҷ����������Ľ���γ�һ��·����

����˼·
��ǰ������ķ�ʽ���ʵ�ĳһ���ʱ���Ѹý����ӵ�·���ϣ�����Ŀ��ֵ��ȥ�ýڵ��ֵ��
����ý��ΪҶ��㲢��Ŀ��ֵ��ȥ�ýڵ��ֵ�պ�Ϊ0����ǰ��·������Ҫ��
���ǰѼ���res�����С������ǰ��㲻��Ҷ��㣬
��������������ӽ�㡣��ǰ�����ʽ����󣬵ݹ麯�����Զ��ص����ĸ���㡣
��������ں����˳�֮ǰҪ��·����ɾ����ǰ��㣬��ȷ�����ظ����ʱ·���պ��ǴӸ���㵽������·����*/
public class ValuePathInBinaryTree {
    ArrayList<ArrayList<Integer> > res = new ArrayList<ArrayList<Integer> >();
    ArrayList<Integer> temp = new ArrayList<Integer>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        if(root == null)
            return res;
        target -= root.val;
        temp.add(root.val);
        if(target == 0 && root.left == null && root.right == null)
            res.add(new ArrayList<Integer>(temp));
        else{
            FindPath(root.left, target);
            FindPath(root.right, target);
        }
        temp.remove(temp.size()-1);
        return res;
    }        
}
