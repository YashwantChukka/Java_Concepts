package day4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test_Throws {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileReader fr = new FileReader("C:\\Test.txt"); //FileNotException
		
		BufferedReader bfr = new BufferedReader(fr);
		
		System.out.println(bfr.readLine());

	}

}
