package JianZhiOffer;

import java.util.Scanner;

/*��Ҫ��ֽ��ַ���������������M��N��M���������M���ַ�����N���������ÿ���ַ�����λ����
 * ������0�����磺����2,8�� ��abc�� ����123456789���������Ϊ��abc00000��,��12345678��,��90000000��*/
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
