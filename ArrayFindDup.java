package JianZhiOffer;

import java.util.*;
/*�ҳ�������Ψһ�ظ�����*/
/*��򷨣��������ķ���ÿ�����������ִ����������
 * ���Ϊ1��ÿ������ͬ����ִ���������֮�󣬽��Ϊ0��*/
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
		System.out.println("������Ψһ�ظ�����Ϊ��");
		System.out.println(uniDup);
		
		
	}

}
