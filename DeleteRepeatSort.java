package JianZhiOffer;


import java.util.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*第二题：去除重复字符并排序

运行时间限制：无限制

内容限制： 无限制

输入： 字符串

输出： 去除重复字符并排序的字符串

样例输入： aabcdefff

样例输出： abcdef*/
public class DeleteRepeatSort {
	public static void main(String[] args){
		Set<Character> set = new HashSet<Character>();
		List<Character> list=new ArrayList<Character>();
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			String str=sc.next();
			char[] c=str.toCharArray();
			for(int i =0;i<c.length;i++){
				set.add(c[i]);
			}
			for(Object s:set){
				list.add((Character) s);
			}
			Collections.sort(list);
			for(int i=0;i<list.size();i++){
				System.out.print(list.get(i));
			}
			
			
		}
	}

}
