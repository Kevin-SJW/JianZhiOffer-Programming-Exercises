package JianZhiOffer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

/*�����
����һ��Ǹ������������������ǵ�˳��ʹ֮���һ������������

ʾ�� 1:

����: [10,2]
���: 210
1
2
ʾ�� 2:

����: [3,30,34,5,9]
���: 9534330
1
2
˵��: ���������ܷǳ�����������Ҫ����һ���ַ���������������*/
public class PrintMaxNumber {
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		String line=scanner.next();
		String[] strings=line.split("\\,");
		int[] str=new int[strings.length];
		for(int i=0;i<strings.length;i++){
			str[i]=Integer.valueOf(strings[i]);
		}
		System.out.println(PrintMaxNumber(str));
		
		
	}
	public static String PrintMaxNumber(int[] nums){
		String[] strings=new String[nums.length];
		for(int i=0;i<nums.length;i++){
			strings[i]=String.valueOf(nums[i]);
		}
		Arrays.sort(strings,new Comparator<String>() {
			public int compare(String a,String b){
				if((a+b).compareTo(b+a)>0){
					return -1;
				}else if((a+b).compareTo(b+a)<0){
					return 1;
				}else if((a+b).compareTo(b+a)==0){
					return 0;
				}
				return 0;	
				}
			
//			}
			
		});
		
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<strings.length;i++){
			sb.append(strings[i]);
		}
		return sb.toString();
	}
	
	

}
