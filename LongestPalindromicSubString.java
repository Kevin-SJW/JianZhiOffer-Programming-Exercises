package JianZhiOffer;

/*���ȱ��^��

��abba����һ���ַ���Ϊ��������abba�У�һ��ͬӵ��ż�����֡���1λ=������1λ����2λ=������2λ......��Nλ=������Nλ
��aba����һ���ַ���Ϊ��������aba�С�һ��ͬӵ���������ַ����ų������м���Ǹ��ַ��󣬵�1λ=������1λ......��Nλ=������Nλ
���ԣ�����ҵ�һ������Ϊlen1���Ӵ������ǽ���ȥ�y�����Ƿ����㣬��1λ=������1λ����2λ=������2λ......��Nλ=������Nλ��Ҳ����˵��ȥ�y�Դ�ͷβ���е㣬�ַ��Ƿ���һ��Ӧ��ȡ�*/
public class LongestPalindromicSubString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longestPalindrome("babcbabcbaccba"));
	}

	public static String longestPalindrome(String s){
		int maxPalinLen=0;
		String longestPalindrome = null;
		//check all possible string;
		for(int i=0;i<s.length();i++){
			for(int j=i+1;j<s.length();j++){
				int len=j-i;
				String curr=s.substring(i, j+1);
				if(isPalinDrome(curr)){
					if(len>maxPalinLen)
						longestPalindrome=curr;
						maxPalinLen=len;
				}
				
			}
		}
		return longestPalindrome;
		 
		
	}
	public static boolean isPalinDrome(String s){
		for(int i=0;i<s.length()-1;i++){
			if(s.charAt(i)!=s.charAt(s.length()-1-i)){
				return false;
			}
		}
		return true;
	}
	
}
