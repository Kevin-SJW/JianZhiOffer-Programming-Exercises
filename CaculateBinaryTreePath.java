package JianZhiOffer;

import java.util.ArrayList;
/*计算从根节点到特定子节点的路径*/
public class CaculateBinaryTreePath {
	public void findPath(TreeNode root,ArrayList<Integer>() path,int target)){
		if(root==null){
			return;
		}
	path.add(root);
	if(root.value==target){
		return;
	}
	findPath(root.left,path,target);
	findPath(root.right,path,target);
	path.remove(path.size()-1);//在返回到父节点之前，在路径上删除当前节点
	}
}
