package Package.renchao;

import java.util.Scanner;

public class WeekDayDemo {
	public static void main(String[] args) {
		System.out.println("请输入今天是星期几：");
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
			String [] weekdays={"星期一","星期二","星期三","星期四","星期五","星期六","星期日"};
			System.out.println(weekdays[dayofWeek]);
		}else{
			System.out.println("只能输入1至7之间的数");
			return;
		}
		
	}
	static void ShowWeekDayByJapanese(int dayofWeek){
		if(isRight(dayofWeek)){
			String [] weekdays={"日曜日","火曜日","水曜日","木曜日","金曜日","土曜日","日曜日"};
			System.out.println(weekdays[dayofWeek]);
		}else{
			System.out.println("只能输入1至7之间的数");
			return;
		}
	}
	static void ShowWeekDayByEnglish(int dayofWeek){
		if(isRight(dayofWeek)){
			String [] weekdays={"Monday","Tuesday","Wednsday","Thursday","Friday","Saturday","Sunday"};
			System.out.println(weekdays[dayofWeek]);
		}else{
			System.out.println("只能输入1至7之间的数");
			return;
		}
	}
}
