package Ch_08;

import java.util.Scanner;

public class maopao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int[] arr=new int[5];//定义一个数组
		int temp;//存储比较大小中介
		//接收键盘输入
		for(int i=0;i<arr.length;i++){
			System.out.print("请输入第"+(i+1)+"个数字:");
			arr[i]=input.nextInt();
		}
		//循环比较数组值的轮数
		for(int i=0;i<arr.length-1;i++){
			//循环比较数组内的值
			for(int j=0;j<arr.length-1-i;j++){
				//比较大小，把大的移到前面
				if(arr[j]<arr[j+1]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		//输出递减的排列
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
	}

}
