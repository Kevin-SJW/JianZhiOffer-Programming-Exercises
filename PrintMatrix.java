package JianZhiOffer;

import java.util.ArrayList;
public class PrintMatrix {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        ArrayList<Integer> res = new ArrayList<>();

        if(row == 0 && col == 0)
            return res;
        int left = 0, right = col - 1, top = 0, bottom = row - 1;
        while(left <= right && top <= bottom){
            //�ϣ�������
            for(int i=left; i<=right; i++)
                res.add(matrix[top][i]);
            //�ң����ϵ���
            for(int i=top+1; i<=bottom; i++)
                res.add(matrix[i][right]);
            //�£����ҵ���
            if(top != bottom){
                //��ֹ�������
                for(int i=right-1; i>=left; i--)
                    res.add(matrix[bottom][i]);
            }
            //�󣺴��µ���
            if(left != right){
                //��ֹ�������
                for(int i=bottom-1; i>top; i--)
                    res.add(matrix[i][left]);
            }
            left++; right--; top++; bottom--;
        }
        return res;
    }
}
