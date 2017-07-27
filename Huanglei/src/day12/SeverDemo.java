package day12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SeverDemo {

	public static void main(String[] args) {
		ServerSocket sever=null;
		Socket socket=null;
		InputStream ins=null;
		OutputStream outs=null;
		BufferedReader br=null;
		try {
			sever=new ServerSocket(9898);
			socket=sever.accept();
			ins=socket.getInputStream();
			outs=socket.getOutputStream();
			br=new BufferedReader(new InputStreamReader(ins));
			String info=null;
			while (!((info=br.readLine())==null)) {
				System.out.println("我是服务器，客户登陆信息为："+info);
			}
			String reply="欢迎你，登陆成功！";
			outs.write(reply.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				ins.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				outs.close();
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
