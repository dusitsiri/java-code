package lesson8io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Io06 {

	public static void main(String[] args) {

//		อ่านไฟล์
		String filename = "number.txt";
		try {
			FileReader fileReader = new FileReader(filename);
			BufferedReader buffer = new BufferedReader(fileReader);

			String line;
			int sum = 0;
			while ((line = buffer.readLine()) != null) {
				int num = Integer.parseInt(line);
				sum += num;
			}	
			System.out.println("Total: " + sum);
		}
		catch (FileNotFoundException e){
			System.err.println("Cannot read file "+filename);
		}		
		catch (IOException e){
			System.err.println("Error reading from file");
		}		

	}
}
