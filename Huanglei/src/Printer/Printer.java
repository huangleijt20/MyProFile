package Printer;

public class Printer {
	private InkBox inkBox;
	private Paper paper;
	public InkBox getInkBox() {
		return inkBox;
	}
	public void setInkBox(InkBox inkBox) {
		this.inkBox = inkBox;
	}
	public Paper getPaper() {
		return paper;
	}
	public void setPaper(Paper paper) {
		this.paper = paper;
	}
	//����
	public Printer (InkBox inkBox,Paper paper) {
		this.inkBox=inkBox;
		this.paper=paper;
	}
	public Printer () {
		
	}
	public void print() {
		System.out.println("ʹ��"+inkBox.getColor()+"ī����"+paper.getSize()+"ֽ���ϴ�ӡ��");
	}
}
