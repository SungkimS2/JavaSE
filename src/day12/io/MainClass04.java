package day12.io;
/*
 * [[ FileReader / FileWriter ]]
 * 	���� ������ �б�/���� ����� �����ϴ� Ŭ����
 * 
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainClass04 {
	public static void main(String[] args) throws IOException {
		FileReader fr = null;
		BufferedReader br = null;
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			// hello.txt ������ �б� ���� FileReader ��ü ����
			fr = new FileReader("./upload/hello.txt");
			// BufferedReader�� ���� Reader�� ���μ� ���� ����� �߰���
			br = new BufferedReader(fr);
			
			// hello4.txt ������ ���� ���� FileWriter ��ü ����
			fw = new FileWriter("./upload/hello4.txt");
			// BufferedWriter�� ���� Writer�� ���μ� ���� ����� �߰���
			bw = new BufferedWriter(fw);
			
			// ���Ͽ��� ���� ���ڸ� ���ۿ� ����, ���۰� �������� ���Ͽ� �ѹ��� ���⸦ ������
			int readCharCnt = 0;
			char[] c = new char[2];
			while((readCharCnt = br.read(c)) != -1) {
				bw.write(c, 0, readCharCnt);
			}
			
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(bw != null) bw.close();
			if(br != null) br.close();
			if(fw != null) fw.close();
			if(fr != null) fr.close();
			
		}
		
		
		
				
	}

}








