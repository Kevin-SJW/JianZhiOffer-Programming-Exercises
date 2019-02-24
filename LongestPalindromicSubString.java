package JianZhiOffer;

/*两側比較法

以abba这样一个字符串为例来看，abba中，一共同拥有偶数个字。第1位=倒数第1位。第2位=倒数第2位......第N位=倒数第N位
以aba这样一个字符串为例来看，aba中。一共同拥有奇数个字符。排除掉正中间的那个字符后，第1位=倒数第1位......第N位=倒数第N位
所以，如果找到一个长度为len1的子串后，我们接下去測试它是否满足，第1位=倒数第1位。第2位=倒数第2位......第N位=倒数第N位。也就是说，去測试从头尾到中点，字符是否逐一相应相等。*/
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
