package Printer;

public class TestPrinter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer printer=new Printer();
		ColorInbox colorInbox=new ColorInbox();
		GrayInbox grayInbox=new GrayInbox();
		A4Paper a4Paper=new A4Paper();
		B5Paper b5Paper=new B5Paper();
		//ʹ�úڰ�ī����B5ֽ�ϴ�ӡ
		printer.setInkBox(grayInbox);
		printer.setPaper(b5Paper);
		printer.print();
		//ʹ�ò�ɫī����A4ֽ�ϴ�ӡ
		printer.setInkBox(colorInbox);
		printer.setPaper(a4Paper);
		printer.print();
		//ʹ�ò�ɫī����B5ֽ�ϴ�ӡ
		Printer printer2=new Printer(colorInbox,b5Paper);
		printer2.print();
		Printer printer3=new Printer(grayInbox,a4Paper);
		printer3.print();
	}

}
