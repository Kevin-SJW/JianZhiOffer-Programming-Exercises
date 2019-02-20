package JianZhiOffer;

/*如何求数对之间的最大差值*/
public class GetMaxDifference {
	
	public static int GetMaxDifference(int[] a){
		if(a==null)
			return Integer.MIN_VALUE;
		int len=a.length;
		if(len<1)
			return Integer.MIN_VALUE;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<len-1;i++){
			for(int j=i+1;j<len;j++)
				if(a[i]-a[j]>max)
					max=a[i]-a[j];
			
		}
		return max;
	}
	
	public static void main(String[] args){
		int arr[]={1,4,17,3,2,9};
		int diff=GetMaxDifference(arr);
		System.out.println("最大差值为："+diff+" ");
		
	}
}
