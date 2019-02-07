package JianZhiOffer;

import java.util.ArrayList;
import java.util.Stack;

/*��Ŀ����
���������������У���һ�����б�ʾջ��ѹ��˳�����жϵڶ��������Ƿ�Ϊ��ջ�ĵ���˳��
����ѹ��ջ���������־�����ȡ���������1,2,3,4,5��ĳջ��ѹ��˳������4,5,3,2,1�Ǹ�ѹջ���ж�Ӧ��һ���������У�
��4,3,5,1,2�Ͳ������Ǹ�ѹջ���еĵ������С���ע�⣺���������еĳ�������ȵģ�

����˼·
ģ���ջ�����Ĺ��̣���ԭ��������ѹջ����ջ��Ԫ����������ջ������ȣ������ͬ���ջ�������ͬ�����ѹջ��ֱ��ԭ��������������ѹջ��ϡ���󣬼��ջ���Ƿ�Ϊ�գ����գ�˵����ջ���п���ԭ���н���ջ�����õ�������˵����ջ���в�����ԭ���н���ջ�����õ���*/
//stack.peek()��stack.pop(),��ͬ�㣺��Ҷ�����ջ����ֵ����ͬ�㣺peek��ɾ��ջ����ֵ��pop���ջ����ֵɾ����
public class IsPopOrder {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        if(pushA.length != popA.length || 
               pushA.length == 0 ||
               popA.length == 0)
            return false;
        Stack<Integer> stack = new Stack<>();
        int index = 0;
        for(int i = 0; i < pushA.length; i++){
            stack.push(pushA[i]);
            while(!stack.empty() && stack.peek() == popA[index]){
                stack.pop();
                index++;
            }
        }
        return stack.empty();
    }
}
