package JianZhiOffer;

import java.util.Scanner;

/*ÖÀ÷»×Ó*/
public class DiceGame {
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			String x=sc.nextLine();
			solve(x);
		}
		sc.close();
	}
	private static void solve(String x){
		char[] a=x.toCharArray();
		int res[]={0,1,2,3,4,5,6};
		for(int i=0;i<a.length;i++){
			char swch=a[i];
			if(swch=='L'){
				int temp=res[1];
				res[1]=res[5];
				res[5]=res[2];
				res[2]=res[6];
				res[6]=temp;
			}else if(swch=='R'){
				int temp=res[2];
				res[2]=res[5];
				res[5]=res[1];
				res[1]=res[6];
				res[6]=temp;
			}else if(swch=='F'){
				int temp=res[3];
				res[3]=res[5];
				res[5]=res[4];
				res[4]=res[6];
				res[6]=temp;
			}else if(swch=='B'){
				int temp=res[4];
				res[4]=res[5];
				res[5]=res[3];
				res[3]=res[6];
				res[6]=temp;
			}else if(swch=='A'){
				int temp=res[1];
				res[1]=res[4];
				res[4]=res[2];
				res[2]=res[3];
				res[3]=temp;
			}else if(swch=='C'){
				int temp=res[1];
				res[1]=res[3];
				res[3]=res[2];
				res[2]=res[4];
				res[4]=temp;
			}
			
			}
		for(int i=1;i<=res.length-1;i++){
			System.out.println(res[i]);
		}
		System.out.println("");
		
	}

}
