package Phone;

public class CommonHanset extends Handset{
	public void show() {
		super.show();
	}

	@Override
	public void tax() {
		System.out.println("发短信....");
		
	}

	@Override
	public void call() {
		System.out.println("打电话.....");
		
	}

	@Override
	public void music() {
		System.out.println("播放音乐....");
		
	}
}
