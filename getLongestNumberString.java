package JianZhiOffer;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

/*2018��Ϊʵϰ
 * ��һ�⣺����һ���ַ���������ַ���������������ִ��������������ִ��ĳ�����������м��Զ��ţ�����������
 * ������ڳ���һ���ĵ��������ִ����������һ���������ִ���

������abcd12345ed125ss123058789

output:   123058789,9*/
public class getLongestNumberString {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		while(sc.hasNext()){
			String str=sc.next();
			List<Integer> list=new ArrayList<>();
			int max=0;
			int now;
			StringBuffer nowNumBuffer = new StringBuffer();
			StringBuffer maxNumBuffer = null;
			for(int i=0;i<str.length();i++){
				now=0;
				nowNumBuffer= new StringBuffer();
				while(i<str.length()&&str.charAt(i)>=48&&str.charAt(i)<=57){ //�ж��Ƿ�Ϊ����
					nowNumBuffer.append(String.valueOf(str.charAt(i)));
					now++;
					i++;
				}
					
				if(now>0){list.add(now);}
				if(now>0&&now>=max){
					max=now;
					maxNumBuffer=nowNumBuffer;
				}
				
			}
			System.out.println("maxNumBuffer:"+maxNumBuffer+",max:"+maxNumBuffer.length());
		}
		
	}
}
