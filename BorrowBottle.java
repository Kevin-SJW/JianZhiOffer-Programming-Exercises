package JianZhiOffer;

/*½èÆ¿×Ó*/
import java.util.*;
public class BorrowBottle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
        int a =sc.nextInt();
        int count=0;
        if(a==0)
            return;
        else if(a==1)
            System.out.println(0);
        else if(a==2)
            System.out.println(1);
        else{
            count=a/2;
            System.out.println(count);
        }
        
        }
    }
}