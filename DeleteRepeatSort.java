package JianZhiOffer;


import java.util.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*�ڶ��⣺ȥ���ظ��ַ�������

����ʱ�����ƣ�������

�������ƣ� ������

���룺 �ַ���

����� ȥ���ظ��ַ���������ַ���

�������룺 aabcdefff

��������� abcdef*/
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
