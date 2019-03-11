package JianZhiOffer;

import java.util.Scanner;

/*挑选便宜的厂商：

厂商1：大于等于3件打7折，实付大于等于50元免运费10元

厂商2：满10元减2元，实付大于等于99免运费6元

根据输入件数、原价，计算选择哪个厂商便宜（四舍五入精确到分）。输出 1、2、0；

输入描述：

输入一行，第一列是商品件数，取值大于0、小于1万；第二列是原价，大于0、小于1万，单位元，精确到分

输出描述：

一个数代表选择哪个厂商

1代表厂商1，2代表厂商2，0代表相等
*/
public class ChooseCheaperVendor {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		double num=sc.nextDouble();//数量
		double price=sc.nextDouble();//价格
		double sum1=num*price;
		double sum2=num*price;
		if(num>=3){sum1=sum1*0.7;}
		int n=(int)(sum2/10);
		if(sum2>=10){sum2=sum2-2*(double)n;}
		if(sum1<50){sum1+=10;}
		if(sum2<99){sum2+=6;}
		if(sum1==sum2){System.out.println(0);
			}else if(sum1>sum2){
			System.out.println(2);
		}else{
			System.out.println(1);
		}
		
		
	}

}
