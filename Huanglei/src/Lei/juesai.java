package Lei;


import java.util.Scanner;



public class juesai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		ScoreCal cal=new ScoreCal();
		int score[]=new int[5];
		System.out.println("请输入五名参赛者的成绩：");
		for (int i = 0; i < score.length; i++) {
			score[i]=input.nextInt();
		}
		cal.scores=score;
		double avg=cal.getAvg();
		int top=cal.getTop();
	System.out.println("平均成绩："+avg);
	System.out.println("最高分是："+top);
		
				
	}
}
