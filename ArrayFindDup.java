package JianZhiOffer;

import java.util.*;
/*找出数组中唯一重复的数*/
/*异或法，根据异或的法则，每两个相异的数执行异或运算后，
 * 结果为1，每两个相同的数执行异或运算之后，结果为0；*/
public class ArrayFindDup {
	public static int ArrayFindDup(int[] arr){
		int n=arr.length;
//		
		int result=0;
		for(int i=0;i<n;i++){
			result^=arr[i];
		}
		for(int i=1;i<n;i++){
			result^=arr[i];
		}
		return result;
	
	}
	public static void main(String[] args){
		int[] arr={1,2,1,3,4,8,9,10};
		int uniDup=ArrayFindDup(arr);
		System.out.println("数组中唯一重复的数为：");
		System.out.println(uniDup);
		
		
	}

}
