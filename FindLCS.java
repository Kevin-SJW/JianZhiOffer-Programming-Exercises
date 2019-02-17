package JianZhiOffer;

/*�������������*/
/*���ӣ�https://www.nowcoder.com/questionTerminal/c996bbb77dd447d681ec6907ccfb488a
��Դ��ţ����

���Ǿ���Ķ�̬�滮��Ŀ��
����������table[ i ][ j ]Ϊ�ַ���A�ĵ�һ���ַ����� i ���ַ������ַ���B�ĵ�һ���ַ������� j ���ַ�����
����������У�
��AΪ��app��,BΪ��apple����
table[ 2 ][ 3 ]��ʾ ��ap�� �� ��app�� ��������ִ���ע�⵽������ table �Ĵ�СΪ (n + 1) x (m + 1) ��
��������һ�к�һ���ǵ� 0 �к͵� 0 �У���ʼ��Ϊ 0����ʾ���ַ�������һ�ַ������Ӵ�������������У�
����table[ 0 ][ 3 ]��ʾ ���� �� ��app�� ��������ִ���
    ������Ҫ��table[ i ][ j ]������Ҫ���ж�A[ i ]��B[ j ]�Ƿ���ͬ��
    �����ͬ������table[ i - 1 ][ j - 1 ] + 1���൱���������ַ�����ȥ��һ���ַ�ʱ��������ִ��ټ� 1��
    ����������ִ�ȡtable[ i ][ j - 1 ] ��table[ i - 1 ][ j ] �д��ߡ�*/
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

/*python�汾

def findLCS(self, A, n, B, m):
        #result[i][j]����Aǰi���Ӵ���Bǰj���Ӵ��Ĺ���������
        result = [[0 for i in range(m+1)] for j in range(n+1)]
        for i in range(1,n+1):
            for j in range(1,m+1):
                result[i][j] = max(result[i-1][j],result[i][j-1]) #Ĭ�ϴ���֮ǰ�Ĺ��������г���
                if A[i-1]==B[j-1]:
                    result[i][j] = result[i-1][j-1]+1 #�����Ӵ�����һ�Ĺ��������г��ȼ�һ
        return result[-1][-1]*/

