package Ch_06;

import java.util.Scanner;

public class lianxi3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("MyShopping����ϵͳ>�ͻ���Ϣ����>��ӿͻ���Ϣ");
		int VIPNo=0;
		String birth;
		int points;
		Scanner input=new Scanner(System.in);
		for(int i=0;i<3;i++){
			System.out.println("�������"+(i+1)+"��Ա��<4λ����>��");
			VIPNo=input.nextInt();
			System.out.println("�������Ա����<��/��>��");
			birth=input.next();
			System.out.println("�������Ա���֣�");
			points=input.nextInt();
			if(VIPNo<1000||VIPNo>9999){
				System.out.println("��Ա��"+VIPNo+"��Ч");
				System.out.println("¼����Ϣʧ��");
				continue;
			}
			System.out.println("��¼��Ļ�Ա��Ϣ�ǣ�");
			System.out.println(VIPNo+"\t"+birth+"\t"+points);
		}
		System.out.println("���������");
	}

}
