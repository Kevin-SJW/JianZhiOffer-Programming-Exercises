package JianZhiOffer;

import java.util.Scanner;
import java.util.Stack;

/*����һ���ַ���str�����������Ч�����Ӵ��ĳ���

����������

1����Ч�������ַ�����ָֻ����С���ţ������������ַ��������������﷨������ַ�����
���硰(())������Ч�ģ�"((a))"��"(()������{()}������Ч�ġ�

2����Ч�����Ӵ���ָ�����ַ����������������ַ���������Ӵ���
���硰()(()()(������Ч�����Ӵ�������()���͡�()()��,���������Ч�����Ӵ����ȼ�Ϊ4��

���������

���������Ч�����Ӵ��ĳ���

ʾ��

���� ()(()()(����� 4
*/
public class PrintValidBracketLength {
	public static int PrintValidBracketLength(String s) {
		int len = 0;
		Stack<Integer> stack = new Stack<>();
		char[] c = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (c[i] == ')' && !stack.empty() && c[stack.peek()] == '(') {
				stack.pop();
				if (stack.empty()) {
					len = i + 1;
				}else {
					if (i - stack.peek() > len) {
					 len = i - stack.peek();
				}
			}
		}else{
                stack.push(i);
            }

		}
		return len;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(PrintValidBracketLength(str));

	}

}
