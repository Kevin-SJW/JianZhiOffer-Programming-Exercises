package JianZhiOffer;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

/*2018华为实习
 * 第一题：给定一个字符串，输出字符串中连续最长的数字串，并把这个最长数字串的长度输出来，中间以逗号（，）隔开。
 * 如果存在长度一样的的连续数字串，返回最后一个连续数字串。

样例：abcd12345ed125ss123058789

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
				while(i<str.length()&&str.charAt(i)>=48&&str.charAt(i)<=57){ //判断是否为数字
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
