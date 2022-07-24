package filehandling;
import java.io.FileWriter;
import java.io.IOException;
public class append {
	

	

		public static void main(String[] args) {
			String bro ="   This data is appended";
			try {
				FileWriter output = new FileWriter("bro.txt",true);
				output.write(bro);
				System.out.println("data appended");
				output.close();
			} catch (IOException e) {
				System.out.println("file append error ");
			}

		}

	}



