package JianZhiOffer;
/*
快速排序*/

public class QuickSort {
	public static int Sort(int[] arr,int l,int r){
		int v=arr[l];   //取出第一个元素
		int j=l;        //j表示小于第一个元素和大于第一个元素的分界点
		for(int i=j+1;i<=r;i++){
			//将所有小于第一个元素的值的元素全部都放到它的左边
			if(arr[i]<v){   //如果当前元素小于v，则交换
				swap(arr,i,j+1);
				j++;
			}
		}
		swap(arr,l,j);   //将第一个元素和中间的元素进行交换
		return j;
		
	}
	private static void QuickSort(int[] arr,int l,int r){
		if(l>r)
			return;
		int p = Sort(arr, l, r);//找到中间位置
		QuickSort(arr, l, p-1);
		QuickSort(arr, p+1, r);
	}
	
	
	private static void swap(int[] arr, int l, int j) {
		int temp=arr[l];
		arr[l]=arr[j];
		arr[j]=temp;
		
	}

	public static void main(String args[]){
		int[] arr={1,5,8,3,6,9,4};
		System.out.println("快速排序交换之前：");
		for(int num:arr)
			System.out.print(num+" ");
		System.out.println("\n");
		System.out.println("快速排序交换之后：");
		QuickSort(arr, 0, arr.length-1);
		for(int num:arr)
			System.out.print(num+" ");
	}
		
	}

//}
