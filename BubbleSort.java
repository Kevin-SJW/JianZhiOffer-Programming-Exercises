package JianZhiOffer;

public class BubbleSort {
	public static void BubbleSort(int array[]){
		int i,j;
		int temp;
		int len=array.length;
		for(i=0;i<len;++i){
			for(j=len-1;j>i;--j){
				if(array[j-1]>array[j]){
					temp=array[j];
					array[j]=array[j-1];
					array[j-1]=temp;
				}
				
			}
		}
		
	}
	public static void main(String args[]){
		int[] arr={1,5,9,14,6,3};
		System.out.println("交换之前：");
		for(int num:arr)
			System.out.print(num+" ");
		System.out.println("\n");
		System.out.println("交换之后：");
		BubbleSort(arr);
		for(int num:arr)
			System.out.print(num+" ");
	}

}
