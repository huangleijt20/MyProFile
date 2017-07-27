package day03;

public class Voter {
	public static final int MAXNUM=100;
	public String name;
	public static int count;
	public Voter(String name){
		this.name=name;
		
	}
	public void toVote() {
		if (count==MAXNUM) {
			System.out.println("投票结束，谢谢参与！");
		}else{
			count++;
			System.out.println(name+"投票成功，当前票数是："+count);
		}
		
	}
	public static void show(){
		System.out.println("当前的票数为："+count);
	}
}
