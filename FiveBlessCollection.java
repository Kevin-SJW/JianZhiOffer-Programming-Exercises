package JianZhiOffer;

import java.util.Scanner;

/*���帣����0��1��ɵĳ���Ϊ5���ַ�������ÿ�������õ��ĸ�����ÿһλ����һ�ָ�����
 * 1��ʾ�Ѿ���øø����������͸���������һ�ţ������ȡһ��С��10���Ŷӣ�����Ŷ������Լ���������帣��

�����������������ɸ���11010������00110������0,1��ɵĳ��ȵ���5���ַ���������ָ���Ŷ���ÿ���˸�����������
ע��1��Ҳ������һ���Ŷӣ�1�˿�����0-5�Ÿ����������������ظ���
���������������Ŷ��ܴ���������帣��
*/
public class FiveBlessCollection {
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			String s = in.nextLine();
			int len = s.length();
			int[] count = new int[5];
			for(int i=0;i<5;i++)
			{
				for(int j=0;j<len/5;j++)
					count[i] += s.charAt(5*j+i)-48;
			}
			int min = Integer.MAX_VALUE;
			for(int i=0;i<5;i++)
			{
				if(count[i] < min)
					min = count[i];
			}
			System.out.println(min);
		}
		in.close();
	}



}
