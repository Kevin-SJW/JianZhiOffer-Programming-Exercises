package JianZhiOffer;

/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/

/*��Ŀ����
����һ��������ת��������������ı�ͷ��

����˼·
��������ָ�룬headΪ��ǰ�ڵ㣬preΪ��ǰ�ڵ��ǰһ���ڵ㣬nextΪ��ǰ�ڵ����һ���ڵ㣬
��Ҫpre��next��Ŀ�����õ�ǰ�ڵ��pre->head->next1->next2���pre<-head next1->next2�Ĺ����У�
��pre�ýڵ㷴ת��ָ����next�ڵ㱣��next1�ڵ��ֹ����Ͽ�.

��Ҫע��ĵ㣺
1����������ͷ�����null���򷵻�null
2��������ѵĿ���*/
public class ReverseList {
    public ListNode ReverseList(ListNode head) {
        if(head == null)
            return null;
        ListNode pre = null;
        ListNode next = null;

        while(head != null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}
