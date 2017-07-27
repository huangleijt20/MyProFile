package Lei;

public class jisuan {
	//两个整型的加法
	public static int jiafa(int num1,int num2) {
		int sum=num1+num2;
		 return sum;
	}
	//两个浮点型加法
	public static double  jiafa2(double num1,double num2,double num3){
		double sum=num1+num2+num3;
		return sum;
	}
	
	//计算N个数的平均值
	public static double avg(int...nums) {
		int sum=0;
		for (int j = 0; j < nums.length; j++) {
			sum=nums[j]+sum;
		}
		
		return sum/nums.length;
	}
	
	
	
	
	
	
	//main
	public static void main(String[] args) {
	
		System.out.println(jiafa(15,12));
		System.out.println(jiafa2(12.2, 0.22, 595.1));
		System.out.println(avg(45,55,555,12,158,145,555,22));
	}
}
