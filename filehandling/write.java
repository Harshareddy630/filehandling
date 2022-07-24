package filehandling;
import java.io.FileWriter;
import java.io.IOException;

public class write {
	
	

		public static void main(String[] args) {
			String bro ="6, harsha , kadiri , puttaparthi , andhra";
			
			try {
				FileWriter output = new FileWriter("bro.txt");
				output.write(bro);
				System.out.println("Data written  successfully");
				output.close();
			} catch (IOException e) {
				System.out.println("File write error");
			}

		}

	}


