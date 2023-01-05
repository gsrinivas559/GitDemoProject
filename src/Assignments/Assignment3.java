package Assignments;

public class Assignment3 {

	public static void main(String[] args) {

		System.out.println("1. Write a java program to compare two strings, ignoring case differences.");
		//s==s1
		String s = "Welcome ";
		String s1 = "welcome";
		if(s.equalsIgnoreCase(s1)) {
			System.out.println("Both String's are same");
		}else {
			System.out.println("Both String's are not same");
		}
		
		System.out.println("2. Write a Java program to concatenate a given string to the end of another string.");
		s1 = "To Java with Selenium";
		String str = s + s1;
		System.out.println(str);
		
		System.out.println("3. Write a java program to get the length of a given string.");
		System.out.println(s.length());
		System.out.println(s1.length());
		System.out.println("4. Write a Java program to get a substring of a given string between two specified positions.");
		String subString = s1.substring(3, 21);
		System.out.println(subString);
		
		System.out.println("5. Write a Java program to convert all the characters in a string to uppercase.");
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);
		
		System.out.println("6. Write a Java program to convert all the characters in a string to lowercase.");
		String lowerCase = s.toLowerCase();
		System.out.println(lowerCase);
		
		System.out.println("7. Write a Java program to reverse a string.");
		String name = "Srinivas";
		String rev = "";
		int length = name.length();
		for (int i = length-1; i >= 0; i--) {
			rev = rev + name.charAt(i);
		}
		System.out.println("Reverse String: "+rev);
		
		System.out.println("8. Write a Java program to count number of time a character repeated in a string.");
		int count = 0;
		Character charInString = 'i';
		for (int i = 0; i < length; i++) {
			if(charInString.equals(name.charAt(i))) {
				count++;
			}
		}
		System.out.println(count);
		
		System.out.println("9. Write a Java program to convert integer to string.");
		int num = 12345;
		String numConvToString = Integer.toString(num);
		System.out.println(numConvToString);
		//Method 2 -->
		numConvToString = String.valueOf(num);
		System.out.println(numConvToString);
		
		System.out.println("10.Write a Java program to convert string to integer.");
		String strToInt = "123456789";
		int strConvToInt = Integer.valueOf(strToInt);
		System.out.println(strConvToInt);
		//Method 2 -->
		strConvToInt = Integer.parseInt(strToInt);
		System.out.println(strConvToInt);
		System.out.println("11.Write a Java program to Swap the 2 strings.");
		//10 20 java selenium
		String tempVar = "";
		tempVar = s;
		s=s1;
		s1=tempVar;
		System.out.println(s +" "+ s1);
		//Method 2 (without using third variable)-->
		System.out.println("Before Swapping the value of s: "+s);
		System.out.println("Before Swapping the value of s1: "+s1);
		
		s = s + s1; //To Java with Selenium Welcome
		s1 = s.substring(0, s.length()-s1.length());
		s = s.substring(s1.length());
		
		System.out.println("After Swapping the value of s: "+s);		
		System.out.println("After Swapping the value of s1: "+s1);
		
		System.out.println("12.Write a program to check a string is palindrome or not.");
		//MADAM
		String reverseString = "", temp = "MADAM";
		int strLength = temp.length();
		System.out.println(temp.length());
		for (int i = strLength-1; i >= 0 ; i--) {
			System.out.print(temp.charAt(i));
			reverseString = reverseString + temp.charAt(i);
		}
		System.out.println();
		System.out.println(reverseString);
		if(temp.equals(reverseString)) {
			System.out.println("The Given String is a Palindrome");
		}else {
			System.out.println("The Given String is not a Palindrome");
		}
		
		
		
		
		
		
	}

}
