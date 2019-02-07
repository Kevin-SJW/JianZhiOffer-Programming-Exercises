package JianZhiOffer;

import javax.swing.tree.TreeNode;
//1. 利用前序遍历序列化二叉树，然后从记录的字符串中反序列化二叉树。 
//2. 遇到空节点需要用特殊字符加以标记。如“#”
//和 String 类不同的是，StringBuffer 和 StringBuilder 类的对象能够被多次的修改，并且不产生新的未使用对象。
public class Serialize {
    public int index = -1;
    String Serialize(TreeNode root) {
    	StringBuilder s =new StringBuilder();
    	if(root==null){
    		s.append("#,");
    		return s.toString();
    	}
    	s.append(root.val+",");
    	s.append(root.left);
    	s.append(root.right);
    	return s.toString();
    }
    TreeNode Deserialize(String str){
    	index++;
    	String[] DLRseq=str.split(",");
    	TreeNode leave =null;
    	if(!DLRseq[index].equals("#")){
    		leave=new TreeNode(Integer.valueOf(DLRseq[index]));
    		leave.left=Deserialize(str);
    		leave.right=Deserialize(str);
    	}
    	return leave;
    }
}

