package JianZhiOffer;

import circulation.Test;

/*字符串的反转*/
public class ReverseOfString {
	public static void swap(char[] arr,int begin,int end){
		char tmp=0;
		while(begin<end){
			tmp=arr[begin];
			arr[begin]=arr[end];
			arr[end]=tmp;
			begin++;
			end--;
		}
	
	}
	public String SwapOfString(String s){
		char[] arr=s.toCharArray();
		int n=arr.length;
		//对整个字符串进行反转
		swap(arr, 0, arr.length-1);
		int begin =0;
		for(int i=0;i<arr.length;i++){
		if(arr[i]==' '){ //遇到空格
			swap(arr, begin, i-1);
			begin=i+1; //只有两次空格，第三次从单独对第三个单词进行反序。
		}
	}
		swap(arr, begin, arr.length-1);
		return new String(arr);
		
		
	}
	
	public static void main(String[] args){
		String s = "how are you";
//		String a =ReverseOfString(s);
		System.out.println(new ReverseOfString().SwapOfString(s));
			
		
	}

}
