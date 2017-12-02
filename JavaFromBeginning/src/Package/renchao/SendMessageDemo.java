package Package.renchao;

public class SendMessageDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		SendMessage("王二狗", "世界频道", "工会狩猎", 5, 1000);
//		String str=hexToDec(255);
		int str=hexToDec("FF");
		System.out.println(str);
	}
	/**
	 * 实现游戏中的喊话功能
	 * @param name			汉化昵称
	 * @param channelName	喊话频道
	 * @param message		喊话内容
	 * @param count			喊话次数
	 * @param interval		喊话时间间隔
	 */
	public static void SendMessage(String name,String channelName,String message,int count,int interval){
		//
		String value=	String.format("【%s】%s:%s", channelName,name,message);
		for (int i = 0; i < count; i++) {
			System.out.println(value);
			try{
				Thread.sleep(interval);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
	public static String decToHex(int decNum){
		String hex="";
		while(decNum!=0){
			int temp=decNum%16;
			if(temp<10){
				hex=temp+hex;
			}else{
				hex=(char)(temp-10+'A')+hex;
			}
			decNum/=16;
		}
		return hex;
	}
	public static int hexToDec(String hexNum){
		int decNum=0;
		for(int i=0;i<hexNum.length();i++){
			char tempChar=hexNum.charAt(i);
			if(tempChar<='9')
				decNum+=(tempChar-'0')*Math.pow(16, hexNum.length()-i-1);
			else if(tempChar>='A'&&tempChar<='F'){
				decNum+=(tempChar-'A'+10)*Math.pow(16, hexNum.length()-i-1);
			}
				
		}
		return decNum;
	}
}
