package JianZhiOffer;

/*����һ���򵥴����¼����Сģ�飬�ܹ���¼����Ĵ������ڵ��ļ����ƺ��кš� 
����:
1.��¼���8�������¼������ͬ�Ĵ����¼(���ļ����ƺ��к���ȫƥ��)ֻ��¼һ��������������ӣ�(�ļ����ڵ�Ŀ¼��ͬ���ļ������к���ͬҲҪ�ϲ�)
2.����16���ַ����ļ����ƣ�ֻ��¼�ļ��������Ч16���ַ���(����ļ�����ͬ����ֻ���ļ����ĺ�16���ַ����к���ͬ��Ҳ��Ҫ�ϲ�)
3.������ļ����ܴ�·������¼�ļ����Ʋ��ܴ�·��

��������:
һ�л�����ַ�����ÿ�а�����·���ļ����ƣ��кţ��Կո������

    �ļ�·��Ϊwindows��ʽ

    �磺E:\V1R2\product\fpgadrive.c 1325

�������:
�����еļ�¼ͳ�Ʋ�������������ʽ���ļ�������������Ŀ��һ���ո��������: fpgadrive.c 1325 1 

    ���������Ŀ�Ӷൽ��������Ŀ��ͬ������£����������һ�γ���˳������

    �������8����¼����ֻ���ǰ8����¼.

    ����ļ����ĳ��ȳ���16���ַ�����ֻ�����16���ַ�*/

import java.util.*;
import java.util.Map.Entry;
public class SimpleErrorRecord {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		List<errorFile> list=new ArrayList<>();
		while(in.hasNext()){	
			String input=in.nextLine();
			String fileName=input.substring(input.lastIndexOf("\\")+1);
			errorFile file=new errorFile(fileName, 1);
			list.add(file);
			for(int i=0;i<list.size()-1;i++){
				if (list.get(i).fileName.equals(fileName)) {
					list.get(i).count++;
					list.remove(list.size()-1);
					break;
				}
			}
		}
		Collections.sort(list, new Comparator<errorFile>() {
	        public int compare(errorFile o1, errorFile o2){
	        return o2.count-o1.count;
	        }
	    });	
		for(int i=0;i<list.size();i++){
			if (i==8) {
				break;
			}
			errorFile file=list.get(i);
			String str=file.fileName;
			int index=str.indexOf(" ");
			if (index>16) {
				str=str.substring(index-16);
			}
			System.out.println(str+" "+file.count);
		}
	}
}
class errorFile{
	public int count;
	public String fileName;
	public errorFile(String name,int icount){
		count=icount;
		fileName=name;
	}
}

