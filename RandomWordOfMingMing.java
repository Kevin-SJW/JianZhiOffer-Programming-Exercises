package JianZhiOffer;

/*��������ѧУ����һЩͬѧһ����һ���ʾ���飬Ϊ��ʵ��Ŀ͹��ԣ������ü����������N��1��1000֮������������N��1000�������������ظ������֣�ֻ����һ������������ͬ����ȥ������ͬ������Ӧ�Ų�ͬ��ѧ����ѧ�š�Ȼ���ٰ���Щ����С�������򣬰����źõ�˳��ȥ��ͬѧ�����顣����Э��������ɡ�ȥ�ء��롰���򡱵Ĺ���(ͬһ��������������ܻ��ж������ݣ�ϣ���������ȷ����)��



Input Param

n               ����������ĸ���

inputArray      n�����������ɵ�����


Return Value

OutputArray    ����������������



ע������������֤�����������ȷ�ԣ�������������֤������������ֹһ�顣*/
import java.util.*;
public class RandomWordOfMingMing{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
                int num;
                num = sc.nextInt();
                int[] arr = new int[num];
                for(int i=0;i<num;i++){
                       arr[i]=sc.nextInt();
                    }

                for(int i=0;i<arr.length-1;i++){
                    for(int j=i+1;j<arr.length;j++){
                        if(arr[i]==arr[j]){
                              arr[j] = 1001;
                        }
                    }
                }

                //����������
                for(int j=0;j<arr.length-1;j++){
                    for(int k=j;k<arr.length;k++){
                        if(arr[j]>=arr[k]){
                        int temp = arr[j];
                            arr[j] = arr[k];
                            arr[k] = temp;
                        }
                    }
                }

                for(int i=0;(i<arr.length)&&(arr[i]<1001);i++){
                    System.out.println(arr[i]);
                    }
        }   
            sc.close();
    }        

}