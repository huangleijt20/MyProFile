package day13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Clients {
	private Socket socket=null;
	public  Clients() {
		try {
			socket=new Socket("localhost",9898);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//启动客户端
	public void start(){
		//接收
		Thread thread=new Thread(new myThread());
		thread.start();
		//发送
		PrintWriter pw=null;
		Scanner input=new Scanner(System.in);
		try {
			pw=new PrintWriter(
					new OutputStreamWriter(socket.getOutputStream(),"UTF-8"),true);
			String temp=input.next();
			//如果输入exit退出聊天
			while(!(temp.equals("exit"))){
				pw.print(temp);
			}
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			pw.close(); //printWriter自动处理异常
		}
	}
	//接收客户端信息线程
	class myThread implements Runnable{

		@Override
		public void run() {
			BufferedReader br=null;
			try {
				br=new BufferedReader(new InputStreamReader(socket.getInputStream(),"UTF-8"));
				String temp="";
				while ((temp=br.readLine())!=null) {
					System.out.println(temp);
				}
			} catch (Exception e) {
				System.out.println("已下线！");
			} finally{
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		}
		
	}
	//启动客户端
	public static void main(String[] args) {
		Clients clients=new Clients();
		clients.start();
	}
}
