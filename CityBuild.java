package JianZhiOffer;

import java.util.Scanner;

/*一个城市需要修建，给你N个民居的坐标X,Y，
问把这么多民居全都包进城市的话，城市所需最小面积是多少
（注意，城市为平行于坐标轴的正方形）

输入
  第一行为N，表示民居数目（2≤N≤1000）
  下面为N行，每行两个数字Xi，Yi，表示该居民的坐标（-1e9≤xi,yi≤1e9）
输出
  城市所需最小面积

样例输入
2
0 0
2 2
样例输出
4*/
import java.util.Scanner;

public class CityBuild {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int xmin = Integer.MAX_VALUE;
		int xmax = Integer.MIN_VALUE;
		int ymin = Integer.MAX_VALUE;
		int ymax = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			int x = s.nextInt();
			int y = s.nextInt();

			if (xmin > x)
				xmin = x;
			if (xmax < x)
				xmax = x;
			if (ymin > y)
				ymin = y;
			if (ymax < y)
				ymax = y;
		}

		if ((xmax - xmin) < (ymax - ymin))
			System.out.println((ymax - ymin) * (ymax - ymin));
		else
			System.out.println((xmax - xmin) * (xmax - xmin));
		s.close();

	}

}
