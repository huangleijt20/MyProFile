package Lei;


import java.util.Scanner;



public class juesai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		ScoreCal cal=new ScoreCal();
		int score[]=new int[5];
		System.out.println("���������������ߵĳɼ���");
		for (int i = 0; i < score.length; i++) {
			score[i]=input.nextInt();
		}
		cal.scores=score;
		double avg=cal.getAvg();
		int top=cal.getTop();
	System.out.println("ƽ���ɼ���"+avg);
	System.out.println("��߷��ǣ�"+top);
		
				
	}
}
