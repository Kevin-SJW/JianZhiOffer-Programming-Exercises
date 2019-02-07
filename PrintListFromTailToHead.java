package JianZhiOffer;

/**
*    public class ListNode {
*        int val;
*        ListNode next = null;
*
*        ListNode(int val) {
*            this.val = val;
*        }
*    }
*
*/
import java.util.ArrayList;
public class PrintListFromTailToHead {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if (listNode==null)
            return new ArrayList<Integer>();
        ListNode head = listNode;
        ListNode cur =listNode.next;
        while(cur!=null){
            ListNode temp=cur.next;
            cur.next=head;
            head=cur;
            cur=temp;
        }
        //此时listNode的next还指向第二个节点，要避免死循环，还需要listNode.next=NUll
        listNode.next=null;
        ArrayList<Integer> res = new ArrayList<Integer>();
        while(head!=null){
            res.add(head.val);
            head=head.next;
        }
        return res;
    }
}