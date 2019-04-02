package JianZhiOffer;

import javax.print.attribute.standard.RequestingUserName;

/*Longest Palindromic Substring
��������
����һ���ַ���s���ҵ�s�е�������Ӵ�������s����󳤶���1000��
��1��
���룺 ��babad�� 
����� ��bab�� 
ע�⣺ ��aba��Ҳ��һ����Ч�Ĵ𰸡�

��2��
���룺 ��cbbd�� 
����� ��bb��
*/
public class LongestPalindrome {

	public static void main(String[] args){
		System.out.println(longestPalindrome("cbbd"));
	}
	public static String longestPalindrome(String s){
		int n=s.length();
		String res=null;
		boolean[][] dp=new boolean[n][n];
		/*���δ��������е�����ǰһ�ֵ���Ϊ���ܵĻ��ĵĵ�һ���ַ���
		Ȼ�����ν��бȶ��Ƿ����һ���ַ���ȣ����������ֱ��ΪFalse��
		Ȼ����к����ȶԣ�����ҵ���ͬ���ַ�����ȶ���б�µ����ַ��Ļ�����Ϣ��
		����i+1��j-1�����Կ�ʼ�ȶԵ��ǵ�i-1�͵�j-1�ַ��Ƿ���ȣ����������濿£��ֱ��������*/
		for(int i=n-1;i>=0;i--){
			for(int j=i;j<n;j++){ //dp[i+1][j-1]��һ����б�µ�С����
				dp[i][j]=s.charAt(i)==s.charAt(j)&&(j-i<3||dp[i+1][j-1]); // j-i<3����ֻ�������ַ����ĸ��ַ�Ϊ����ʱ�Ŀ����жϣ�����Ҫ��ȡ��б�¶Խǵ�ֵ
	            
				if (dp[i][j]&&(res==null||j-i+1>res.length())){ //�ҳ���֮ǰ�����Ļ��ģ�������ַ���
					res=s.substring(i, j+1);
				}
				
			}
		}
		return res;
	}
	
	

}
