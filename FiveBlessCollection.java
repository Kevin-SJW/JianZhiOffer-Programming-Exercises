package JianZhiOffer;

import java.util.Scanner;

/*集五福：以0和1组成的长度为5的字符串代表每个人所得到的福卡，每一位代表一种福卡，
 * 1表示已经获得该福卡，单类型福卡不超过一张，随机抽取一个小于10人团队，求该团队最多可以集齐多少套五福。

输入描述：输入若干个“11010”，“00110”的由0,1组成的长度等于5的字符串，代表指定团队中每个人福卡获得情况，
注：1人也可以是一个团队；1人可以有0-5张福卡，但福卡不能重复。
输出描述：输出该团队能凑齐多少套五福。
*/
public class FiveBlessCollection {
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			String s = in.nextLine();
			int len = s.length();
			int[] count = new int[5];
			for(int i=0;i<5;i++)
			{
				for(int j=0;j<len/5;j++)
					count[i] += s.charAt(5*j+i)-48;
			}
			int min = Integer.MAX_VALUE;
			for(int i=0;i<5;i++)
			{
				if(count[i] < min)
					min = count[i];
			}
			System.out.println(min);
		}
		in.close();
	}



}
