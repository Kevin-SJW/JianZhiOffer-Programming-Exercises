package JianZhiOffer;

import circulation.Test;

/*�ַ����ķ�ת*/
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
		//�������ַ������з�ת
		swap(arr, 0, arr.length-1);
		int begin =0;
		for(int i=0;i<arr.length;i++){
		if(arr[i]==' '){ //�����ո�
			swap(arr, begin, i-1);
			begin=i+1; //ֻ�����οո񣬵����δӵ����Ե��������ʽ��з���
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
