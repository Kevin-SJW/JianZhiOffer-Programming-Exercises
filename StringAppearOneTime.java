package JianZhiOffer;

import java.util.*;
/*一、输出一个字符串中从后往前看最早出现且只出现一次的字符，如果所有字符出现次数都大于一次，则输出NULL*/
public class StringAppearOneTime {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (int i = str.length() - 1; i >= 0; i--) {
			if (map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
			} else {
				map.put(str.charAt(i), 1);
			}
		}
		boolean flag = true;
		for(Map.Entry<Character, Integer> entry:map.entrySet()){
			if(entry.getValue()==1){
				flag=false;
				System.out.println(entry.getKey());
				break;
			}
			
		}
		if(flag){
			System.out.println("NULL");
		}
		
		
	}
}