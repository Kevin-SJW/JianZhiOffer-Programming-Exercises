package JianZhiOffer;

import java.util.*;
public class ArrayFindDup {
	public static int ArrayFindDup(int[] arr){
		int tmp1=0;
		int tmp2=0;
		int n=arr.length;
		for(int i=0;i<n-1;i++){
			tmp1+=(i+1);
			tmp2+=arr[i];
		}
		tmp2+=arr[n-1];
		int result=tmp2-tmp1;
		return result;
	
	}
	public static void main(String[] args){
		int[] arr={1,2,1,3,4};
		int uniDup=ArrayFindDup(arr);
		System.out.println("数组中唯一重复的数为：");
		System.out.println(uniDup);
		
		
	}

}
