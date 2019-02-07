package JianZhiOffer;

public class NearestCommonAncestor {

}
/*形式一：当树为二叉排序树，如何寻找给定两节点的最低公共祖先？

形式二：当树为普通树，但每个节点中有指针指向其父节点，如何寻找？

形式三：当树为二叉树，每个节点仅有左右孩子指针，如何寻找？

形式四：当树为普通树，每个节点仅有左右孩子指针，如何寻找？*/

/*（1）排序二叉树

排序二叉树相对简单，根据排序二叉树的特点，根节点的左孩子永远小于根节点的值，右孩子的值永远大于根节点的值，对给定节点Node1、Node2，要找其最低公共祖先=>实际上就是寻找一个节点，使得节点的值位于两个节点的值中间，即原问题转化为二叉树的遍历问题。

     5   ======排序二叉树
    / \
   3   7
     / \       / \
 2  4 6  9
/  
1   
树的节点定义如下：
class TreeNode<T> {
	T data;
	TreeNode<T> leftChildren;
	TreeNode<T> rightChildren;
	public TreeNode(T data){
		this.data=data;
		this.leftChildren=null;   //此处是我的强迫症
		this.rightChildren=null;
	}
}
实现寻找父节点的核心代码如下：
	//通过遍历二叉排序树即可完成查找
	private static TreeNode<Character> findParent(TreeNode<Character> root,
			TreeNode<Character> node_1, TreeNode<Character> node_2) {
		
		if(root==null)
			return null;
		if(root.data>node_1.data && root.data>node_2.data)
			return findParent(root.leftChildren,node_1,node_2);
		else if(root.data<node_1.data && root.data<node_2.data)
			return findParent(root.rightChildren,node_1,node_2);
		else
			return root;   //用此条件判断两数之间也可(root.data-node_1.data)*(root.data-node_2.data)<0	
	}
实例：如上图排序二叉树，寻找节点2和节点4的公共最低祖先，结果为：
inOrder: 1 2 3 4 5 6 7 9 
parent:3

（2）普通树（每个节点有一个指向父节点的指针）

当树为普通树，但含有父节点指针的时候，要寻找公共节点，在节点正确给定的情况下，两者最高层的祖先就是根节点，实际上，从Node1，通过父节点指针，可以找到到Node1的所有祖先（最后一个为根节点），同理，也可以找到Node2节点的所有祖先，因此，本题即转化为=>求两链表的第一个公共节点（链表不一定等长）。

      A    ======普通树（带父节点指针）
     /|\
    B C K
  /  \
 D    E
/ \   /|\
F   G H I J
此题最重要的就是思想的转换。
树的节点定义为：

class TreeNode<T>{
	T data;
	TreeNode<T> parent=null;//若带父节点则加上
	//将其孩子节点存储为一个集合
	ArrayList<TreeNode<T>> children=new ArrayList<TreeNode<T>>();
	TreeNode(T data){
		this.data=data;
	}
}
寻找最低公共祖先核心代码：
	//寻找两链表的第一个公共节点
	private static TreeNode<Character> findParent(TreeNode<Character> root,
			TreeNode<Character> node1, TreeNode<Character> node2) {
		//预防空输入
		if(node1==null || node2==null)
			return null;
		//得到两链表的长度
		int len1=1,len2=1;
		TreeNode<Character> temp=node1;
		while(temp.parent!=null){
			len1++;
			temp=temp.parent;
		}
		temp=node2;
		while(temp.parent!=null){
			len2++;
			temp=temp.parent;
		}
		//长度小的链表先移动
		int step=Math.abs(len1-len2);
		TreeNode<Character> tempLong=len1>=len2?node1:node2;
		TreeNode<Character> tempShort=len1<len2?node1:node2;
		for(int i=0;i<step;i++){
			tempLong=tempLong.parent;
		}
		//两链表一起移动，直到找到相等的节点则返回
		for(int i=0;i<Math.min(len1, len2);i++){
			if(tempLong.data.equals(tempShort.data)){
				return tempLong;
			}
			tempLong=tempLong.parent;
			tempShort=tempShort.parent;
		}
		return null;
	}
	//普通树的前序遍历
	public static void preOrder(TreeNode<Character> root){
		if(root!=null){
			System.out.print(root.data+" ");
			for(int i=0;i<root.children.size();i++){
				preOrder(root.children.get(i));
			}
		}
	}
实例：如上图所示，寻找节点D和节点J的最低公共祖先，结果如下：
preOrder: A B D F G E H I J C K （此处打印的是树的前序遍历）
parent:B
（3）普通二叉树（无指向父节点的指针）

      当无指向父节点的指针时，要想找到最低公共祖先，可结合第二题的思维方式，考虑从根节点root开始，找出root到Node1和Node2的路径，通过路径找最低公共祖先，于是原问题转化为=>寻找二叉树中根节点到指定节点的路径（需要利用回溯的思想）+寻找链表最后一个公共节点的问题。

      A    ======普通二叉树
     /\
    B  C
  /  \
 D    E
/ \   /\
F   G H  I
树节点的定义：
class TreeNode<T> {
	T data;
	TreeNode<T> leftChildren;
	TreeNode<T> rightChildren;
	public TreeNode(T data){
		this.data=data;
		this.leftChildren=null;   //此处为强迫症
		this.rightChildren=null;
	}
}
寻找的过程主要分为两步：先找出路径，再求路径的最后一个公共节点，代码如下：
	//寻找两个链表的最后一个公共节点
	private static TreeNode<Character> findParent(
			ArrayList<TreeNode<Character>> path1,
			ArrayList<TreeNode<Character>> path2) {
		
		if(path1.size()==0 || path2.size()==0)
			return null; 
		TreeNode<Character> parent=null;
		int len=path1.size()<path2.size()?path1.size():path2.size();
		for(int i=0;i<len;i++){
			if(path1.get(i).data.equals(path2.get(i).data)){
				parent=path1.get(i);
			}
		}
		return parent;
	}
	
	//回溯方法寻找根节点到某节点的路径
	private static boolean findPath(TreeNode<Character> root,
			TreeNode<Character> node,ArrayList<TreeNode<Character>> path) {
		if(root==null || node==null){
			return false;
		}
		path.add(root);
		if(root.data.equals(node.data)){
			return true;
		}
		//递归左右孩子节点
		if(findPath(root.leftChildren,node,path)){
			return true;
		}
		if(findPath(root.rightChildren,node,path)){
			return true;
		}
		//为了回溯的正确性，必须由此操作
		path.remove(path.size()-1);
		return false;
	}
实例：寻找节点H到节点C的最低公共祖先，运行结果如下：
preOrder: A B D F G E H I C 
 
path1: A B E H 
 
path2: A C 
 
parent:A

（4）普通树

 对二叉树的操作，总是仅涉及最多左右孩子两个指针的问题，然而对于具有普通结构的树，每个节点的孩子节点数不同，我们就需要改变树节点的定义，可以考虑用一个结合来存储树的孩子节点的信息，思路同（3）一样，仅仅是在寻找路径时有点变化，即：（3）可看作（4）的特殊情况。

此次问题的升级，主要通过改变树的定义来实现的
      A    ======普通树（不带父节点指针）
     /|\
    B C K
  /  \
 D    E
/ \   /|\
F   G H I J
树的定义：
class TreeNode<T>{
	T data;
	//将其孩子节点存储为一个集合
	ArrayList<TreeNode<T>> children=new ArrayList<TreeNode<T>>();
	TreeNode(T data){
		this.data=data;
	}
}
充分利用JAVA集合的优点，将树的节点存储在集合中。
核心代码：

	//寻找两个链表的最后一个公共节点
	private static TreeNode<Character> findParent(
			ArrayList<TreeNode<Character>> path1,
			ArrayList<TreeNode<Character>> path2) {
		
		if(path1.size()==0 || path2.size()==0)
			return null; 
		TreeNode<Character> parent=null;
		int len=path1.size()<path2.size()?path1.size():path2.size();
		for(int i=0;i<len;i++){
			if(path1.get(i).data.equals(path2.get(i).data)){
				parent=path1.get(i);
			}
		}
		return parent;
	}
 
	//回溯方法寻找根节点到某节点的路径
	private static boolean findPath(TreeNode<Character> root,
			TreeNode<Character> node,ArrayList<TreeNode<Character>> path) {
		if(root==null || node==null){
			return false;
		}
		path.add(root);
		if(root.data.equals(node.data)){
			return true;
		}
		//与二叉树相比，由递归遍历左右孩子变为了递归遍历所有孩子节点
		for(int i=0;i<root.children.size();i++){
			if(findPath(root.children.get(i),node,path)){
				return true;
			}
		}
		//为了回溯的正确性，必须有此操作
		path.remove(path.size()-1);
		return false;
	}
实例：寻找节点G与节点J的最低公共祖先，运行结果如下：
preOrder: A B D F G E H I J C K 
 
path1: A B E J 
 
path2: A B D G 
 
parent:B      //正确的找到了最低公共祖先
*/


