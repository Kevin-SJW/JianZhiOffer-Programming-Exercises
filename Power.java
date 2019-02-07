package JianZhiOffer;

/*��Ŀ����
����һ��double���͵ĸ�����base��int���͵�����exponent����base��exponent�η���

����˼·
ָ��Ϊ��ʱ�������ȶ�ָ�������ֵ������η��Ľ������ȡ����
������Ϊ0��ָ��Ϊ��ʱ������ֶ�0���������Ҫ���⴦��
0��0�η�����ѧ��û�����壬����������0����1���ǿ��Խ��ܵ�
�ڼ���η���ʱ�򣬳��˼򵥵ı��������ǿ���ʹ�õݹ��˼�룬���¹�ʽ�������ټ�������*/
public class Power {
    public double Power(double base, int exponent) {
        int n = exponent;
        if(exponent==0){
            // ��ָ��Ϊ0����Ϊ0ʱ��û�����壬����0���߷���1������
            return 1;
        }else if(exponent < 0){
            if(base == 0){
                throw new RuntimeException("��ĸ����Ϊ0"); 
            }
            n = -exponent;
        }
        double res = PowerUnsignedExponent(base, n);
        return exponent<0? 1/res: res;
  }
    public double PowerUnsignedExponent(double base, int n){
        if(n == 0)
            return 1;
        if(n == 1)
            return base;
        //�ݹ�
        double res = PowerUnsignedExponent(base, n/2);
        res *= res;
        if(n%2 == 1)
            res *= base;
        return res;
    }
}
