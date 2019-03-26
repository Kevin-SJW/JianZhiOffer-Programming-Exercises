package JianZhiOffer;

import java.util.*;

/*写出一个程序，接受一个十六进制的数值字符串，输出该数值的十进制字符串。（多组同时输入 ）*/
public class StringHexa2Deci {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNextLine()) {
			String str = in.nextLine();
			System.out.println(Integer.parseInt(str.substring(2), 16));// str.substring(2)表示去除0x
		}
	}

}
