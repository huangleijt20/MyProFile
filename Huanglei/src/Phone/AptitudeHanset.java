package Phone;

public class AptitudeHanset extends Handset implements Network,PlayWiring,TakePictures {

	@Override
	public void takePic() {
		System.out.println("咔嚓....拍照成功！");
		
	}

	@Override
	public void play() {
		System.out.println("开始播放《变形金刚》...");
		
	}

	@Override
	public void netSevice() {
		System.out.println("正在打开UC浏览器.....");
		
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
