package day05;

public class TheftproofDoor extends Door implements Lock {

	@Override
	public void lockUp() {
		System.out.println("���Կ�ף�����ת3Ȧ�������ˣ��γ�Կ�ס�");
		
	}

	@Override
	public void openLock() {
		System.out.println("���Կ�ף�����ת3Ȧ�������ˣ��γ�Կ�ס�");
		
	}

	@Override
	public void open() {
		System.out.println("�����ƣ��Ŵ���");
		
	}

	@Override
	public void close() {
		System.out.println("���������Ź�����");
		
	}

}
