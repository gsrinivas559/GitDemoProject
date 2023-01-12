package Assignments.TryCatchConcept;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UsingThrowsKeyword {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.out.println("2. Write a java program to handle IO Exception by using throws.");
		
		FileReader fr = new FileReader(System.getProperty("user.dir") +"\\src\\Files\\Sample");
		BufferedReader br = new BufferedReader(fr);
		String s = br.readLine();
		System.out.println(s);
		Thread.sleep(2000);
		br.close();
	}

}
