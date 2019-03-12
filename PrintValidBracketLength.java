package JianZhiOffer;

import java.util.Scanner;
import java.util.Stack;

/*给定一个字符串str，返回其最长有效括号子串的长度

输入描述：

1、有效的括号字符串是指只包含小括号，不包含其他字符，且满足括号语法规则的字符串。
例如“(())”是有效的，"((a))"、"(()”、“{()}”是无效的。

2、有效括号子串是指输入字符串中满足有括号字符串规则的子串。
例如“()(()()(”的有效括号子串包含“()”和“()()”,其中最长的有效括号子串长度即为4。

输出描述：

返回其最长有效括号子串的长度

示例

输入 ()(()()(；输出 4
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
