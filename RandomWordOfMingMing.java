package JianZhiOffer;

/*��������ѧУ����һЩͬѧһ����һ���ʾ���飬Ϊ��ʵ��Ŀ͹��ԣ�
�����ü����������N��1��1000֮������������N��1000�������������ظ������֣�
ֻ����һ������������ͬ����ȥ������ͬ������Ӧ�Ų�ͬ��ѧ����ѧ�š�Ȼ���ٰ���Щ����С��������
�����źõ�˳��ȥ��ͬѧ�����顣����Э��������ɡ�ȥ�ء��롰���򡱵Ĺ���(ͬһ��������������ܻ��ж������ݣ�
ϣ���������ȷ����)��



Input Param

n               ����������ĸ���

inputArray      n�����������ɵ�����


Return Value

OutputArray    ����������������



ע������������֤�����������ȷ�ԣ�������������֤������������ֹһ�顣*/
import java.util.*;
/*ȥ�أ�����*/

public class RandomWordOfMingMing {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int[] num = new int[n];
			List<Integer> list = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				num[i] = sc.nextInt();
			}
			for (int i = 0; i < num.length; i++) {
				if (!list.contains(num[i])) {
					list.add(num[i]);
				}
			}
			Collections.sort(list);

			
			for (int list_ : list) {
				System.out.println(list_);
			}
		}
	}

}