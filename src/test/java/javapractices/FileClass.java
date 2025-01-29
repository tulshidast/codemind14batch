package javapractices;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileClass {

	public static void main(String[] args) throws IOException {

		File file = new File("src/test/resources/test.txt");

		// file.createNewFile();

		// file.delete();

		boolean exist = file.exists();

		System.out.println("File is exist = " + exist);

		System.out.println("File is redable = " + file.canRead());

		System.out.println("Absolute path of file = " + file.getAbsolutePath());

		System.out.println("Size of file = " + file.length());

		System.out.println("Name of file = " + file.getName());

		// how to write data in file
		FileWriter fileWriter = new FileWriter(file);

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter data to write in file");

		String s = scanner.next();

		// fileWriter.write("Welcome to codemind technology");

		fileWriter.write(s);

		fileWriter.close();

		// how to read data from file
		FileReader fileReader = new FileReader(file);

		int i;

		while ((i = fileReader.read()) != -1) {
			System.out.print((char) i);
		}

		fileReader.close();

	}

}
