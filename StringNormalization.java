package JianZhiOffer;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/*ͨ����������һ��Сд��ĸ��a-z����ɵ��ַ�����
 * ͳ���ַ�������ͬ���ַ����ֵĴ�����
 * �����ֵ�����ַ�������ִ���*/
public class StringNormalization {
	public static void main(String[] args){
		TreeMap<Character, Integer> map =new TreeMap<>();
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			String str=sc.nextLine();
//			char[] c=str.toCharArray()
			for(int i=0;i<str.length();i++){
				if(map.containsKey(str.charAt(i))){
					map.put(str.charAt(i), map.get(str.charAt(i))+1);
				}else{
					map.put(str.charAt(i), 1);
				}
			}
			for(Map.Entry<Character, Integer> entry:map.entrySet()){
				System.out.print(entry.getKey()+""+entry.getValue());
			}
			
		}
		
		
	}

}
