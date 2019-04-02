package JianZhiOffer;
/*Palindromic Substrings
��Ŀ����
����һ���ַ�������������Ǽ�������ַ������ж��ٸ������Ӵ���
���в�ͬ��ʼ������������������ַ�����ʹ����ͬ���ַ���ɣ�Ҳ�ᱻ��Ϊ��ͬ�����ַ�����
��1��
���룺 ��abc��
����� 3

˵�����������Ĵ�����a������b������c����
��2��
���룺 ��aaa��
����� 6

˵�����������Ĵ�����a������a������a������aa������aa������aaa����
*/
public class PalindromicSubString {
	public static void main(String[] args){
		System.out.println(countSubstrings("aaa"));
	}
	public static int countSubstrings(String s) {
	    int n = s.length();
	    int res = 0;
	    boolean[][] dp = new boolean[n][n];
	    for (int i = n - 1; i >= 0; i--) {
	        for (int j = i; j < n; j++) {
	            dp[i][j] = s.charAt(i) == s.charAt(j) && (j - i < 3 || dp[i + 1][j - 1]);
	            if(dp[i][j]) ++res;
	        }
	    }
	    return res;
	}
	
	

}
