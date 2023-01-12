package Assignments.TryCatchConcept;

public class TryCatch {

	public static void main(String[] args) {

		System.out.println("1. Write a java program for the following and handle exceptions by using try..catch and finally blocks.");
		
		System.out.println("Any number divide by zero.");
		int num = 100;
		try {
			System.out.println(num/0); //Arthematic Exception
		}catch (Exception e) {
			System.out.println("Exception Handled Successfully.");
		}
		finally {
			System.out.println("Program is Completed.");
		}
		
		System.out.println("int a[]=null; ");
		int a[]=null; 
		try {
			System.out.println(a.length); //NUll Pointer Exception
		}catch (Exception e) {
			System.out.println("Exception Handled Successfully.");
		}
		finally {
			System.out.println("Program is Completed.");
		}
		
		System.out.println("String s=\"abc\"; ");
		String s="abc";
		try {
			int i = Integer.parseInt(s);
			System.out.println(i); //NumberFormat Exception
		}catch (Exception e) {
			System.out.println("Exception Handled Successfully.");
		}
		finally {
			System.out.println("Program is Completed.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
