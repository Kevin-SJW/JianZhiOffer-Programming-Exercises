package JianZhiOffer;

import java.util.Scanner;

/*һ��������Ҫ�޽�������N����ӵ�����X,Y��
�ʰ���ô�����ȫ���������еĻ�������������С����Ƕ���
��ע�⣬����Ϊƽ����������������Σ�

����
  ��һ��ΪN����ʾ�����Ŀ��2��N��1000��
  ����ΪN�У�ÿ����������Xi��Yi����ʾ�þ�������꣨-1e9��xi,yi��1e9��
���
  ����������С���

��������
2
0 0
2 2
�������
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
