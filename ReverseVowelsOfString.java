package JianZhiOffer;


/*��ת�ַ����е�Ԫ���ַ�*/
/*ʹ��˫ָ��ָ�����ת������Ԫ���ַ���һ��ָ���ͷ��β������һ��ָ���β��ͷ������*/
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
