package day14;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UdpServer {

	public static void main(String[] args) {
		DatagramSocket socket=null;
		try {
			//����
			socket=new DatagramSocket(6666);
			byte[] b=new byte[1024];
			DatagramPacket packet =new DatagramPacket(b, b.length);
			socket.receive(packet);
			System.out.println(new String(b,0,packet.getLength()));
			//����
			String msg="��ã����Ƿ�����!";
			InetAddress address=packet.getAddress();
			int port=packet.getPort();
			DatagramPacket packet2=new DatagramPacket(
					msg.getBytes(), msg.getBytes().length,address,port);
			socket.send(packet2);
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(socket != null){
				socket.close();
			}
		}
		

	}

}
