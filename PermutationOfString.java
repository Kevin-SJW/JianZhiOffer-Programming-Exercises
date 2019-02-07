package JianZhiOffer;
/*��Ŀ����
����һ���ַ���,���ֵ����ӡ�����ַ������ַ����������С�
���������ַ���abc,���ӡ�����ַ�a,b,c�������г����������ַ���abc,acb,bac,bca,cab��cba��

��������:
����һ���ַ���,���Ȳ�����9(�������ַ��ظ�),�ַ�ֻ������Сд��ĸ��

����˼·
�տ���Ŀ��ʱ�򣬿��ܻ�����������ܸ��ӣ�����һ����������������
�����Ǿ�Ҫѧ��Ѹ��ӵ�����ֽ��С���⡣�����������ַ��������У���ʵ���Կ���������

��һ�������п��ܳ����ڵ�һ��λ�õ��ַ������ѵ�һ���ַ��ͺ���������ַ�����[��ͬ�ַ�������]����
�ڶ����̶���һ���ַ�������������ַ������С���ʱ���ֿ��԰Ѻ���������ַ����������
����һ���ַ��Լ�ʣ�µ������ַ������������ơ����������ǾͿ����õݹ�ķ����������*/

import java.util.ArrayList;
import java.util.Collections;
public class PermutationOfString {
    ArrayList<String> res = new ArrayList<String>();
    public ArrayList<String> Permutation(String str) {
        if(str == null)
            return res;
        PermutationHelper(str.toCharArray(), 0);
        Collections.sort(res);
        return res;
    }
    public void PermutationHelper(char[] str, int i){
        if(i == str.length - 1){
            res.add(String.valueOf(str));
        }else{
            for(int j = i; j < str.length; j++){
                if(j!=i && str[i] == str[j])
                    continue;
                swap(str, i, j);
                PermutationHelper(str, i+1);
                swap(str, i, j);
            }
        }
    }
    public void swap(char[] str, int i, int j) {
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }
}
