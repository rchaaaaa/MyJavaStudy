package Package.renchao;

import java.util.Scanner;

public class Continue {
	public static void main(String[] args) {
		String [] values={"abc","def"};
		System.out.println("输入");
		
		int[] nums=new int[5];
		nums[0]=9;
		Scanner input=new Scanner(System.in);
		double[] scores=new double[10];
		int searchNum=new Scanner(System.in).nextInt();
		int searchIndex=-1;
		for (int i=0;i<nums.length; i++) {
			if(searchNum==nums[i]){
				searchIndex=i;
				break;
			}
		}
		for (int i : nums) {
			
		}
		if (searchIndex==-1){
			System.out.println("未找到此元素");
		}
	}
}
