package JianZhiOffer;

import java.util.Scanner;

/*����һ�����Ⱥ������ʱ�䣬��ʱ�룬���룬����ֱ�ת���˶��ٽǶȣ�
 * Ϊ�˱�֤���ȣ�����double����
 * ����00:00:00
 * 	   18:00:00
 * ���540
 * 	   6480
 *     388800*/
public class RotationOfClock {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String line=sc.nextLine();
		String[] strings=line.split("\\:");
		Double[] time1=new Double[strings.length];
		Double[] time2=new Double[strings.length];
		for(int i=0;i<strings.length;i++){
			time1[i]=Double.valueOf(strings[i]);
		}
		line=sc.nextLine();
		String[] str=line.split("\\:");
		for(int i=0;i<str.length;i++){
			time2[i]=Double.valueOf(str[i]);
		}
		Double second1=time1[0]*3600+time1[1]*60+time1[2];
		Double second2=time2[0]*3600+time2[1]*60+time2[2];
		
		Double secondAngle=((second2-second1)/60)*360;
		Double minuteAngle=(secondAngle/60);
		Double hourAngle=(minuteAngle/12);
		
		System.out.println(hourAngle);
		System.out.println(minuteAngle);
		System.out.println(secondAngle);
		
		
		
		
	}

}
