package FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class FileHandling {
	public static void main(String[] args) throws Exception {
		System.out.println("File Handling");
		//file creation
		File file=new File("./icon.txt");
		if (!file.exists()) {
			file.createNewFile();
		}
		FileWriter fw=new FileWriter(file);
		System.out.println("write file using FileWriter=>");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your text here: ");
		String ss=sc.nextLine();
		fw.write(ss);
		System.out.println(file.exists());
		System.out.println("use append");
		fw.append("sai kumar");
		fw.close();


		//read using filereader
		FileReader fr=new FileReader(file);
		int in;
		String s = "";
		while ((in=fr.read()) !=-1) {
			s+= (char)in;
		}
		System.out.println();
		System.out.println("read file using filereader=>");
		System.out.println(s);
		fr.close();

		fw.close();
		// write using buffered writer
		BufferedWriter bw=new BufferedWriter(new FileWriter(file));
		System.out.println();
		System.out.println("write file using BufferedWriter=>");
		System.out.println("enter your text here:");
		String sss=sc.nextLine();
		bw.write(ss+sss);
		System.out.println();
		System.out.println(file.canWrite());
		bw.append("sai icon");
		bw.close();

		//fileoutputstream
		//it can write only integer values

		/*FileOutputStream fos=new FileOutputStream(file);
		fos.write();
		fos.close();
		 */


		//read using fileinputstream
		FileInputStream fis=new FileInputStream(file);
		int inn;
		String str="";
		while ((inn=fis.read()) != -1) {
			str += (char)inn;
		}
		System.out.println();
		System.out.println("read file using FileInputStream=>");
		System.out.println(str);
		fis.close();


		//read using buffered reader
		BufferedReader br=new BufferedReader(new FileReader(file));

		int innn;
		String ssss="";
		while ((innn =br.read())!= -1) {
			ssss+= (char)innn;
		}
		System.out.println();
		System.out.println("read file using bufferedreader=>");
		System.out.println(ssss);
		br.close();


		//read using scanenr file
		Scanner scn=new Scanner(file);
		System.out.println();
		System.out.println("read file using scanner file=>");
		while (scn.hasNext()) {
			System.out.print(scn.next()+" ");
		}
		scn.close();
	}

}
