package JianZhiOffer;

import java.text.BreakIterator;
import java.util.ArrayDeque;
import java.util.Queue;

import javax.print.attribute.standard.RequestingUserName;
import javax.swing.text.AbstractDocument.LeafElement;
import javax.swing.tree.TreeNode;
/*求二叉树的宽度*/
/*重点就是要用一个队列，实现节点从对头出队，并可以统计每一层的节点个数，当节点为0时，则退出while循环。*/
public class getMaxWidth {
	public static int getMaxWidth(TreeNode root){
		if(root==null)
			return 0;

//		ArrayDeque<TreeNode> queue new ArrayDeque<TreeNode>();
		Queue<TreeNode> queue=new ArrayDeque<TreeNode>();
		int maxWidth=1;
		queue.add(root); //入队
		
		while(true){
			int len=queue.size();
			if(len==0)
				break;
			while(len>0){
				TreeNode t =queue.poll();
			 	len--;
			 	if(t.left!=null)
			 		queue.add(t.left);//下一层节点入队
			 	if (t.right!=null) 
					queue.add(t.right);//下一层节点入队
				
			}
			maxWidth=Math.max(queue.size(), maxWidth);
		}
		return maxWidth;
	}

}
