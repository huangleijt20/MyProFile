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
		//使用黑白墨盒在B5纸上打印
		printer.setInkBox(grayInbox);
		printer.setPaper(b5Paper);
		printer.print();
		//使用彩色墨盒在A4纸上打印
		printer.setInkBox(colorInbox);
		printer.setPaper(a4Paper);
		printer.print();
		//使用彩色墨盒在B5纸上打印
		Printer printer2=new Printer(colorInbox,b5Paper);
		printer2.print();
		Printer printer3=new Printer(grayInbox,a4Paper);
		printer3.print();
	}

}
