package Phone;

public class AptitudeHanset extends Handset implements Network,PlayWiring,TakePictures {

	@Override
	public void takePic() {
		System.out.println("����....���ճɹ���");
		
	}

	@Override
	public void play() {
		System.out.println("��ʼ���š����ν�ա�...");
		
	}

	@Override
	public void netSevice() {
		System.out.println("���ڴ�UC�����.....");
		
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
