package JianZhiOffer;

import java.util.List;
import java.util.*;
/*2019�ٶ�ʵϰ������*/
/*��дһ���㷨�������ֵ��п�ͨ��ɾ����������ĳЩ�ַ����γɵĵ��ʣ��������ֵ��еĵ���(����ĸ)˳������*/
// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
// CLASS BEGINS, THIS CLASS IS REQUIRED
class WordsByDeleting {
    List<String> wordsByDeleting(String mWord, int numWord, List<String> dictWords) {
        TreeSet<String> treeSet = new TreeSet<String>();
        List<String> list = new ArrayList<String>();

        for (String dictWord : dictWords) {
            if (isOK(mWord, dictWord)) {
                treeSet.add(dictWord);
            }
        }
        for (String s : treeSet) {
            list.add(s);
        }
        return list;
    }

    private boolean isOK(String mWord, String dictWord) {
        int len1 = 0;
        int len2 = 0;
        while (len1 < mWord.length() && len2 < dictWord.length()) {
            if (dictWord.charAt(len2) == mWord.charAt(len1)) {
                len1++;
                len2++;
            } else {
                len1++;
            }
        }
        if (len2 == dictWord.length())
            return true;
        return false;
    }
}
