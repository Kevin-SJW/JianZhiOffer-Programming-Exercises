package JianZhiOffer;

/*把一个数组循环右移k位*/
/*算法：
1.逆序数组子序列123456，数组序列的形式为65432178；
2.逆序数组子序列78，数组序列的形式变为65432187；
3.全部逆序，数组序列的形式变为78123456.*/
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
		k=k%n;//防止k>n （***）
		reverse(arr, n-k, n-1);
		reverse(arr, 0, n-k-1);
		reverse(arr, 0, n-1);
	}
	
	public static void main(String[] args){
		int arr[]={1,2,3,4,5,6,7,8};
		shift_k(arr, 2);
		System.out.println("逆序之后的结果为：");
		for(int i=0;i<arr.length;i++){
			
			System.out.print(arr[i]+" ");
		}
	}

}
