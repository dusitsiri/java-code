package lesson7exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Example {

	public void read1(String filename) {		   
		try {
			FileReader reader = new FileReader(filename);
			BufferedReader in = new BufferedReader(reader);
			String input = in.readLine();
			int value = Integer.parseInt(input);
		}
		catch (NumberFormatException e) {
			System.err.println("Input was not a number");
		}
		catch (FileNotFoundException e) {
			System.err.println("File " + filename + " cannot be found!");
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println();
		}

	}

	public void read2(String filename) throws IOException  
	{		   
		FileReader reader = new FileReader(filename);
		BufferedReader in = new BufferedReader(reader);
		String input = in.readLine();
		int value = Integer.parseInt(input);
		reader.close();
	}

	public void read22(String filename) throws IOException  
	{		   
		FileReader reader = null;
		try { 
			reader = new FileReader(filename);
			BufferedReader in = new BufferedReader(reader);
			String input = in.readLine();
			int value = Integer.parseInt(input);
		} catch (IOException e) {
			System.exit(1);
		} finally {
			if (reader != null)
				reader.close();
		}
	}

	public void read3(String filename) throws FileNotFoundException, IOException {
		FileReader reader = null;
		try {	
			reader = new FileReader(filename);
			BufferedReader in = new BufferedReader(reader);
			String input = in.readLine();
			int value = Integer.parseInt(input);
		} finally {
			if (reader != null)
				reader.close();	
		}
	}

	public void read4(String filename) throws FileNotFoundException, IOException {		   
		FileReader reader = new FileReader(filename);
		BufferedReader in;

		try {
			in = new BufferedReader(reader);
			String input = in.readLine();
			int value = Integer.parseInt(input);
		}
		finally {
			reader.close();
		}
	}

	public void read5(String filename) throws IOException {		   
		FileReader reader = null;
		BufferedReader in;

		try {
			reader = new FileReader(filename);
			in = new BufferedReader(reader);
			String input = in.readLine();
			int value = Integer.parseInt(input);
		} catch (FileNotFoundException e) {
			System.err.println("File " + filename + " cannot be found!");
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			if (reader != null)
				reader.close();
		}
	}

	public void read6(String filename) {		   
		FileReader reader = null;
		BufferedReader in;

		try {
			try {
				reader = new FileReader(filename);
				in = new BufferedReader(reader);
				String input = in.readLine();
				int value = Integer.parseInt(input);
			}
			finally {
				reader.close();
			}
		} 
		catch(IOException e) {
			System.exit(1);
		}	
	}


}
