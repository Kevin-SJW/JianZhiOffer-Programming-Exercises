package JianZhiOffer;

/*��Ŀ����
����n���������ҳ�������С��K��������������4,5,1,6,2,7,3,8��8�����֣�����С��4��������1,2,3,4��

����˼·
���ַ�����

��1���ȶ���������Ȼ��ȡ��ǰk��
��2���������ѱ�����k������ÿ��ֻ�ͶѶ��ȣ�����ȶѶ�С��ɾ���Ѷ���������ѡ�*/
import java.util.ArrayList;
import java.util.Arrays;
public class GetLeastNumbers {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        if(input == null || k ==0 || k > input.length)
            return res;
        Arrays.sort(input);
        for(int i=0; i<k; i++)
            res.add(input[i]);
        return res;
    }
}
