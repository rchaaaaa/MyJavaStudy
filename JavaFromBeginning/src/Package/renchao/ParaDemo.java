package Package.renchao;

public class ParaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		paramTest("sd", 4,5,6,7,3);
	}
	public static void paramTest(String str,int... nums){
		System.out.println("��һ��������"+str);
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
}
