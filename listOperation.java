package JianZhiOffer;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
public class listOperation {

    public static void main(String [] args) {
        testA();
        System.out.println("===========================");
        testB();
        System.out.println("===========================");
        testC();
    }

    //去掉数组中重复的值
    public static void testA() {
        String [] str = {"Java", "C++", "Php", "C#", "Python", "C++", "Java"};
        for (String elementA:str ) {
            System.out.print(elementA + " ");
        }
        List<String> list = new ArrayList<String>();
        for (int i=0; i<str.length; i++) {
            if(!list.contains(str[i])) {
                list.add(str[i]);
            }
        }
        String[] newStr =  list.toArray(new String[1]); //返回一个包含所有对象的指定类型的数组 
        for (String elementB:newStr ) {
            System.out.print(elementB + " ");
        }
        System.out.println();
    }

    //删除数组中其中一个元素
    public static void testB() {
        String [] str = {"Java", "C++", "Php", "C#", "Python"};//删除php
        List<String> list = new ArrayList<String>();
        for (int i=0; i<str.length; i++) {
            list.add(str[i]);
        }
        list.remove(2); //list.remove("Php")   
        String[] newStr =  list.toArray(new String[1]); //返回一个包含所有对象的指定类型的数组 
    }

    //在数组中增加一个元素
    public static void testC() {
        String [] str = {"Java", "C++", "Php", "C#", "Python"};//增加ruby
        List<String> list = new ArrayList<String>();
        for (int i=0; i<str.length; i++) {
            list.add(str[i]);
        }
        list.add(2, "ruby"); 
        String[] newStr =  list.toArray(new String[1]); //返回一个包含所有对象的指定类型的数组 
    }
}
/*复制代码
 

定义一个类型的二维数组 String[][] a;

定义一维数组长度 a = new String[i][];

定义二维数组长度 a[i] = new String[j]

例子：将一个字符串的内容分隔，并且放入一个二维数组中 

复制代码
public class TestToString {  
   public static void main(String[] args) {  
     String s = "0,1;3,6,4;7,1";  
     String[] a = s.split(";");  
     double[][] d;  
     d = new double[a.length][];  
     for(int i=0; i<a.length; i++){  
         String[] s_num = a[i].split(",");  
         for(int j=0; j<s_num.length; j++){  
             d[i] = new double[s_num.length];  
             d[i][j] = Double.parseDouble(s_num[j]);  
             System.out.println("d[" + i + "][" + j +"] = " + d[i][j]);  
                 }  
     }  
  
  } */
