package Ch_08;

public class demo4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//九九乘法表一共有九行，定义i的值
		for(int i=1;i<=9;i++){
			//打印的算式随着行数增加
			for(int j=1;j<=i;j++){
				System.out.print(j+"*"+i+"="+(j*i)+"   ");
			}
			System.out.println();
		}
	}

}
