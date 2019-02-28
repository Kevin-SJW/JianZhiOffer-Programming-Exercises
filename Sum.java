package JianZhiOffer;

import java.util.Scanner;
/*题目描述
求1+2+3+…+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。

解题思路
累加不能用循环的话，那就试试递归吧。
判断递归的终止条件不能用 if 和 switch，那就用短路与代替。
(n > 0) && (sum += Sum_Solution(n-1))>0
只有满足n > 0的条件，&&后面的表达式才会执行。*/
public class Sum {
	
	public static int Sum(int n){
		int sum=n;
		boolean t=(n>0)&&(sum+=Sum(n-1))>0;
		return sum;
	}
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("please input a integer n:");
		int n = scanner.nextInt();
		System.out.println(Sum(n));
		
	}

}
