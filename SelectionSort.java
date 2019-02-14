package JianZhiOffer;

/*选择排序*/
public class SelectionSort {
	public static void main(String[] args){
		 int[] arr={1,3,2,45,65,33,12};
	        System.out.println("交换之前：");
	        for(int num:arr){
	            System.out.print(num+" ");
	        }   
	   for(int i=0;i<arr.length;i++){
		   int k=i;
		   for(int j=k+1;j<arr.length;j++){
			   if(arr[j]<arr[k])
//				  arr[k]=arr[j];
			   k=j;
		   }
		   if(i!=k){
			   int temp=arr[i];
			   arr[i]=arr[k];
			   arr[k]=temp;
		   }
		   
		   
			   
	   } 
	   System.out.println();
	   System.out.println("交换之后：");
	   for(int num:arr)
		   System.out.print(num+" ");
//	   System.out.println("\n");
	}
	

}
