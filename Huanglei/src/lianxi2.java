import java.util.Scanner;


public class lianxi2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("�������ع������ϵͳ>�ͻ���Ϣ����>��ӿͻ���Ϣ\r\r");
		System.out.print("�������Ա�ţ�<4λ����>����");//��ȡ��������
		Scanner input=new Scanner(System.in);
		int custNo=input.nextInt();
		System.out.print("�������Ա���գ���/��<����λ����ʾ>����");//��ȡ��������
		String custBirth=input.next();
		System.out.print("��������֣�");//��ȡ��������
		int custScore=input.nextInt();
		//�жϻ�Ա�����Ƿ�Ϸ�
		if(custNo<10000&&custNo>999){
			System.out.print("��¼�����Ϣ�ǣ�\n"+custNo+"\t"+custBirth+"\t"+custScore);
		}else {
			System.out.print("��Ϣ¼��ʧ�ܣ���������ȷ�Ļ�Ա����");
		}
		
		
		
		
		
		
	}

}
