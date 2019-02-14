package JianZhiOffer;
/*
��������*/

public class QuickSort {
	public static int Sort(int[] arr,int l,int r){
		int v=arr[l];   //ȡ����һ��Ԫ��
		int j=l;        //j��ʾС�ڵ�һ��Ԫ�غʹ��ڵ�һ��Ԫ�صķֽ��
		for(int i=j+1;i<=r;i++){
			//������С�ڵ�һ��Ԫ�ص�ֵ��Ԫ��ȫ�����ŵ��������
			if(arr[i]<v){   //�����ǰԪ��С��v���򽻻�
				swap(arr,i,j+1);
				j++;
			}
		}
		swap(arr,l,j);   //����һ��Ԫ�غ��м��Ԫ�ؽ��н���
		return j;
		
	}
	private static void QuickSort(int[] arr,int l,int r){
		if(l>r)
			return;
		int p = Sort(arr, l, r);//�ҵ��м�λ��
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
		System.out.println("�������򽻻�֮ǰ��");
		for(int num:arr)
			System.out.print(num+" ");
		System.out.println("\n");
		System.out.println("�������򽻻�֮��");
		QuickSort(arr, 0, arr.length-1);
		for(int num:arr)
			System.out.print(num+" ");
	}
		
	}

//}
