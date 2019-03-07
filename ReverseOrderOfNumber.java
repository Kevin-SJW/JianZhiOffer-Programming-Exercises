package JianZhiOffer;

/*1.题意大概描述：输入一个整数，输出整数的位数，倒序输出它的每一位数字（数字

之间空格分开）和倒序的连续数值，而且题目限定了输入的整数不超过五位数。

题目所给例子：

输入：-12345

输出：-5 4 3 2 1

          -54321*/
import java.util.Scanner;
public class ReverseOrderOfNumber{
    public static void main(String[] args) throws Exception
    {
      Scanner sc = new Scanner(System.in);
      while(sc.hasNext())
      {
         String str = sc.nextLine();
         int flag = 0; //是否是负数标志位
         if(str.contains("-"))
        {
          flag = 1;
          str = str.substring(1);
        } 
        int len = str.length();
        System.out.println("数字的长度为"+len);
       if(flag == 1)
         System.out.print("-");
       for(int i = len-1; i >= 0;i--)
      { 
         if(i != 0)
           System.out.print(str.charAt(i)+" ");
         else
           System.out.println(str.charAt(i));
      }
       if(flag == 1)
         System.out.print("-");  
         System.out.println(new StringBuffer(str).reverse().toString());  
      }
    }
 }