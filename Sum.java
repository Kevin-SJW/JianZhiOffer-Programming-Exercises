package JianZhiOffer;

import java.util.Scanner;
/*��Ŀ����
��1+2+3+��+n��Ҫ����ʹ�ó˳�����for��while��if��else��switch��case�ȹؼ��ּ������ж���䣨A?B:C����

����˼·
�ۼӲ�����ѭ���Ļ����Ǿ����Եݹ�ɡ�
�жϵݹ����ֹ���������� if �� switch���Ǿ��ö�·����档
(n > 0) && (sum += Sum_Solution(n-1))>0
ֻ������n > 0��������&&����ı��ʽ�Ż�ִ�С�*/
public class Sum {
	
	public static int Sum(int n){
		int sum=n;
		boolean t=(n>0)&&(sum+=Sum(n-1))>0;
		return sum;
	}
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("please input a integer n:");
		int n = scanner.nextInt();
		System.out.println(Sum(n));
		
	}

}
