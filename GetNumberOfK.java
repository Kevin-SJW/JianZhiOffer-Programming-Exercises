package JianZhiOffer;

/*��Ŀ����
ͳ��һ�����������������г��ֵĴ�����

����˼·
������˼·���Ƕ��ֲ����ˣ������õݹ�ķ���ʵ���˲���k��һ�γ��ֵ��±꣬
��ѭ���ķ���ʵ���˲���k���һ�γ��ֵ��±ꡣ
����֮�⣬������һ�������˼·����Ϊdata�ж����������������ǲ�������k������λ�ã�
����ֱ������k-0.5��k+0.5��������Ӧ�ò����λ�ã�Ȼ��������ɡ� */
public class GetNumberOfK {
    public int GetNumberOfK(int [] array , int k) {
        return biSearch(array, k+0.5) - biSearch(array, k-0.5);
    }
    public int biSearch(int [] array, double k){
        int start  = 0, end = array.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(array[mid] > k){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }
}