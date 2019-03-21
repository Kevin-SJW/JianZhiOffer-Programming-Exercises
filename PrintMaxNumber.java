package JianZhiOffer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

/*最大数
给定一组非负整数，重新排列它们的顺序使之组成一个最大的整数。

示例 1:

输入: [10,2]
输出: 210
1
2
示例 2:

输入: [3,30,34,5,9]
输出: 9534330
1
2
说明: 输出结果可能非常大，所以你需要返回一个字符串而不是整数。*/
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
