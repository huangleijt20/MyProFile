package Ch_06;

import java.util.Scanner;

public class lianxi4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String name="";
		int password;
		int i=0;
		for(i=0;i<3;i++){
			System.out.println("�������û�����");
			name=input.next();
			System.out.println("���������룺");
			password=input.nextInt();
			if(name.equals("jim")||password==123456){		
				break;
			}else if(i<3){
				System.out.println("�������������"+(3-(i+1))+"�λ���");
				continue;
			}else if(i>=3){
				System.out.println("�Բ�����3�ξ��������");
				break;
			}
			
			
		}System.out.println("��ӭ��½MyShoppingϵͳ��");
		
	}
}
