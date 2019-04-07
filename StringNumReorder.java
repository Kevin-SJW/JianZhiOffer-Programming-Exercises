package JianZhiOffer;

import java.util.*;
/*华为2019实习生笔试*/
public class StringNumReorder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numbers = in.nextInt();
        in.nextLine();
        String str = in.next();
        String result = solution(numbers, str);
        System.out.println(result);
    }

    private static String solution(int numbers, String str) {
        StringBuffer sb = new StringBuffer();
        int flag = 0;
        for (int i = 0; i < numbers; i++) {
            if (str.length() - flag >= 9) {
                String substring = str.substring(flag + 1, flag + 9);
                if (str.charAt(flag) == '1') {
                    sb.append(substring + " ");
                } else {
                    String str1 = reverse(substring);
                    sb.append(str1 + " ");
                }
                flag = flag + 9;
            }
        }
        return sb.toString().substring(0, sb.toString().length() - 1);
    }

    public static String reverse(String str) {
        char[] chars = str.toCharArray();
        String reverse = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            reverse += chars[i];
        }
        return reverse;
    }
}
