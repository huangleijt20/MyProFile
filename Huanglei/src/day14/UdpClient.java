package day14;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UdpClient {

	public static void main(String[] args) {
		DatagramSocket socket=null;
		try {
			socket=new DatagramSocket();
			//����
			String msg="��ã����ǿͻ���!";
			InetAddress address=InetAddress.getByName("localhost");
			int port=6666;
			DatagramPacket packet=new DatagramPacket(
					msg.getBytes(), msg.getBytes().length,address,port);
			socket.send(packet);
			//����
			byte[] b =new byte[1024];
			DatagramPacket packet2=new DatagramPacket(b, b.length);
			socket.receive(packet2);
			System.out.println(new String(b,0,packet.getLength()));
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(socket != null){
				socket.close();
			}
		}
	}

}
