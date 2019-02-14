package JianZhiOffer;

/*插入排序*/
/*插入排序是简单排序中速度最快的*/
public class InsertSort {
	public static void InsertSort(int[] a){
		if(a!=null){
			for(int i=1;i<a.length;i++){
				int temp=a[i],j=i;
				if(a[j-1]>temp){
					while(j>=1&&temp<a[j-1]){
						a[j]=a[j-1];
						j--;
					}
				}
				a[j]=temp;
			}
		}
	}
	
	public static void main(String args[]){
		int[] array={7,3,19,400,1,5};
		InsertSort(array);
		System.out.println("插入排序后：");
		for(int num:array)
			System.out.print(num+" ");
		System.out.println("\n");
	}

}
