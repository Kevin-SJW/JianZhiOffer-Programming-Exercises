package JianZhiOffer;

/*��Ŀ����
���1~13��������1���ֵĴ���,�����100~1300��������1���ֵĴ�����Ϊ�����ر�����һ��1~13�а���1��������1��10��11��12��13��˹�����6��,���Ƕ��ں�����������û���ˡ�ACMerϣ�����ǰ����,������������ձ黯,���Ժܿ���������Ǹ�����������1���ֵĴ�������1 �� n ��1���ֵĴ�������

����˼·
���ֽⷨ��

��һ�����α���ÿ�������ж�ÿ���������Ƿ����1
������ͬ��һ��������ת���ַ�����ֱ���ж�
���������ɷ�*/

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
                // ���Ϊ0,����1�Ĵ����ɸ�λ����,���ڸ�λ���� * ��ǰλ��
                res += before * i;
            }else if(cur == 1){
                // ���Ϊ1, ����1�Ĵ����ɸ�λ�͵�λ����,��λ*��ǰλ+��λ+1
                res += before * i + after + 1;
            }else{
                // �������1, ����1�Ĵ����ɸ�λ����,����λ����+1��* ��ǰλ��
                res += (before + 1) * i;
            }
            i *= 10;
        }
        return res;
    }
}*/
