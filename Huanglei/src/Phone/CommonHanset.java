package Phone;

public class CommonHanset extends Handset{
	public void show() {
		super.show();
	}

	@Override
	public void tax() {
		System.out.println("������....");
		
	}

	@Override
	public void call() {
		System.out.println("��绰.....");
		
	}

	@Override
	public void music() {
		System.out.println("��������....");
		
	}
}
