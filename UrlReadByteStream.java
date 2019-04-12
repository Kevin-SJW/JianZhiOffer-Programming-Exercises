package JianZhiOffer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class UrlReadByteStream {
	public static void main(String[] args) throws IOException{
		URL url = new URL("http://www.baidu.com");

	    /* �ֽ��� */
	    InputStream is = url.openStream();

	    /* �ַ��� */
	    InputStreamReader isr = new InputStreamReader(is, "utf-8");

	    /* �ṩ���湦�� */
	    BufferedReader br = new BufferedReader(isr);

	    String line = "";
	    line = br.readLine();
	    while (line != null) {
	        System.out.println(line);
	        line=br.readLine();
	    }

	    br.close();
	
	}

}
