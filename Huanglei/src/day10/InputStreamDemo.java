package day10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FileInputStream file=null;
		FileOutputStream fos=null;
		try {
			file=new FileInputStream("d:/javaOOP.txt");
			fos=new FileOutputStream("e:/ffff.txt");
			//file.available();//可读取字节总数
			int temp=-1;
			byte[] b=new byte[1000];
			//int i=file.read(b);
			while((temp=file.read(b))!=-1){
				//System.out.print(new String(b,0,temp));
				fos.write(b,0,temp); //(b,0,temp)最后一次写入不够数组长度，需按实际长度写入，
				fos.flush();
			}
			System.out.println("复制完成!");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally{
			if (file!=null) {
				try {
					file.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
			if (fos!=null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
