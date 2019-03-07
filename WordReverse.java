package JianZhiOffer;

import java.util.Scanner;

public class WordReverse {
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		String line=scanner.nextLine();
		String[] strings=line.split(" ");
		StringBuilder res = new StringBuilder();
		for(int i=0;i<strings.length;i++){
			StringBuilder sb=new StringBuilder(strings[i]);
			sb.reverse();
			res.append(sb);
			res.append(" ");
			
		}
		System.out.println(res.toString().trim());
	}

}
