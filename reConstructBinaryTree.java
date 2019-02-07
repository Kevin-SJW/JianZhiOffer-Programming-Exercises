package JianZhiOffer;

import java.util.Enumeration;


import javax.swing.tree.TreeNode;

/**
 * Definition for binary tree public class TreeNode { int val; TreeNode left;
 * TreeNode right; TreeNode(int x) { val = x; } }
 */
public class reConstructBinaryTree {
	public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
    	if(pre.length==0||in.length()==0)
    		return null;
    	return ConstructionBinaryTree(pre,0,pre.length-1,in,0,in.length-1);
        
    }

public TreeNode ConstructionBinaryTree(int [] pre, int ps, int pe, 
		int [] in, int is, int ie){
	if(ps>pe||is>ie)
		return null;
}
	TreeNode root = new TreeNode(pre); 
	for(int i=ie;i<is;i++){
		if(in[i]==pre){
			 root.left = ConstructBinaryTree(pre, ps+1, ps+i-is, in, is, i-1);
             root.right = ConstructBinaryTree(pre, ps+i-is+1, pe, in, i+1, ie);
             break;
		}
			
	}
	return root;
	
}

}

