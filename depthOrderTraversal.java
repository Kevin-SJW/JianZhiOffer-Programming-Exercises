package JianZhiOffer;

import java.util.Stack;

import javax.swing.tree.TreeNode;

/*������ȱ������൱���ȸ�����
���÷ǵݹ�ʵ��
��Ҫ�������ݽṹ��ջ*/
public class depthOrderTraversal{
public static int depthOrderTraversal(TreeNode root){
    if(root==null){
        System.out.println("empty tree");
        return 0;
    }       
//     ArrayDeque<TreeNode> stack=new ArrayDeque<TreeNode>();
    Stack<TreeNode> stack = new Stack();   //Ҳ������ջʵ��
    stack.push(root);       
    while(stack.isEmpty()==false){
        TreeNode node=stack.pop();
        System.out.print(node.value+"    ");
        if(node.right!=null){
            stack.push(node.right);
        }
        if(node.left!=null){
            stack.push(node.left);
        }           
    }
    System.out.print("\n");
}
}

