package JianZhiOffer;

/*1.����������������һ�����������������λ���������������ÿһλ���֣�����

֮��ո�ֿ����͵����������ֵ��������Ŀ�޶��������������������λ����

��Ŀ�������ӣ�

���룺-12345

�����-5 4 3 2 1

          -54321*/
import java.util.Scanner;
public class ReverseOrderOfNumber{
    public static void main(String[] args) throws Exception
    {
      Scanner sc = new Scanner(System.in);
      while(sc.hasNext())
      {
         String str = sc.nextLine();
         int flag = 0; //�Ƿ��Ǹ�����־λ
         if(str.contains("-"))
        {
          flag = 1;
          str = str.substring(1);
        } 
        int len = str.length();
        System.out.println("���ֵĳ���Ϊ"+len);
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