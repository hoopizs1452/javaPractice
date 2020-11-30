import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class IO {

	public static void main(String[] args) {
//		try {
//			int i = System.in.read();
//			System.out.println(i);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

//		Scanner sc = new Scanner(System.in);
//		int i = 0;
//		i = sc.nextInt();
//		System.out.println(i);
//		while(i != -1) {
//			i = sc.nextInt();
//			System.out.println(i);
//		}
//		sc.close();
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		try {
//			String s = br.readLine();
//			System.out.println(s);
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
		
//		File f = new File("test.txt");
//		try {
//			f.createNewFile();
//			System.out.println(f.canRead());
//			System.out.println(f.getAbsolutePath());
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
		
		Path p = Paths.get("test2.txt");
		try {
			Files.createFile(p);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
