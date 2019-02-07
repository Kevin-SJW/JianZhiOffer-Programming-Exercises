package JianZhiOffer;

import javax.swing.tree.TreeNode;
//1. ����ǰ��������л���������Ȼ��Ӽ�¼���ַ����з����л��������� 
//2. �����սڵ���Ҫ�������ַ����Ա�ǡ��硰#��
//�� String �಻ͬ���ǣ�StringBuffer �� StringBuilder ��Ķ����ܹ�����ε��޸ģ����Ҳ������µ�δʹ�ö���
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

