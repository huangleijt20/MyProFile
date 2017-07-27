package Ch_06;

public class lianxi1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1;
		int sum=0;
		for(num=1;num<=100;num++){
			
			if(num%2!=0){
				sum=sum+num;
			}	
		}
		System.out.println("100以内的奇数之和为："+sum);
	}

}
