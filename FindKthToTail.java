package JianZhiOffer;


/*��Ŀ����
����һ����������������е�����k����㡣

����˼·
�����˫ָ�뷨����������ָ�룬��һ��ָ��������ͷָ�뿪ʼ������ǰ��k-1�����ڶ���ָ�뱣�ֲ������ӵ�k����ʼ���ڶ���ָ��Ҳ��ʼ�������ͷָ�뿪ʼ��������������ָ��ľ��뱣����k-1������һ��ָ�뵽�������β�ڵ�ʱ���ڶ���ָ��պ�ָ������k���ڵ㡣

��עҪ��
1. ����ͷָ���Ƿ�Ϊ�գ���Ϊ����ֱ�ӷ��ػ�null
2. k�Ƿ�Ϊ0��kΪ0Ҳ����Ҫ���ҵ�����0���ڵ㣬���ڼ���һ���Ǵ�1��ʼ�ģ���������0û��ʵ�����壬����null
3. k�Ƿ񳬳�����ĳ��ȣ��������Ľڵ��������k������ָ����ƵĹ����л����nextָ���ָ��Ĵ������Գ�����Ҫ��һ���ж�*/

public class FindKthToTail {
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head == null || k == 0)
            return null;
        ListNode temp = head;
        //�ж�k�Ƿ񳬹�����ڵ�ĸ�����ע���� i < k - 1
        for(int i=0; i < k-1; i++){
            if(temp.next != null)
                temp = temp.next;
            else
                return null;
        }
        ListNode pA = head;
        ListNode pB = head;
        for(int i=0; i<k-1; i++)
            pA = pA.next;
        while(pA.next != null){
            pA = pA.next;
            pB = pB.next;
        }
        return pB;
    }
}
