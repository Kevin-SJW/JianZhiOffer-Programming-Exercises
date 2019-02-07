package JianZhiOffer;

import java.text.BreakIterator;
import java.util.ArrayDeque;
import java.util.Queue;

import javax.print.attribute.standard.RequestingUserName;
import javax.swing.text.AbstractDocument.LeafElement;
import javax.swing.tree.TreeNode;
/*��������Ŀ��*/
/*�ص����Ҫ��һ�����У�ʵ�ֽڵ�Ӷ�ͷ���ӣ�������ͳ��ÿһ��Ľڵ���������ڵ�Ϊ0ʱ�����˳�whileѭ����*/
public class getMaxWidth {
	public static int getMaxWidth(TreeNode root){
		if(root==null)
			return 0;

//		ArrayDeque<TreeNode> queue new ArrayDeque<TreeNode>();
		Queue<TreeNode> queue=new ArrayDeque<TreeNode>();
		int maxWidth=1;
		queue.add(root); //���
		
		while(true){
			int len=queue.size();
			if(len==0)
				break;
			while(len>0){
				TreeNode t =queue.poll();
			 	len--;
			 	if(t.left!=null)
			 		queue.add(t.left);//��һ��ڵ����
			 	if (t.right!=null) 
					queue.add(t.right);//��һ��ڵ����
				
			}
			maxWidth=Math.max(queue.size(), maxWidth);
		}
		return maxWidth;
	}

}
