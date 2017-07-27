package day03;



public class TestVoter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Voter voter=new Voter("张三");
		voter.toVote();
		Voter voter1=new Voter("李四");
		voter1.toVote();
		Voter voter2=new Voter("王五");
		voter2.toVote();
		for (int i = 3; i <100; i++) {
			Voter voter3=new Voter("v"+i);
			voter3.toVote();
			voter3.show();
		}
	}

}
