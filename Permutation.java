package JianZhiOffer;

public class Permutation {
	public static void main(String args[]){
    	permutation(new char[]{'a','b','c','d'},0);
    }
	
	public static void swap(char[] arr,int i,int j){
		char temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	public static void permutation(char[]ss,int i){  
        if(ss==null||i<0 ||i>ss.length){//1  
            return;  
        }
        
        if(i==ss.length-1){//2  
            System.out.println(new String(ss));  
        }else{  
            for(int j=i;j<ss.length;j++){//3  
            	swap(ss, i, j); //交换前缀,使之产生下一个前缀  
                permutation(ss,i+1);//4    
                swap(ss, i, j); //将前缀换回来,继续做上一个的前缀排列.//5  
            }   
        }  
    } 


}
