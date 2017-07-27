package day10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class PetWriter {

	public static void main(String[] args) {
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream(
					"d:/pet.template"), "utf-8"));
			bw = new BufferedWriter(new FileWriter("d:/pet1.template"));
			String temp = null;
			while ((temp = br.readLine()) != null) {
				String newString=temp.replace("{name}", "≈∑≈∑");
				newString=newString.replace("{type}", "π∑π∑");
				newString=newString.replace("{master}", "¿ÓŒ∞");
				bw.write(newString);
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
			try {
				bw.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}

	}

}
