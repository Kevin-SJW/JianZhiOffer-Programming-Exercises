package JianZhiOffer;

import java.util.Scanner;

/*2017华为实习生笔试
 * 1、字符串大小写转换：写出一个程序，输入一个字符串，然后输出大写转换为小写之后的字符串。
 * 不在字母范围内的字符，需丢弃。例如1：输入：ABC，输出：abc；例如2：输入：AbC输出：abc。*/
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
