package Ch_08;

import java.util.Scanner;

public class maopao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int[] arr=new int[5];//����һ������
		int temp;//�洢�Ƚϴ�С�н�
		//���ռ�������
		for(int i=0;i<arr.length;i++){
			System.out.print("�������"+(i+1)+"������:");
			arr[i]=input.nextInt();
		}
		//ѭ���Ƚ�����ֵ������
		for(int i=0;i<arr.length-1;i++){
			//ѭ���Ƚ������ڵ�ֵ
			for(int j=0;j<arr.length-1-i;j++){
				//�Ƚϴ�С���Ѵ���Ƶ�ǰ��
				if(arr[j]<arr[j+1]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		//����ݼ�������
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
	}

}
