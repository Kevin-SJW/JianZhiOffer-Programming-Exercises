package JianZhiOffer;

/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
//递归解法
/*题目描述
输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。

解题思路
两种解法：递归和非递归*/
public class MergeList{
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1 == null)
            return list2;
        else if(list2 == null)
            return list1;
        ListNode mergehead = null;
        if(list1.val <= list2.val){
            mergehead = list1;
            mergehead.next = Merge(list1.next,list2);
        }else{
            mergehead = list2;
            mergehead.next = Merge(list1, list2.next);
        }
        return mergehead;
    }
}
