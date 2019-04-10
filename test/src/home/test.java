package home;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class test {
	public static void main(String[] args) throws Exception {
		File f=new File("src/data");
		System.out.println(f.exists());
		FileReader filea = new FileReader("src/home/a.txt");
		FileReader fileb = new FileReader("src/home/b.txt");
		System.out.println(f.exists());
		File w=new File("src/home/b.txt");
		
		BufferedReader readera = new BufferedReader(filea);
		BufferedReader readerb = new BufferedReader(fileb);
		BufferedWriter writer2 = new BufferedWriter(new FileWriter(w));
		String a=readera.readLine();
		String[] arraya;
		String b=readera.readLine();
		String[] arrayb;
		arraya=a.split(",");
		List<String> alist=new ArrayList<>();
		List<String> blist=new ArrayList<>();
		arrayb=b.split(",");
		for (String b1 : arraya) {
			alist.add(b1);
		}
		for (String b1 : arrayb) {
			if(!alist.contains(b1)){
				alist.add(b1);
			}else{
				
			}
		}
		filea.close();
		readera.close();
	}
}
