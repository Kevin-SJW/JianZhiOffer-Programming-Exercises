package JianZhiOffer;

/*��Ŀ����
����һ���������飬�жϸ������ǲ���ĳ�����������ĺ�������Ľ����
����������Yes,�������No���������������������������ֶ�������ͬ��

����˼·
����������: ������<��<=������

���ں��������˵��������������һ��Ԫ��һ���Ǹ��ڵ�, �������Ԫ�أ�
��ǰ��������Ϊ�����������֣���ಿ�ֶ��ȸ�Ԫ��С���Ҳಿ�ֶ��ȸ�Ԫ�ش�
����Ҳಿ���бȸø��ڵ�С��Ԫ�أ���ô�Ͳ��Ǻ����������˵ݹ���С�*/
public class VerifySquenceOfBST {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length == 0)
            return false;
        if(sequence.length == 1)
            return true;
        return judge(sequence, 0, sequence.length-1);
    }
    public boolean judge(int [] sequence, int start, int root){
        if(start >= root)
            return true;
        int i = start;
        while(i < root && sequence[i] < sequence[root])
            i++;
        for(int j=i; j<root; j++){
            if(sequence[j]<sequence[root])
                return false;
        }
        return (judge(sequence, start, i-1)) && (judge(sequence, i, root-1));
    }
}