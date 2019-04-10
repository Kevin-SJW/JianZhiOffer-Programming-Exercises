package JianZhiOffer;


import java.io.*;
import java.util.*;

/*һ��ÿ�ж���ip���ı��ļ� �� ��ͳ�Ƴ�ÿ��ipһ�����ֹ����ٴΣ� 
 * ���Ҹ��ݳ��ִ����Ӵ�С����������µ��ı��ļ�
*/
public class FileIpCountSort {
    public static HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
    public static List<Map.Entry<String, Integer>> list_Data = null;

    public static void main(String args[]) {
        String filePath = "C:/Users/14241/Desktop/input.txt";
        String file = "C:/Users/14241/Desktop/output.txt";
        readFile(filePath);
        writeFile(file);
    }

    /**
     * ����TXT�ļ�
     */
    public static void readFile(String filePath) {
        try {
            File filename = new File(filePath); // Ҫ��ȡ����·����input.txt�ļ�
            InputStreamReader reader = new InputStreamReader(
                    new FileInputStream(filename)); // ����һ������������reader
            BufferedReader br = new BufferedReader(reader); // ����һ�����������ļ�����ת�ɼ�����ܶ���������
            String line = "";
            line = br.readLine();
            while (line != null) {
                
                if (hashMap.containsKey(line)) {
                    hashMap.put(line, hashMap.get(line) + 1);
                } else {
                    hashMap.put(line, 1);
                }
                line = br.readLine(); // һ�ζ���һ������
            }

            list_Data = new ArrayList<Map.Entry<String, Integer>>(hashMap.entrySet());
            Collections.sort(list_Data, new Comparator<Map.Entry<String, Integer>>() {
                public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                    return o2.getValue() - o1.getValue();
                }
            });

        } catch (Exception e) {
            System.out.println("��ȡ�ļ����ݳ���");
            e.printStackTrace();
        }
    }

    /**
     * д��TXT�ļ�
     */
    public static void writeFile(String file) {
        try {
            File writeName = new File(file); // ���·�������û����Ҫ����һ���µ�output.txt�ļ�
            writeName.createNewFile(); // �������ļ�,��ͬ�����ļ��Ļ�ֱ�Ӹ���
            FileWriter writer = new FileWriter(writeName);
            BufferedWriter out = new BufferedWriter(writer);

            for (Map.Entry<String, Integer> list_datum : list_Data) {
                if (list_datum.getKey() != null) {
                    out.write(list_datum.getKey() + "\t" + list_datum.getValue() + "\r\n"); // \r\n��Ϊ����
                    out.flush(); // �ѻ���������ѹ���ļ�
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
