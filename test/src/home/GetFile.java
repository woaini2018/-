package home;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Set;

public class GetFile {
	public static void main(String[] args) throws Exception {
		File file = new File("src/data/test.properties");
		Set readFile = readFile(file);
		System.out.println(readFile.size());
	}

	public static Set readFile(File file) throws Exception {
		Set set =new HashSet<>();
		FileReader f = new FileReader(file);
		BufferedReader read = new BufferedReader(f);
		String a;
		String b="";
		while ((a = read.readLine()) != null) {
			if (a.contains(".py")) {
				b = a.substring(a.lastIndexOf("/")+1, a.indexOf(".py") + 3);
			}
			if (b != null && b != "") {
				set.add(b);
				System.out.println(b);
			}
		}
		read.close();
		f.close();
		return set;
	}
}
