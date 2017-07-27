package Phone;

public class TestPhone {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CommonHanset ph1=new CommonHanset();
		ph1.setName("Åµ»ùÑÇ");
		ph1.setType("N580");
		ph1.show();
		ph1.tax();
		ph1.call();
		ph1.music();
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		AptitudeHanset ph2=new AptitudeHanset();
		ph2.setName("vivo");
		ph2.setType("X9");
		ph2.show();
		ph2.netSevice();
		ph2.takePic();
		ph2.play();
		ph2.tax();
		ph2.call();
	}
	

}
