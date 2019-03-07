package JianZhiOffer;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class StringAppearOneTime {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
            HashMap<Character, Integer> map = new HashMap<Character,Integer>();
            String str=sc.nextLine();
            for(int i=str.length()-1;i>=0;i--){
                if(map.containsKey(str.charAt(i))){
                    map.put(str.charAt(i), map.get(str.charAt(i))+1);
                }else{
                    map.put(str.charAt(i), 1);
                }
                    
            }
            boolean flag =true;
            Iterator<Entry<Character, Integer>> iter =map.entrySet().iterator();
            for(;iter.hasNext();){
                Entry<Character, Integer> entry=iter.next();
                if(entry.getValue()==1){
                    flag=false;
                    System.out.println(entry.getKey());
                    break;
                }
            }
            if(flag){
                System.out.println("null");
            }
    

    }

}