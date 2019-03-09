package JianZhiOffer;

import java.util.Scanner;

/*按要求分解字符串，输入两个数M，N；M代表输入的M串字符串，N代表输出的每串字符串的位数，
 * 不够补0。例如：输入2,8， “abc” ，“123456789”，则输出为“abc00000”,“12345678“,”90000000”*/
public class DecomposeString {


		public static void main(String[] args) {
		        int M,N;
		        Scanner input = new Scanner(System.in);
		        M = input.nextInt();
		        N = input.nextInt();
		        String[] strings = new String[M];
		        for(int i = 0;i< M ;i ++)
		        {
		            strings[i] = input.next();
		        }
		        int  i = 0;
		        while(i < strings.length)
		        {
		            String temp = strings[i];
		            int length = temp.length();
		            if(length <= N)
		            {
		                for(int j = 0; j < N - length;j++)
		                {    
		                    temp += '0';
		                }
		                System.out.println(temp);
		                temp = "";
		                i++;
		            }
		            else
		            {
		              System.out.println(temp.substring(0, N));
		              strings[i] = temp.substring(N);    
		            }
		                
		        }
		    }


}
