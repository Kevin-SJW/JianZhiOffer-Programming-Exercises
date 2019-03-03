package JianZhiOffer;

import java.util.*;

//������������ûë��
public class Sudoku{    
 public static void main(String[] args){
     // ����Scanner����ȡ����
     Scanner sc=new Scanner(System.in);
     // �������������ʱ����ô�ҾͶ��ȡ������
     while(sc.hasNext()){
         // ����9*9����
         int[][] data=new int[9][9];
         // ������������ṹ��Integer��HashSet�����ڴ洢����(�����ݣ������ݣ���������)����ô˵�أ����б�׼��
         ArrayList<HashSet<Integer>> row=new ArrayList<HashSet<Integer>>();
         ArrayList<HashSet<Integer>> col=new ArrayList<HashSet<Integer>>();
         ArrayList<HashSet<Integer>> squ=new ArrayList<HashSet<Integer>>();

         // ��ʼ����Ҳûɶë�������new HashSet<Integer>
         for(int i=0;i<9;i++){
             row.add(new HashSet<Integer>());
             col.add(new HashSet<Integer>());
             squ.add(new HashSet<Integer>());
         }

         // ����9*9���飬�������
         for(int i=0;i<9;i++){
             for(int j=0;j<9;j++){
                 // ��ʼ���ݣ�������֪��������䶯������
                 data[i][j]=sc.nextInt();
                 if(data[i][j]!=0){
                     row.get(i).add(data[i][j]);
                     col.get(j).add(data[i][j]);
                     // ������ǽ�9*9��ֳ�9��3*3�����жϣ��Ƿ����Ҫ���Ӵ
                     squ.get(i/3*3+j/3).add(data[i][j]);
                 }
             }
         }
         // ����˼�룬�����ƽ⣬ôô�� ���������ݣ����ݷ�������к�index
         dfs(data,row,col,squ,0);
         // ˫forѭ������ӡ����
         for(int i=0;i<9;i++){
             for(int j=0;j<9;j++){
                 if(j!=8)
                     System.out.print(data[i][j]+" ");
                 else
                     System.out.println(data[i][j]);
             }
         }
     }
     sc.close();
 }

 // ���������ز���ֵ�������true��˵��������������ô�������ɣ�ûë��
 public static boolean dfs(int[][] data,ArrayList<HashSet<Integer>> row,ArrayList<HashSet<Integer>> col,ArrayList<HashSet<Integer>> squ,int index){
     // �ж���ʽ
     if(index==81){
         return true; 
     }
     // ����Ŀ���λ�ã���Ŀ�����ڵ�����
     int m=index/9;
     int n=index%9;
     int k=m/3*3+n/3;

     // �õ������ֵĻ�����ô�͸�Ϊ�޸���һ��λ��
     if(data[m][n]!=0){
         return dfs(data,row,col,squ,index+1);
     }
     else{
         // û�����ֵ�ʱ����ô�͸������ˣ�����������ӽ�ȥ�ĸ����ְ���forѭ��1��9
         for(int i=1;i<=9;i++){
             if(!row.get(m).contains(i) && !col.get(n).contains(i) && !squ.get(k).contains(i)){
                 data[m][n]=i;
                 row.get(m).add(i);
                 col.get(n).add(i);
                 squ.get(k).add(i);
                 if(dfs(data,row,col,squ,index+1)){
                     return true;
                 }
                 // ִ��һȦ֮�󰡣�˭��������ӽ�ȥ����ô���Ƴ����Ƚ������ԭ�����������Ա������������
                 data[m][n]=0;
                 row.get(m).remove(i);
                 col.get(n).remove(i);
                 squ.get(k).remove(i);
             }
         }
         return false;
     }
 }
}
