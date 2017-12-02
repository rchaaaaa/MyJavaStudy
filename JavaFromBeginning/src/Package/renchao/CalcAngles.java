package Package.renchao;

public class CalcAngles {
	public static void main(String[] args) {
		int x1=90,y1=180;
		int x2=205,y2=85;
		int x3=310,y3=240;
		double a=Math.sqrt(Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2));
		double b=Math.sqrt(Math.pow(x3-x2, 2)+Math.pow(y3-y2, 2));
		double c=Math.sqrt(Math.pow(x3-x1, 2)+Math.pow(y3-y1, 2));
		double radiansA=Math.acos((a*a-b*b-c*c)/(-2*b*c));
		double radiansB=Math.acos((b*b-a*a-c*c)/(-2*a*c));
		double radiansC=Math.acos((c*c-a*a-b*b)/(-2*b*a));
	}
}
