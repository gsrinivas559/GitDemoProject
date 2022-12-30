import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {

		System.out.println("1. Write a Java program to get a number from the user and print whether it is positive or negative.");
		
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		if(num>0) {
			System.out.println("positive");
		}else {
			System.out.println("negative");
		}
		
		System.out.println("2. Write a Java program to find greatest of 3 numbers.");
		int a = 10, b = 20, c= 30;
		if(a>b && a>c) {
			System.out.println("a is greatest");
		}else if(b>a && b>c) {
			System.out.println("b is greatest");
		}else {
			System.out.println("c is greatest");
		}
		
		System.out.println("3. Write a Java to display the multiplication table of a given integer using for loop.");
		/* 2*1 = 2
		   2*2 = 4 */
		for(int i=1; i<=10; i++) {
			System.out.println(num +" * "+ i + " = " + (num * i));
		}
		
		System.out.println("4. Write a Java program count the number of digits of the number using while loop.");
		//1234 -->Method 1
		int count = 0;
		System.out.println("number:"+num);
		while (num!=0) {
			num = num/10;
			count++;
		}
		System.out.println("Number of digits of the number:"+ count);
		
		//Method 2 --> to find the count/length of number
		int number = 1234;
		String value = Integer.toString(number);
		System.out.println("Number of digits of the number:"+number+" using string type: " + value.length());
		
		System.out.println("5. Write a Java program to reverse a number using while loop.");
		/*num = 1234 --> 4321
		rem = 1234%10 = 4
		int rev = 0
		rev = 0*10+4 = 4
		num = 1234/10 = 123 */
		int rem, reverseNum=0;
		System.out.println("Original Number is: "+number);
		while(number!=0) {
			rem = number%10;
			reverseNum = reverseNum * 10 + rem ;
			number = number/10;
		}
		System.out.println("Reverse Number is: "+reverseNum);
		
		System.out.println("6. Write a Java program to check Number is Palindrome or not using while loop.");
		//121, MADAM -- Method 1 -->
		int revNum =0, originalNum=12321;
		int temp = originalNum;
		System.out.println("Original Number is: "+temp);
		while(originalNum!=0) {
			rem = originalNum%10;
			revNum = revNum * 10 + rem ;
			originalNum = originalNum/10;
		}
		System.out.println("Reverse Number: "+revNum);
		if(temp==revNum) {
			System.out.println("Palindrome Number");
		}else {
			System.out.println("Not Palindrome Number");
		}
		
		/*Method 2 -->
		 *  String original, reverse = ""; // Objects of String class  
      		Scanner in = new Scanner(System.in);   
      		System.out.println("Enter a string/number to check if it is a palindrome");  
      		original = in.nextLine();   
      		int length = original.length();   
      		for ( int i = length - 1; i >= 0; i-- )  
         	reverse = reverse + original.charAt(i);  
      		if (original.equals(reverse))  
         	System.out.println("Entered string/number is a palindrome.");  
      		else  
         	System.out.println("Entered string/number isn't a palindrome.");   
		 */
		
		
		
		
		
		
		
		
		
		
	}

}
