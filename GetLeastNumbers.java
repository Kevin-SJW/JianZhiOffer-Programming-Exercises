package JianZhiOffer;

/*题目描述
输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4。

解题思路
两种方法：

法1：先对数组排序，然后取出前k个
法2：利用最大堆保存这k个数，每次只和堆顶比，如果比堆顶小，删除堆顶，新数入堆。*/
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
