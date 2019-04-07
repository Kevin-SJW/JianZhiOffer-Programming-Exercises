package JianZhiOffer;


/*反转字符串中的元音字符*/
/*使用双指针指向待反转的两个元音字符，一个指针从头向尾遍历，一个指针从尾到头遍历。*/
import java.util.*;
public class ReverseVowelsOfString {

	private final static HashSet<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
	public static String ReverseVowelsOfString(String s){
		int i=0,j=s.length()-1;
		char[] result=new char[s.length()];
		while(i<=j){
			char ci=s.charAt(i);
			char cj=s.charAt(j);
			if(!vowels.contains(ci)){
				result[i++]=ci;
			}else if(!vowels.contains(cj)){
				result[j--]=cj;
			}else{
				result[i++]=cj;
				result[j--]=ci;
			}
		}
		return new String(result);
		
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String string=sc.nextLine();
		System.out.println(ReverseVowelsOfString(string));
	}
	
}
