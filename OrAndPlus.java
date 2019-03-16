package JianZhiOffer;

/*

给定 x, k ，求满足 x + y = x | y 的第 k 小的正整数 y 。 | 是二进制的或(or)运算，例如 3 | 5 = 7。

比如当 x=5，k=1时返回 2，因为5+1=6 不等于 5|1=5，而 5+2=7 等于 5 | 2 = 7。


输入的描述:
每组测试用例仅包含一组数据，每组数据为两个正整数 x , k。 满足 0 < x , k ≤ 2,000,000,000。

输出描述:
输出一个数y。

示例1
输入
5 1
输出 
2*/
import java.util.Scanner;
public class OrAndPlus{
    public static void main(String[] args) {
         
        Scanner scan = new Scanner(System.in);    
        while(scan.hasNext()){
            long x = scan.nextInt();
            long k = scan.nextInt();
            long bitNum = 1; //指向x的当前位
            long ans =0 ;   //y的各位的值累加，累加完毕得到y
            while( k >0){
                if( (x & bitNum )== 0){   //如果当前x位为0
                    ans += (bitNum*(k & 1)); //则将k的最后一位取出来与填入x对应的为零的位并累加这一位的值
                    k = k >> 1;         //k取出最后一位，即向右移一位
                }
                //上面无论x的当前位为0或1,bitNum都向左移一位
                    bitNum = bitNum << 1;
            }
            System.out.println(ans);//最后输出ans，即是y的值。
        }
    }
}
