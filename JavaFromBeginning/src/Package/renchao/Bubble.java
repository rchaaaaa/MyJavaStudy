package Package.renchao;

import java.util.Collections;
import java.util.Scanner;

public class Bubble {
	public static void main(String[] args) {
		int [] nums=new int[10];
		for(int i=0;i<nums.length;i++){
			nums[i]=(int) (Math.random()*10000%1001);
			System.out.println(nums[i]);
		}
		int temp=-1;
		for (int i = 0; i < nums.length-1; i++) {
			for (int j = 0; j < nums.length-i-1; j++) {
				if(nums[j]>nums[j+1]){
					temp=nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=temp;
				}//else continue;
			}
		}
		for(int i=0;i<nums.length;i++){
			System.out.println(nums[i]);
		}
//		Collections.reverse(list);
		System.out.println("输入要查找的数：");
		int key=new Scanner(System.in).nextInt();
		int low=0;
		temp=-1;
//		int mid=(nums.length-1)/2;
		int high=nums.length-1;
		while(low<=high){
			int mid=(high+low)/2;
			if(nums[mid]==key){
				System.out.println(key+"的下标为"+mid);
				break;
			}else if(nums[mid]<key){
//				temp=low;
				low=mid+1;
//				mid=(low+high)/2;
			}else{
//				temp=high;
				high=mid-1;
//				mid=(low+high)/2;
			}

		}
//		System.out.println(key+"的下标为"+temp);
	}
}
