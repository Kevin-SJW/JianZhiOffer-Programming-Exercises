package JianZhiOffer;

/*��Ŀ����
����һ�����������飬����������������ƴ�������ų�һ��������ӡ��ƴ�ӳ���������������С��һ����������������{3��32��321}�����ӡ���������������ųɵ���С����Ϊ321323��

����˼·
�Ƚ�����ת�����ַ������飬Ȼ����ַ������鰴�չ�����������ź�����ַ�������ƴ�ӳ�����
�ؼ������ƶ��������

��ab > ba �� a > b
��ab < ba �� a < b
��ab = ba �� a = b
����˵����
a = 21
b = 2
��Ϊ 212 < 221, �� ab < ba ������ a < b
��������ͨ����ab��ba�Ƚϴ�С�����ж�a��ǰ����b��ǰ�ġ�*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
public class PrintMinNumber {
    public String PrintMinNumber(int [] numbers) {
        int len = numbers.length;
        if(len == 0)
            return "";
        if(len == 1)
            return String.valueOf(numbers[0]);
        StringBuffer res = new StringBuffer();
        String [] str = new String[len];
        for(int i=0; i<len; i++)
            str[i] = String.valueOf(numbers[i]);
        Arrays.sort(str, new Comparator<String>(){
            public int compare(String s1, String s2) {
                String c1 = s1 + s2;
                String c2 = s2 + s1;
                return c1.compareTo(c2);
            }
        });
        for(int i=0; i<len; i++)
            res.append(str[i]);
        return res.toString();
    }
} 
