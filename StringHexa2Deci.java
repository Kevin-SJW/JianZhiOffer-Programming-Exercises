package JianZhiOffer;

import java.util.*;

/*д��һ�����򣬽���һ��ʮ�����Ƶ���ֵ�ַ������������ֵ��ʮ�����ַ�����������ͬʱ���� ��*/
public class StringHexa2Deci {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNextLine()) {
			String str = in.nextLine();
			System.out.println(Integer.parseInt(str.substring(2), 16));// str.substring(2)��ʾȥ��0x
		}
	}

}
