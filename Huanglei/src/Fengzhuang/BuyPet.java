package Fengzhuang;

import java.util.Scanner;

public class BuyPet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("欢迎来到宠物店！");
		System.out.print("请输入要领养宠物的名字:");
		String name=input.next();
		System.out.print("请选择要领养的宠物类型（1.狗狗		2.企鹅）:");
		int num=input.nextInt();
		switch (num) {
		case 1:
			Dog dog=new Dog();
			dog.setName(name);
			System.out.println("请输入狗狗的品种（1.哈士奇    2.泰迪）:");
			int i=input.nextInt();
			if (i==1) {
				dog.setBreeds("哈士奇");
			}else {
				dog.setBreeds("泰迪");
			}
			System.out.print("请输入狗狗的健康值（1~100）：");
			dog.setHealth(input.nextInt());
			System.out.println("请输入狗狗的亲密度（1~100）：");
			dog.setLove(input.nextInt());
			dog.show();
			break;
		case 2:
			Penguin penguin=new Penguin();
			penguin.setName(name);
			System.out.println("请输入企鹅的性别（1.Q仔    " +
					"2.Q妹）:");
			int j=input.nextInt();
			if (j==1) {
				penguin.setSex("Q仔");
			}else {
				penguin.setSex("Q妹");
			}
			System.out.print("请输入企鹅的健康值（1~100）：");
			penguin.setHealth(input.nextInt());
			System.out.println("请输入企鹅的亲密度（1~100）：");
			penguin.setLove(input.nextInt());
			penguin.show();
			break;
		}
	}

}
