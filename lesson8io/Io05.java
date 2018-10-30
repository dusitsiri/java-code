package lesson8io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Io05 {

	public static void main(String[] args) {

		//อ่านไฟล์
		String filename = "hello.txt";
		try {
			FileReader fileReader = new FileReader(filename);
			BufferedReader buffer = new BufferedReader(fileReader);

			System.out.println("Open file:");
			String line = buffer.readLine();

			while (line != null) {
				System.out.println("-----> " + line);
				line = buffer.readLine();
			}			
		}
		catch (FileNotFoundException e){
			System.err.println("Cannot read file: "+filename);
		}		
		catch (IOException e){
			System.err.println("Error reading from file");
		}		

	}
}
