import java.util.Scanner;


public class lainxi4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//�������
		System.out.print("�������Ա���֣�");
		Scanner input=new Scanner(System.in);
		int x=input.nextInt();
		double zhekou;
		//�жϻ����ۿ۷�Χ
		if(x<2000){
			zhekou=0.9;
		}else if(x<4000){
			zhekou=0.8;
		}else if(x<8000){
			zhekou=0.7;
		}else{
			zhekou=0.6;
		}
		System.out.println("�û�Ա���ܵ��ۿ��ǣ�"+zhekou);
	}

}
