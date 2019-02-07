package JianZhiOffer;

import java.util.Stack;

import javax.swing.tree.TreeNode;

/*深度优先遍历，相当于先根遍历
采用非递归实现
需要辅助数据结构：栈*/
public class depthOrderTraversal{
public static int depthOrderTraversal(TreeNode root){
    if(root==null){
        System.out.println("empty tree");
        return 0;
    }       
//     ArrayDeque<TreeNode> stack=new ArrayDeque<TreeNode>();
    Stack<TreeNode> stack = new Stack();   //也可以用栈实现
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

