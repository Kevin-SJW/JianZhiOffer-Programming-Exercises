package JianZhiOffer;


/*���ö��ֲ��ҷ���
��Ҫ�������������

array[mid] > array[high]:
�������������array����[3,4,5,6,0,1,2]����ʱ��С����һ����mid���ұߡ�
low = mid + 1
array[mid] == array[high]:
�������������array���� [1,0,1,1,1] ����[1,1,1,0,1]����ʱ��С���ֲ����ж���mid���
�����ұ�,��ʱֻ��һ��һ����
high = high - 1
array[mid] < array[high]:
�������������array����[2,2,3,4,5,6,6],��ʱ��С����һ������array[mid]������mid����
�ߡ���Ϊ�ұ߱�Ȼ���ǵ����ġ�
high = mid
ע�������и��ӣ��������ѯ�ķ�Χ���ֻʣ����������ômid һ����ָ���±꿿ǰ�����֡����� array = [4,6]��

array[low] = 4
array[mid] = 4 
array[high] = 6
���high = mid �C 1���ͻ�������� ���high = mid*/

import java.util.ArrayList;
public class minNumberInRotateArray {
    public int minNumberInRotateArray(int [] array) {
        int len = array.length;
        if(len == 0)
            return 0;
        int low = 0, high = len - 1;
        while(low < high){
            int mid = low + (high - low) / 2;
            if(array[mid] > array[high]){
                low = mid + 1;
            }else if(array[mid] == array[high]){
                high = high - 1;
            }else{
                high = mid;
            }
        }
        return array[low];
    }
}
