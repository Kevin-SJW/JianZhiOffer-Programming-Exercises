package JianZhiOffer;

/*��һ������ѭ������kλ*/
/*�㷨��
1.��������������123456���������е���ʽΪ65432178��
2.��������������78���������е���ʽ��Ϊ65432187��
3.ȫ�������������е���ʽ��Ϊ78123456.*/
public class ArrayMove {
	public static void reverse(int[] a,int b,int e){
		for(;b<e;b++,e--){
			int temp=a[e];
			a[e]=a[b];
			a[b]=temp;
		}
	}
	
	public static void shift_k(int[] arr,int k){
		int n =arr.length;
		k=k%n;//��ֹk>n ��***��
		reverse(arr, n-k, n-1);
		reverse(arr, 0, n-k-1);
		reverse(arr, 0, n-1);
	}
	
	public static void main(String[] args){
		int arr[]={1,2,3,4,5,6,7,8};
		shift_k(arr, 2);
		System.out.println("����֮��Ľ��Ϊ��");
		for(int i=0;i<arr.length;i++){
			
			System.out.print(arr[i]+" ");
		}
	}

}
