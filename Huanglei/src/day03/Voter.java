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
			System.out.println("ͶƱ������лл���룡");
		}else{
			count++;
			System.out.println(name+"ͶƱ�ɹ�����ǰƱ���ǣ�"+count);
		}
		
	}
	public static void show(){
		System.out.println("��ǰ��Ʊ��Ϊ��"+count);
	}
}
