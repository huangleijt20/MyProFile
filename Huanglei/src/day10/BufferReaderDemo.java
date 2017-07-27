package day10;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		InputStreamReader isr=null;
		BufferedReader br=null;
		try {
			isr=new InputStreamReader(new FileInputStream("e:/ffff.txt"));
			br=new BufferedReader(new InputStreamReader(new FileInputStream("e:/ffff.txt")));
//			int n1=isr.read();
//			int n2=br.read();
//			System.out.println((char)n1);
//			System.out.println((char)n2);
//			char[] ch=new char[10];
//			isr.read(ch);
//			br.read(ch);
			//System.out.println(new String(ch));
			//Ñ­»·Êä³öbr
			String temp=null;
			while((temp=br.readLine())!=null){
				System.out.println(temp);
			}
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally{
			if (isr!=null) {
				try {
					isr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (br!=null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
