package Ch_09;

import java.util.Scanner;

public class ChiHuoLianMeng {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ��������
		String[] names = new String[4];// ���涩��������
		String[] dishMegs = new String[4];// ������ѡ��Ϣ����������������
		int[] times = new int[4];// �����Ͳ�ʱ��
		String[] addresses = new String[4];// �����Ͳ͵�ַ
		int[] states = new int[4];// ���涩��״̬��0��ʾ��Ԥ����1��ʾ�����
		double[] sumPrices = new double[4];// ���涩�����ܽ��

		// ��ѡ��Ĳ�Ʒ��Ϣ�����ۡ�������
		String[] dishName = { "���մ���", "������˿", "ʱ������" };// ��Ʒ����
		double[] prices = new double[] { 38.0, 20.0, 10.0 };// ��Ʒ����
		int[] praiseNums = new int[3];// ������

		// ��ʼ����һ��������Ϣ
		names[0] = "����";
		dishMegs[0] = "���մ���2��";
		times[0] = 12;
		addresses[0] = "���·207��";
		sumPrices[0] = 76.0;
		states[0] = 1;
		// ��ʼ���ڶ���������Ϣ
		names[1] = "����";
		dishMegs[1] = "������˿2��";
		times[1] = 18;
		addresses[1] = "���·207��";
		sumPrices[1] = 45.0;
		states[1] = 0;

		// ���ϵͳ�˵�
		boolean isExit = false;// ��־�û��Ƿ��˳�ϵͳ��trueΪ�˳�ϵͳ
		int num = -1; // �û�����0�������˵��������˳�ϵͳ
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("��ӭʹ�á��Ի����˶���ϵͳ��");
		// ʹ��do-whileʵ�����˵��ٿ�
		do {
			System.out.println("*******************************");
			System.out.println("1����Ҫ����");
			System.out.println("2���鿴�͵�");
			System.out.println("3��ǩ�ն���");
			System.out.println("4��ɾ������");
			System.out.println("5����Ҫ����");
			System.out.println("6���˳�ϵͳ");
			System.out.println("*******************************");
			System.out.print("��ѡ��");
			int choose = inputScanner.nextInt();// ��¼�û�ѡ����

			// �����û�ѡ��ı��ִ����Ӧ����
			switch (choose) {
			case 1:
				// ��Ҫ����
				System.out.println("***��Ҫ����***");
				boolean isAdd = false;// ��¼�Ƿ���Զ���
				for (int j = 0; j < names.length; j++) {// �ҵ���һ����λ�ã�������Ӷ���
					if (names[j] == null) {
						isAdd = true;// �ñ�־λ�����Զ���
						System.out.print("�����붩����������");
						String name = inputScanner.next();
						// ��ʾ��ѡ��Ĳ�Ʒ��Ϣ
						System.out.println("���" + "\t" + "����" + "\t" + "����"
								+ "\t" + "������");
						for (int i = 0; i < dishName.length; i++) {
							String price = prices[i] + "Ԫ";
							String praiseNum = praiseNums[i] > 0 ? praiseNums[i]
									+ "��"
									: "0";
							System.out.println((i + 1) + "\t" + dishName[i]
									+ "\t" + price + "\t" + praiseNum);
						}
						// �û����
						System.out.print("��ѡ����Ҫ��Ĳ�Ʒ��ţ�");
						int chooseDish = inputScanner.nextInt();
						System.out.print("��ѡ������Ҫ�ķ�����");
						int number = inputScanner.nextInt();
						String dishMeg = dishName[chooseDish - 1] + " "
								+ number + "��";
						double sumPrice = prices[chooseDish - 1] * number;
						// �ͷ���50Ԫ�����Ͳͷ�5Ԫ
						double deliCharge = (sumPrice >= 50) ? 0 : 5;

						System.out.print("�������Ͳ�ʱ�䣨10����20�������Ͳͣ���");
						int time = inputScanner.nextInt();
						while (time < 10 || time > 20) {
							System.out.print("������������������10~20�������!");
							time = inputScanner.nextInt();
						}
						System.out.print("�������Ͳ͵�ַ��");
						String address = inputScanner.next();

						// �������״̬��Ĭ����0������Ԥ��״̬
						System.out.println("���ͳɹ���");
						System.out.println("�������ǣ�" + dishMeg);
						System.out.println("�Ͳ�ʱ�䣺" + time + "��");
						System.out.println("�ͷѣ�" + sumPrice + "Ԫ���Ͳͷ�"
								+ deliCharge + "Ԫ���ܼƣ�"
								+ (sumPrice + deliCharge) + "Ԫ��");

						// �������
						names[j] = name;
						dishMegs[j] = dishMeg;
						times[j] = time;
						addresses[j] = address;
						sumPrices[j] = sumPrice + deliCharge;
						break;

					}

				}

				if (!isAdd) {
					System.out.println("�Բ������Ĳʹ�����!");
				}
				break;
			case 2:
				// �鿴�ʹ�
				System.out.println("***�鿴�ʹ�***");
				System.out.println("���\t������\t��Ʒ��Ϣ\t\t�Ͳ�����\t�Ͳ͵�ַ\t\t�ܽ��\t����״̬");
				for (int i = 0; i < names.length; i++) {
					if (names[i] != null) {
						String state = (states[i] == 0) ? "��Ԥ��" : "�����";
						String date = times[i] + "��";
						String sumPrice = sumPrices[i] + "Ԫ";
						System.out
								.println((i + 1) + "\t" + names[i] + "\t"
										+ dishMegs[i] + "\t" + date + "\t"
										+ addresses[i] + "\t" + sumPrice + "\t"
										+ state);
					}
				}
				break;
			case 3:
				// ǩ�ն���
				System.out.println("***ǩ�ն���***");
				boolean isSignFind = false;// �ҵ�Ҫǩ�յĶ���
				System.out.print("��ѡ��Ҫǩ�յĶ�����ţ�");
				int signOrderId = inputScanner.nextInt();
				for (int i = 0; i < names.length; i++) {
					// ״̬Ϊ��Ԥ�������Ϊ�û�����Ķ�����ż�1����ǩ��
					// ״̬Ϊ����ɣ����Ϊ�û�����Ķ�����ż�1������ǩ��
					if (names[i] != null && states[i] == 0
							&& signOrderId == i + 1) {
						states[i] = 1;// ��״ֵ̬����Ϊ�����
						System.out.println("����ǩ�ճɹ���");
						isSignFind = true;// ������ҵ��˶���
					} else if (names[i] != null && states[i] == 1
							&& signOrderId == i + 1) {
						System.out.println("��ѡ��Ķ��������ǩ�գ������ٴ�ǩ�գ�");
						isSignFind = true;// ������ҵ��˶���
					}
				}
				if (!isSignFind) {
					System.out.println("��ѡ��Ķ��������ڣ�");
				}
				break;
			case 4:
				// ɾ������
				System.out.println("***ɾ������***");
				boolean isDelFind = false;// ����Ƿ��ҵ�Ҫɾ���Ķ���
				System.out.print("������Ҫɾ���Ķ�����ţ�");
				int delId = inputScanner.nextInt();
				for (int i = 0; i < names.length; i++) {
					// ״̬Ϊ��Ԥ�������Ϊ�û�����Ķ�����ż�1������ɾ��
					// ״̬Ϊ����ɣ����Ϊ�û�����Ķ�����ż�1����ɾ��
					if (names[i] != null && states[i] == 1 && delId == i + 1) {
						isDelFind = true;// ������ҵ��˶���
						// ִ��ɾ��������ɾ��λ�ú��Ԫ������ǰ��
						for (int j = delId - 1; j < names.length; j++) {
							names[j] = names[j + 1];
							dishMegs[j] = dishMegs[j + 1];
							times[j] = times[j + 1];
							addresses[j] = addresses[j + 1];
							states[j] = states[j + 1];
							sumPrices[j] = sumPrices[j + 1];
						}
						// ���һλ���
						int endIndex = names.length - 1;
						names[endIndex] = null;
						dishMegs[endIndex] = null;
						times[endIndex] = 0;
						addresses[endIndex] = null;
						states[endIndex] = 0;
						sumPrices[endIndex] = 0;
						System.out.println("ɾ�������ɹ���");
					} else if (names[i] != null && states[i] == 0
							&& delId == i + 1) {
						System.out.println("��ѡ��Ķ���δǩ�գ�����ɾ����");
						isDelFind = true;// ������ҵ��˶���
					}
				}
				// δ�ҵ�����ŵĶ���������ɾ��
				if (!isDelFind) {
					System.out.println("��Ҫɾ���Ķ��������ڣ�");
				}
				break;
			case 5:
				// ��Ҫ����
				System.out.println("***��Ҫ����***");
				// ��ʾ��Ʒ��Ϣ
				System.out.println("���" + "\t" + "����" + "\t" + "����");
				for (int i = 0; i < dishName.length; i++) {
					String price = prices[i] + "Ԫ";
					String praiseNum = (praiseNums[i]) > 0 ? praiseNums[i]
							+ "��" : "";
					System.out.println((i + 1) + "\t" + dishName[i] + "\t"
							+ price + "\t" + praiseNum);
				}
				System.out.print("��ѡ����Ҫ���޵Ĳ�Ʒ��ţ�");
				int praiseNum = inputScanner.nextInt();
				if (praiseNum < dishName.length) {
					praiseNums[praiseNum - 1]++; // ������1
					System.out.println("���޳ɹ���");
				} else {
					System.out.println("������Ĳ�Ʒ��Ų����ڣ�");
				}
				break;
			default:
				break;
			}

			// ����0�������˵�
			if (!isExit) {
				System.out.print("����0���أ�");
				num = inputScanner.nextInt();
			} else {
				break;
			}

		} while (num == 0);
		System.out.println("ллʹ��!��ӭ�´ι���!");

	}

}
