package JianZhiOffer;

import java.util.Scanner;

/*��ѡ���˵ĳ��̣�

����1�����ڵ���3����7�ۣ�ʵ�����ڵ���50Ԫ���˷�10Ԫ

����2����10Ԫ��2Ԫ��ʵ�����ڵ���99���˷�6Ԫ

�������������ԭ�ۣ�����ѡ���ĸ����̱��ˣ��������뾫ȷ���֣������ 1��2��0��

����������

����һ�У���һ������Ʒ������ȡֵ����0��С��1�򣻵ڶ�����ԭ�ۣ�����0��С��1�򣬵�λԪ����ȷ����

���������

һ��������ѡ���ĸ�����

1������1��2������2��0�������
*/
public class ChooseCheaperVendor {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		double num=sc.nextDouble();//����
		double price=sc.nextDouble();//�۸�
		double sum1=num*price;
		double sum2=num*price;
		if(num>=3){sum1=sum1*0.7;}
		int n=(int)(sum2/10);
		if(sum2>=10){sum2=sum2-2*(double)n;}
		if(sum1<50){sum1+=10;}
		if(sum2<99){sum2+=6;}
		if(sum1==sum2){System.out.println(0);
			}else if(sum1>sum2){
			System.out.println(2);
		}else{
			System.out.println(1);
		}
		
		
	}

}
