package day11;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStream {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DataOutputStream dos = null;
		DataInputStream dis = null;
		try {
			dos = new DataOutputStream(new FileOutputStream("D:/asd.txt"));
			byte b = 123;
			short s = 444;
			int i = 54442;
			long l = 3434555551233L;
			float f = 12.33f;
			double d = 1234.33;
			char c = 'a';
			boolean bol = false;
			dos.writeByte(b);
			dos.writeShort(s);
			dos.writeInt(i);
			dos.writeLong(l);
			dos.writeFloat(f);
			dos.writeDouble(d);
			dos.writeChar(c);
			dos.writeBoolean(bol);
			dos.flush();
			dis = new DataInputStream(new FileInputStream("D:/asd.txt"));
			System.out.println("byte:" + dis.readByte());
			System.out.println("short:" + dis.readShort());
			System.out.println("int:" + dis.readInt());
			System.out.println("long:" + dis.readLong());
			System.out.println("float:" + dis.readFloat());
			System.out.println("double:" + dis.readDouble());
			System.out.println("boolean:" + dis.readBoolean());

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				dos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try {
			dis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
