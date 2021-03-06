package JianZhiOffer;
/*题目描述
输入一个字符串,按字典序打印出该字符串中字符的所有排列。
例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。

输入描述:
输入一个字符串,长度不超过9(可能有字符重复),字符只包括大小写字母。

解题思路
刚看题目的时候，可能会觉得这个问题很复杂，不能一下子想出解决方案。
那我们就要学会把复杂的问题分解成小问题。我们求整个字符串的排列，其实可以看成两步：

第一步求所有可能出现在第一个位置的字符（即把第一个字符和后面的所有字符交换[相同字符不交换]）；
第二步固定第一个字符，求后面所有字符的排列。这时候又可以把后面的所有字符拆成两部分
（第一个字符以及剩下的所有字符），依此类推。这样，我们就可以用递归的方法来解决。*/

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
