package JianZhiOffer;

/*题目描述
把只包含质因子2、3和5的数称作丑数（Ugly Number）。例如6、8都是丑数，但14不是，因为它包含质因子7。 
习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。

解题思路
判断一个数是不是丑数，最简单的方法就是让这个数不断除以2，3，5。要求第N个丑数，
只要从1开始，依次判断每个数是不是丑数，如果是，则相应的序号加1，直到序号为N，就是我们要的丑数了。
但是这种方法时间效率很，通常面试官不会满意这样的答案。因此我们需要一个时间复杂度更低的解法。

换个思路，我们只求丑数，不要去管非丑数。每个丑数必然是由小于它的某个丑数乘以2，3或5得到的，
这样我们把求得的丑数都保存下来，用之前的丑数分别乘以2，3，5，找出这三这种最小的并且大于当前最大丑数的值，
即为下一个我们要求的丑数。这种方法用空间换时间，时间复杂度为O(n)。*/
public class GetUglyNumber {
    public int GetUglyNumber_Solution(int index) {
        if(index==0)
            return 0;
        if(index==1)
            return 1;
        int t2=0,t3=0,t5=0;
        int[] res=new int[index];
        res[0]=1;
        for(int i=1;i<index;i++){
           res[i]=Math.min(res[t2]*2,Math.min(res[t3]*3,res[t5]*5));
            if(res[i]==res[t2]*2) t2++;
            if(res[i]==res[t3]*3) t3++;
            if(res[i]==res[t5]*5) t5++;
        }
        return res[index-1];
    }
}
