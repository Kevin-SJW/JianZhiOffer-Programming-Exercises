package JianZhiOffer;

import java.util.*;

//创建主函数，没毛病
public class Sudoku{    
 public static void main(String[] args){
     // 创建Scanner来获取数据
     Scanner sc=new Scanner(System.in);
     // 多个测试用例的时候，那么我就多读取两次嘛
     while(sc.hasNext()){
         // 创建9*9数组
         int[][] data=new int[9][9];
         // 创建链表，链表结构是Integer的HashSet，用于存储数据(行数据，纵数据，方格数据)，怎么说呢，评判标准嘛
         ArrayList<HashSet<Integer>> row=new ArrayList<HashSet<Integer>>();
         ArrayList<HashSet<Integer>> col=new ArrayList<HashSet<Integer>>();
         ArrayList<HashSet<Integer>> squ=new ArrayList<HashSet<Integer>>();

         // 初始化，也没啥毛病，添加new HashSet<Integer>
         for(int i=0;i<9;i++){
             row.add(new HashSet<Integer>());
             col.add(new HashSet<Integer>());
             squ.add(new HashSet<Integer>());
         }

         // 遍历9*9数组，添加数据
         for(int i=0;i<9;i++){
             for(int j=0;j<9;j++){
                 // 初始数据，就是已知，不允许变动的数字
                 data[i][j]=sc.nextInt();
                 if(data[i][j]!=0){
                     row.get(i).add(data[i][j]);
                     col.get(j).add(data[i][j]);
                     // 这个就是将9*9拆分成9个3*3用于判断，是否符合要求的哟
                     squ.get(i/3*3+j/3).add(data[i][j]);
                 }
             }
         }
         // 核心思想，暴力破解，么么哒 参数：数据，横纵方格和序列号index
         dfs(data,row,col,squ,0);
         // 双for循环，打印数据
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

 // 函数，返回布尔值，如果是true，说明数独完整，那么就这样吧，没毛病
 public static boolean dfs(int[][] data,ArrayList<HashSet<Integer>> row,ArrayList<HashSet<Integer>> col,ArrayList<HashSet<Integer>> squ,int index){
     // 判定方式
     if(index==81){
         return true; 
     }
     // 调整目标的位置，和目标所在的区域
     int m=index/9;
     int n=index%9;
     int k=m/3*3+n/3;

     // 该点有数字的话，那么就改为修改下一个位置
     if(data[m][n]!=0){
         return dfs(data,row,col,squ,index+1);
     }
     else{
         // 没有数字的时候，那么就搞事情了，看看我能添加进去哪个数字啊，for循环1到9
         for(int i=1;i<=9;i++){
             if(!row.get(m).contains(i) && !col.get(n).contains(i) && !squ.get(k).contains(i)){
                 data[m][n]=i;
                 row.get(m).add(i);
                 col.get(n).add(i);
                 squ.get(k).add(i);
                 if(dfs(data,row,col,squ,index+1)){
                     return true;
                 }
                 // 执行一圈之后啊，谁都不能添加进去，那么就移除，先进后出的原理，啧啧，所以遍历了所有情况
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
