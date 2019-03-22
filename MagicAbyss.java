package JianZhiOffer;

import java.util.Scanner;

public class MagicAbyss {
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] sc = new int[n];
	        for(int i=0;i<n;i++){
	            sc[i]=in.nextInt();
	        }
	        int[] dp=new int[1001];
	        for(int i=1;i<1001;i++){
	            dp[i]=0;
	        }
	        dp[0]=1;
	        int[] byteArray={1, 2, 4, 8, 16, 32, 64, 128, 256, 512};
	        for(int i=0;i<1000;i++){
	            for(int j=0;j<10 && i>= byteArray[j];j++){
	                dp[i]+=dp[i-byteArray[j]];
	                dp[i]%=(1000000000 + 3);
	            }
	        }
	        for(int i=0;i<n;i++){
	            System.out.println(dp[sc[i]]);
	        }
	        in.close();
	    }


}
