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
	//创建集合储存在线客户
	private List<PrintWriter> onLine;
	public Server(){
		try {
			serverSocket=new ServerSocket(9898);
			onLine=new ArrayList<PrintWriter>();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//广播信息的方法
	public void sendInfo(String msg) {
		//遍历在线客户集合，发送广播
		for (PrintWriter pw : onLine) {
			pw.print(msg);
		}
	}
	//添加已连接客户到在线集合
	public void addClient(PrintWriter pw){
		onLine.add(pw);
	}
	//删除已离线客户
	public void delClient(PrintWriter pw) {
		onLine.remove(pw);
	}
	//服务器启动方法
	public void startServer(){
		//用死循环保持服务器一直运行
		System.out.println("服务器正在启动....");
		while (true) {
			try {
				//监听
				System.out.println("等待客户端请求...");
				Socket socket=serverSocket.accept();
				//用线程处理客户端请求
				Thread thread=new Thread(new myThread(socket));
				thread.start();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	//创建线程专门用来处理客户端请求
	class myThread implements Runnable{
		private Socket socket;
		public myThread(Socket socket) {
			this.socket=socket;
		}
		public void run() {
			//接收和广播客户端信息
			BufferedReader br=null;
			PrintWriter pw=null;
			int id=0;
			try {
				br=new BufferedReader(new InputStreamReader(socket.getInputStream(),"UTF-8"));
				pw=new PrintWriter(new OutputStreamWriter(socket.getOutputStream(),"UTF-8"),true);
				//把客户端socket的输出流放入集合
				addClient(pw);
				//获取客户端端口
				id=socket.getPort();
				//广播客户端上线信息
				sendInfo(id+"已经上线！，当前在线人数："+onLine.size());
				//广播客户聊天内容
				String temp="";
				while((temp=br.readLine())!=null){
					sendInfo(id+"说："+temp);
				}
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}finally{
				//删除下线客户
				delClient(pw);
				//广播下线信息
				sendInfo(id+"下线了！，当前在线人数："+onLine.size());
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
	//启动服务器
	public static void main(String[] args) {
		Server server =new Server();
		server.startServer();
	}
}
