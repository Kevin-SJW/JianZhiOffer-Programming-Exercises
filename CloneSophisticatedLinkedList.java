package JianZhiOffer;


/*
public class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
*/
/*题目描述
输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，
另一个特殊指针指向任意一个节点），返回结果为复制后复杂链表的head。
（注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）*/
public class CloneSophisticatedLinkedList {
    public RandomListNode Clone(RandomListNode pHead)
    {
        if(pHead == null)
            return null;
        //复制节点 A->B->C 变成 A->A'->B->B'->C->C'
        RandomListNode head = pHead;
        while(head != null){
            RandomListNode node = new RandomListNode(head.label);
            node.next = head.next;
            head.next = node;
            head = node.next;
        }
        //复制random
        head = pHead;
        while(head != null){
            head.next.random = head.random == null ? null : head.random.next;
            head = head.next.next;
        }
        //折分
        head = pHead;
        RandomListNode chead = head.next;
        while(head != null){
            RandomListNode node = head.next;
            head.next = node.next;
            node.next = node.next == null ? null : node.next.next;
            head = head.next;
        }
        return chead;
    }
}