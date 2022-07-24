package filehandling;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class read {
	
	

		public static void main(String[] args) throws IOException {
			char[] bro = new char[100];
			try {
				FileReader input = new FileReader("bro.txt");
				input.read(bro);
				System.out.println("data received ");
				System.out.println(bro);
				input.close();
			} catch (FileNotFoundException e) {
				System.out.println("file read error");
			}
			

		}

	}


