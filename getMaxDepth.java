package JianZhiOffer;

import javax.swing.tree.TreeNode;
/*������������*/
public class getMaxDepth {
	public static int getMaxDepth(TreeNode root){
		if(root==null)
			return 0;
		else{
		int left=getMaxDepth(root.left);
		int right=getMaxDepth(root.right);
		return 1+Math.max(left, right);
		}
	}

}
