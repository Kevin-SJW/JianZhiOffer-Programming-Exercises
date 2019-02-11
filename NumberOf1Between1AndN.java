package JianZhiOffer;

/*题目描述
求出1~13的整数中1出现的次数,并算出100~1300的整数中1出现的次数？为此他特别数了一下1~13中包含1的数字有1、10、11、12、13因此共出现6次,但是对于后面问题他就没辙了。ACMer希望你们帮帮他,并把问题更加普遍化,可以很快的求出任意非负整数区间中1出现的次数（从1 到 n 中1出现的次数）。

解题思路
三种解法：

法一：依次遍历每个数，判断每个数里面是否包含1
法二：同法一，将数字转成字符串，直接判断
法三：归纳法*/

public class NumberOf1Between1AndN {
    public int NumberOf1Between1AndN_Solution(int n) {
        int res = 0;
        for(int i = 1; i <= n; i++)
            res += number1(i);
        return res;
    }

    public int number1(int n){
        int res = 0;
        while(n>0){
            if(n % 10 == 1)
                res++;
            n /= 10;
        }
        return res;
    }
}

/*public class Solution {
    public int NumberOf1Between1AndN_Solution(int n) {
        int res = 0;
        StringBuffer s = new StringBuffer();
        for(int i = 1; i<=n; i++){
            s.append(i);
        }
        String str = s.toString();
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '1')
                res++;
        }
        return res;
    }
}*/

/*public class Solution {
    public int NumberOf1Between1AndN_Solution(int n) {
        int res = 0;
        int cur = 0, before = 0, after = 0;
        int i = 1;
        while(i<=n){
            before = n/(i*10);
            cur = (n/i)%10;
            after = n - n/i*i;
            if(cur == 0){
                // 如果为0,出现1的次数由高位决定,等于高位数字 * 当前位数
                res += before * i;
            }else if(cur == 1){
                // 如果为1, 出现1的次数由高位和低位决定,高位*当前位+低位+1
                res += before * i + after + 1;
            }else{
                // 如果大于1, 出现1的次数由高位决定,（高位数字+1）* 当前位数
                res += (before + 1) * i;
            }
            i *= 10;
        }
        return res;
    }
}*/
