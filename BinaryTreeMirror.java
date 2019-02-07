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

/*����˼·
ͨ���������������Ĺ۲죬���ǿ����ܽ�����������ĸ��ڵ���ͬ��
�����ǵ����������ӽڵ㽻����λ�á��������ǿ��Եó���һ�����ľ���Ĺ��̣�
��ǰ������������ÿ���ڵ㣬����������Ľڵ����ӽڵ㣬�ͽ������������ӽڵ㡣
�����������з�Ҷ�ڵ�������ӽڵ�֮�󣬾͵õ������ľ���*/
public class BinaryTreeMirror {
    public void Mirror(TreeNode root) {
        //��ǰ�ڵ�Ϊ�գ�ֱ�ӷ���
        if(root == null)
            return;
        //��ǰ�ڵ�û��Ҷ�ӽڵ㣬ֱ�ӷ���
        if(root.left == null && root.right == null)
            return;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        //�ݹ齻��Ҷ�ӽڵ�
        if(root.left != null)
            Mirror(root.left);
        if(root.right != null)
            Mirror(root.right);
    }
}
