package Ch_06;

import java.util.Scanner;

public class lianxi2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int y=0;
		int age;
		int i;
		for(i=0;i<10;i++){
			System.out.println("�������"+(i+1)+"λ�˿͵�����:");
			age=input.nextInt();
			if(age<=30&&age>0){
				y++;
			}		
		}
		System.out.println("30�����µı�����"+y/10.0*100+"%");
		System.out.println("30�����ϵı�����"+(1-y/10.0)*100+"%");
	}

}
