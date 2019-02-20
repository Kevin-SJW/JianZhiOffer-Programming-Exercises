package JianZhiOffer;

public class MinDistance {
	
	public static int min(int a,int b){
		return a>b?b:a;
	}
	public static int MinDistance(int[] a,int n1,int n2){
		int len=a.length;
		int n1_index=-1;
		int n2_index=-1;
		int min_dist=Integer.MIN_VALUE+1;
		if(a==null)
			return Integer.MIN_VALUE;
		for(int i=0;i<len;i++){
			if(a[i]==n1){
				n1_index=i;
				if(n2_index>=0)
					min_dist=Math.min(Math.abs(min_dist), Math.abs(n1_index-n2_index));
//				return min_dist;
			}
			if(a[i]==n2){
				n2_index=i;
				if(n1_index>=0)
					min_dist=Math.min(Math.abs(min_dist), Math.abs(n2_index-n1_index));
//				return min_dist;
			}
		}return min_dist;
	}
	
	public static void main(String[] args){
		int[] a={4,5,6,4,7,4,6,4,7,8,5,6,4,3,10,8};
		System.out.println(MinDistance(a, 4, 8));
		
	}

}
