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
		System.out.println(longestPalindrome1("babcbabcbaccba"));
	}

	public static String longestPalindrome1(String s) {

		int maxPalinLength = 0;
		String longestPalindrome = null;
		int length = s.length();

		// check all possible sub strings
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				int len = j - i;
				String curr = s.substring(i, j + 1);
				if (isPalindrome(curr)) {
					if (len > maxPalinLength) {
						longestPalindrome = curr;
						maxPalinLength = len;
					}
				}
			}
		}

		return longestPalindrome;
	}

	public static boolean isPalindrome(String s) {

		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
				return false;
			}
		}

		return true;
	}
}
