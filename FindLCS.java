package JianZhiOffer;

/*求最长公共子序列*/
/*链接：https://www.nowcoder.com/questionTerminal/c996bbb77dd447d681ec6907ccfb488a
来源：牛客网

这是经典的动态规划题目，
定义子问题table[ i ][ j ]为字符串A的第一个字符到第 i 个字符串和字符串B的第一个字符串到第 j 个字符串的
最长公共子序列，
如A为“app”,B为“apple”，
table[ 2 ][ 3 ]表示 “ap” 和 “app” 的最长公共字串。注意到代码中 table 的大小为 (n + 1) x (m + 1) ，
这多出来的一行和一列是第 0 行和第 0 列，初始化为 0，表示空字符串和另一字符串的子串的最长公共子序列，
例如table[ 0 ][ 3 ]表示 “” 和 “app” 的最长公共字串。
    当我们要求table[ i ][ j ]，我们要先判断A[ i ]和B[ j ]是否相同，
    如果相同他就是table[ i - 1 ][ j - 1 ] + 1，相当于在两个字符串都去掉一个字符时的最长公共字串再加 1；
    否则最长公共字串取table[ i ][ j - 1 ] 和table[ i - 1 ][ j ] 中大者。*/
public class FindLCS {
	
		public int findLCS(String A, int n, String B, int m) {
		        // write code here
		        char[] a = A.toCharArray(),b = B.toCharArray();
		        int[][] dp = new int[n+1][m+1];
		        for(int i=0;i<n;i++){
		            for(int j=0;j<m;j++){
		                dp[i+1][j+1]= a[i]==b[j]?dp[i][j]+1 :
		                               Math.max(dp[i][j+1],dp[i+1][j]);
		            }
		        }
		        return dp[n][m];
		    }
		}

/*python版本

def findLCS(self, A, n, B, m):
        #result[i][j]保存A前i个子串和B前j个子串的公共子序列
        result = [[0 for i in range(m+1)] for j in range(n+1)]
        for i in range(1,n+1):
            for j in range(1,m+1):
                result[i][j] = max(result[i-1][j],result[i][j-1]) #默认传承之前的公共子序列长度
                if A[i-1]==B[j-1]:
                    result[i][j] = result[i-1][j-1]+1 #等于子串都减一的公共子序列长度加一
        return result[-1][-1]*/

