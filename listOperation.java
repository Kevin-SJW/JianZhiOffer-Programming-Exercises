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

    //ȥ���������ظ���ֵ
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
        String[] newStr =  list.toArray(new String[1]); //����һ���������ж����ָ�����͵����� 
        for (String elementB:newStr ) {
            System.out.print(elementB + " ");
        }
        System.out.println();
    }

    //ɾ������������һ��Ԫ��
    public static void testB() {
        String [] str = {"Java", "C++", "Php", "C#", "Python"};//ɾ��php
        List<String> list = new ArrayList<String>();
        for (int i=0; i<str.length; i++) {
            list.add(str[i]);
        }
        list.remove(2); //list.remove("Php")   
        String[] newStr =  list.toArray(new String[1]); //����һ���������ж����ָ�����͵����� 
    }

    //������������һ��Ԫ��
    public static void testC() {
        String [] str = {"Java", "C++", "Php", "C#", "Python"};//����ruby
        List<String> list = new ArrayList<String>();
        for (int i=0; i<str.length; i++) {
            list.add(str[i]);
        }
        list.add(2, "ruby"); 
        String[] newStr =  list.toArray(new String[1]); //����һ���������ж����ָ�����͵����� 
    }
}
/*���ƴ���
 

����һ�����͵Ķ�ά���� String[][] a;

����һά���鳤�� a = new String[i][];

�����ά���鳤�� a[i] = new String[j]

���ӣ���һ���ַ��������ݷָ������ҷ���һ����ά������ 

���ƴ���
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
