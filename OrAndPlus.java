package JianZhiOffer;

/*

���� x, k �������� x + y = x | y �ĵ� k С�������� y �� | �Ƕ����ƵĻ�(or)���㣬���� 3 | 5 = 7��

���統 x=5��k=1ʱ���� 2����Ϊ5+1=6 ������ 5|1=5���� 5+2=7 ���� 5 | 2 = 7��


���������:
ÿ���������������һ�����ݣ�ÿ������Ϊ���������� x , k�� ���� 0 < x , k �� 2,000,000,000��

�������:
���һ����y��

ʾ��1
����
5 1
��� 
2*/
import java.util.Scanner;
public class OrAndPlus{
    public static void main(String[] args) {
         
        Scanner scan = new Scanner(System.in);    
        while(scan.hasNext()){
            long x = scan.nextInt();
            long k = scan.nextInt();
            long bitNum = 1; //ָ��x�ĵ�ǰλ
            long ans =0 ;   //y�ĸ�λ��ֵ�ۼӣ��ۼ���ϵõ�y
            while( k >0){
                if( (x & bitNum )== 0){   //�����ǰxλΪ0
                    ans += (bitNum*(k & 1)); //��k�����һλȡ����������x��Ӧ��Ϊ���λ���ۼ���һλ��ֵ
                    k = k >> 1;         //kȡ�����һλ����������һλ
                }
                //��������x�ĵ�ǰλΪ0��1,bitNum��������һλ
                    bitNum = bitNum << 1;
            }
            System.out.println(ans);//������ans������y��ֵ��
        }
    }
}
