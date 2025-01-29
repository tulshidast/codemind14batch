package javapractices;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class CompileTimeAndRuntimeException {

	public static void main(String[] args) throws IOException, NullPointerException, IndexOutOfBoundsException {

		File file = new File("d:/test.txt");

		file.createNewFile();

		FileInputStream fileInputStream = new FileInputStream(file);

		CompileTimeAndRuntimeException compileTimeException = new CompileTimeAndRuntimeException();

		System.out.println(compileTimeException.div(10, 2));

		// System.out.println(compileTimeException.div(10, 0));

		// String s="12345shgj";
		String s = "12345";

		int num = Integer.parseInt(s);

		System.out.println(num);

		// String ss = null;
		String ss = "Welcome to codemind";
		ss.length();

		String sss = "Welcome to codemind";

		System.out.println(sss.charAt(16));

		int[] array = { 10, 20, 30, 59 };

		// System.out.println(array[4]);

		System.out.println(array[2]);

		System.out.println("After getting exception");

	}

	public float div(int a, int b) {
		return a / b;
	}

}
