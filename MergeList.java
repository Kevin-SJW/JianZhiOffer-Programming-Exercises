package JianZhiOffer;

/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
//�ݹ�ⷨ
/*��Ŀ����
���������������������������������ϳɺ��������Ȼ������Ҫ�ϳɺ���������㵥����������

����˼·
���ֽⷨ���ݹ�ͷǵݹ�*/
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
