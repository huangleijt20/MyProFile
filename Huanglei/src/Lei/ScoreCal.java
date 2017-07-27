package Lei;



public class ScoreCal {
	int[] scores=new int[5];
	double avg;
	int sum=0;
	int top;
	public double getAvg(){
		for (int i = 0; i < scores.length; i++) {
			 sum =scores[i]+sum;
			 avg=sum/scores.length;
		}
		return avg;
	}
	
	
	public int getTop(){
		
		for (int i = 0; i < scores.length-1; i++) {
			if (scores[i]<scores[i+1]) {
				scores[i]=scores[i+1];
				top=scores[i];
			}
		}
		return top;
	}
	
}
