import java.util.Scanner;


public class lianxi3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//���ռ�������
		System.out.println("�������Ƿ��ǻ�Ա��y��/�������ַ���");
		Scanner input=new Scanner(System.in);
		char VIP=input.next().charAt(0);
		//�ж��Ƿ��Ա
		if(VIP=='y'){
			//��Ա
			System.out.println("�����빺���");
			double money=input.nextDouble();
			if(money>=200){
				//����200��7.5��
				System.out.println("ʵ��֧����"+money*0.75);
			}else {
				//δ��200��8��
				System.out.println("ʵ��֧����"+money*0.8);
			}
		}else{
			//�ǻ�Ա
			System.out.println("�����빺���");
			double money2=input.nextDouble();
			if(money2>=100){
				//����100��9��
				System.out.println("ʵ��֧����"+money2*0.9);
			}else{
				//δ��100������
				System.out.println("ʵ��֧����"+money2);
			}
		}
	}

}
