package Lei;

import java.util.Scanner;

public class ChangePassword {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		//������
		Administrator admin= new Administrator();
		//���¶���ֵ
		admin.name="admin";
		admin.password="123456";
		//�����û�����
		System.out.print("�������û�����");
		String nameInput=input.next();
		System.out.print("����������룺");
		String passwordInput=input.next();
		for (int i =0; i <3; i++) {
			
			if (admin.name.equals(nameInput)&&admin.password.equals(passwordInput)) {
				System.out.print("�����������룺");
				admin.password=input.next();
				System.out.println("�޸�����ɹ�������������Ϊ��"+admin.password);
				break;	
			}else if(2-i==0){
				 System.out.println("3����������޸�ʧ�ܣ�");
				 break;
			}
			else {
				System.out.println("����������������룬������"+(3-(i+1))+"�λ��ᣡ");
				System.out.print("�û�����");
				 nameInput=input.next();
				System.out.print("�����룺");
				 passwordInput=input.next();
				 
			}
		}//for
		
	}
}
