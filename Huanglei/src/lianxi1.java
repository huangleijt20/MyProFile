import java.util.Scanner;


public class lianxi1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int random=(int) (Math.random()*10);//���������
		System.out.println("��ӭ�μ������������˳齱����");
		System.out.print("������4λ����Ա���ţ�");
			int VIP=input.nextInt();//��ȡ��������
			int num=VIP/100%10;//�ֽ��λ��ֵ
			//�ж��Ƿ��н�
			if(num==random){
			System.out.print("��ϲ���н��ˣ�");
			
			}else{
			System.out.print("��л���룡");
			}
	}
}
