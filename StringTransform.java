package JianZhiOffer;

import java.util.Scanner;

/*2017��Ϊʵϰ������
 * 1���ַ�����Сдת����д��һ����������һ���ַ�����Ȼ�������дת��ΪСд֮����ַ�����
 * ������ĸ��Χ�ڵ��ַ����趪��������1�����룺ABC�������abc������2�����룺AbC�����abc��*/
public class StringTransform {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<str.length();i++){
			char c=str.charAt(i);
			if(c>='a'&&c<='z'){
				sb.append(c);
				
			}else if(c>='A'&&c<='Z'){
				sb.append((char)(c+32));
			}
		}
		System.out.println(sb.toString());
	}

}
