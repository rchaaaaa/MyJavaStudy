package Package.renchao;

import java.util.Scanner;

public class WeekDayDemo {
	public static void main(String[] args) {
		System.out.println("��������������ڼ���");
		int dayofweek=new Scanner(System.in).nextInt();
		WeekDayDemo.ShowWeekDayByChinese(dayofweek-1);
		ShowWeekDayByJapanese(dayofweek-1);
		ShowWeekDayByEnglish(dayofweek-1);
	}
	private static boolean isRight(int dayofWeek){
		if(dayofWeek<1||dayofWeek>7){
			return false;
		}
		return true;
	}
	public static void ShowWeekDayByChinese(int dayofWeek){
		if(isRight(dayofWeek)){
			String [] weekdays={"����һ","���ڶ�","������","������","������","������","������"};
			System.out.println(weekdays[dayofWeek]);
		}else{
			System.out.println("ֻ������1��7֮�����");
			return;
		}
		
	}
	static void ShowWeekDayByJapanese(int dayofWeek){
		if(isRight(dayofWeek)){
			String [] weekdays={"������","������","ˮ����","ľ����","������","������","������"};
			System.out.println(weekdays[dayofWeek]);
		}else{
			System.out.println("ֻ������1��7֮�����");
			return;
		}
	}
	static void ShowWeekDayByEnglish(int dayofWeek){
		if(isRight(dayofWeek)){
			String [] weekdays={"Monday","Tuesday","Wednsday","Thursday","Friday","Saturday","Sunday"};
			System.out.println(weekdays[dayofWeek]);
		}else{
			System.out.println("ֻ������1��7֮�����");
			return;
		}
	}
}
