import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {

		System.out.println("1. Write a Java program to print 'Hello' on screen and then print your name on a separate line.");
		/*▪ Expected Output : 
			▪ Hello
			▪ Your name*/
		String name = "Srinivas";
		System.out.println("Hello");
		System.out.println(name);
		
		System.out.println("2. Write a Java program to print the sum of two numbers.");
		/*▪ Test Data: 4 + 36
		▪ Expected Output : 40*/
		int a, b;
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		b = s.nextInt();
		
		System.out.println("Test Data: "+ a + " + " + b);
		System.out.println("Sum of a and b: "+(a+b));
		
		System.out.println("3. Write a Java program to swap two numbers.");
		
		System.out.println("Before Swaping: "+"a="+a);
		System.out.println("Before Swaping: "+"b="+b);
		int temp;
		temp = a;
		a = b;
		b= temp;
		System.out.println("After Swaping: "+"a="+a);
		System.out.println("After Swaping: "+"b="+b);
		
		System.out.println("4. Write a Java Program to swap two numbers without using third variable.");
		
		System.out.println("Before Swaping: "+"a="+a);
		System.out.println("Before Swaping: "+"b="+b);
		a=a+b; //20=20+10 --> a=30
		b=a-b; //10=30-10 --> b=20
		a=a-b; //30=30-20 --> a=10
		System.out.println("After Swaping: "+"a="+a);
		System.out.println("After Swaping: "+"b="+b);
		
	}

}
