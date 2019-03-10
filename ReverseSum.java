package JianZhiOffer;

import java.util.Scanner;

public class ReverseSum {
	
	public static int ReverseAdd(int a,int b){
		if(a<1||a>7000||b<1||b>7000){
			return -1;
		}
		System.out.println(Reverse(a));
		System.out.println(Reverse(b));
		return Reverse(a)+Reverse(b);
		
		
		
	}
	public static int Reverse(int a){
		int m=0;
		int n=0;
		
		do{
			n=a%10;
			m=m*10+n;
			a/=10;
		}while(a>0);
		return m;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String line=sc.nextLine();
		String[] str=line.split("\\,");
		int m=Integer.parseInt(str[0]);
		int n=Integer.parseInt(str[1]);
		int result=ReverseAdd(m, n);
		System.out.println(result);
		
		
	}

}
