package JianZhiOffer;

import java.util.ArrayList;
/*����Ӹ��ڵ㵽�ض��ӽڵ��·��*/
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
	path.remove(path.size()-1);//�ڷ��ص����ڵ�֮ǰ����·����ɾ����ǰ�ڵ�
	}
}
