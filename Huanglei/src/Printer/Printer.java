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
	//构造
	public Printer (InkBox inkBox,Paper paper) {
		this.inkBox=inkBox;
		this.paper=paper;
	}
	public Printer () {
		
	}
	public void print() {
		System.out.println("使用"+inkBox.getColor()+"墨盒在"+paper.getSize()+"纸张上打印。");
	}
}
