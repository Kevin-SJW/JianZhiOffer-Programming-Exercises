package JianZhiOffer;

import java.util.List;
import java.util.*;
/*2019百度实习生笔试*/
/*编写一个算法，查找字典中可通过删除给定主词某些字符而形成的单词，并按照字典中的单词(首字母)顺序排列*/
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
