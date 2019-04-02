package JianZhiOffer;
/*Palindromic Substrings
题目描述
给定一个字符串，你的任务是计算这个字符串中有多少个回文子串。
具有不同起始索引或结束索引的子字符串即使由相同的字符组成，也会被计为不同的子字符串。
例1：
输入： “abc”
输出： 3

说明：三个回文串：“a”，“b”，“c”。
例2：
输入： “aaa”
输出： 6

说明：六个回文串：“a”，“a”，“a”，“aa”，“aa”，“aaa”。
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
