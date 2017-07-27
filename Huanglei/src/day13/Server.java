package day13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {
	private ServerSocket serverSocket=null;
	//�������ϴ������߿ͻ�
	private List<PrintWriter> onLine;
	public Server(){
		try {
			serverSocket=new ServerSocket(9898);
			onLine=new ArrayList<PrintWriter>();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//�㲥��Ϣ�ķ���
	public void sendInfo(String msg) {
		//�������߿ͻ����ϣ����͹㲥
		for (PrintWriter pw : onLine) {
			pw.print(msg);
		}
	}
	//��������ӿͻ������߼���
	public void addClient(PrintWriter pw){
		onLine.add(pw);
	}
	//ɾ�������߿ͻ�
	public void delClient(PrintWriter pw) {
		onLine.remove(pw);
	}
	//��������������
	public void startServer(){
		//����ѭ�����ַ�����һֱ����
		System.out.println("��������������....");
		while (true) {
			try {
				//����
				System.out.println("�ȴ��ͻ�������...");
				Socket socket=serverSocket.accept();
				//���̴߳���ͻ�������
				Thread thread=new Thread(new myThread(socket));
				thread.start();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	//�����߳�ר����������ͻ�������
	class myThread implements Runnable{
		private Socket socket;
		public myThread(Socket socket) {
			this.socket=socket;
		}
		public void run() {
			//���պ͹㲥�ͻ�����Ϣ
			BufferedReader br=null;
			PrintWriter pw=null;
			int id=0;
			try {
				br=new BufferedReader(new InputStreamReader(socket.getInputStream(),"UTF-8"));
				pw=new PrintWriter(new OutputStreamWriter(socket.getOutputStream(),"UTF-8"),true);
				//�ѿͻ���socket����������뼯��
				addClient(pw);
				//��ȡ�ͻ��˶˿�
				id=socket.getPort();
				//�㲥�ͻ���������Ϣ
				sendInfo(id+"�Ѿ����ߣ�����ǰ����������"+onLine.size());
				//�㲥�ͻ���������
				String temp="";
				while((temp=br.readLine())!=null){
					sendInfo(id+"˵��"+temp);
				}
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}finally{
				//ɾ�����߿ͻ�
				delClient(pw);
				//�㲥������Ϣ
				sendInfo(id+"�����ˣ�����ǰ����������"+onLine.size());
				pw.close();
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				try {
					socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			
		}
		
	}
	//����������
	public static void main(String[] args) {
		Server server =new Server();
		server.startServer();
	}
}
