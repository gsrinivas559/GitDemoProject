package Assignments;

import java.util.Arrays;

public class Assignment2 {

	public static void main(String[] args) {

		System.out.println("1. Write a Java program to calculate sum values of an array.");
		int a[] = {25, 35, 50, 40, 30, 15, 40, 45, 20, 10, 40, 25, 10};
		int sum =0;
		for (int i : a) {
			sum =sum + i;
		}
		System.out.println("Sum values of an array: "+sum);
		
		System.out.println("2. Write a Java program to calculate average of values of an array.");
		//avg = 10+20/2
		int avg = 0;
		int length = a.length;
		/*Already sum is calculated in above question. so commented and using same sum
		 * for (int i : a) {
			sum =sum + i;
		}*/
		avg = sum/length;
		System.out.println("Average of values of an array:"+avg);
		
		System.out.println("3. Write a Java program to print even and odd numbers in an array.");
		//10%2==0
		System.out.print("Even Numbers are : ");
		for (int i : a) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.print("Odd Numbers are : ");
		for (int i : a) {
			if(i%2!=0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		
		System.out.println("4. Write a Java program to find missing number in an array.");
		int num = 40;
		boolean flag = false;
		System.out.println("Missing Number is: "+num);
		for (int i : a) {
			if(num==i) {
				System.out.println("Element Found in Array");
				flag = true;
				break;
			}
		}
		if(flag==false)
		System.out.println("Element Not Found in Array");
		
		System.out.println("5. Write a program to find greatest and smallest element in an array.");
		//temp = a[0] --> if(a[i] > temp) --> temp = a[i] 
		int temp = a[0];
		for (int i : a) {
			if(i > temp) {
				temp = i;
			}
		}
		System.out.println("Greatest element in Array is: "+temp);
		for (int i : a) {
			if(i < temp) {
				temp = i;
			}
		}
		System.out.println("Smallest element in Array is: "+temp);
		
		System.out.println("6. Write a program count multiples of a number in an array.");
		int count =0;
		for (int i : a) {
			if(i == num) {
				count++;
			}
		}
		System.out.println("count multiples of a number: "+num+ " is: "+count);
		
		System.out.println("7. Write a program to check equality of arrays.");
		/*
		• Using for loop
		• Uisng Arrays.equals() method */
		int b[] = {25, 35, 50, 40, 30, 15, 40, 45, 20, 10, 40, 25, 10};
		if(a.length == b.length) {
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < b.length; j++) {
					if(a[i] == b[j]) {
						flag=true;
					}
				}
			}
		}else {
			flag=false;
		}
		if(flag) {
			System.out.println("Both arrays are equal");
		}else {
			System.out.println(" Both arrays are not equals");
		}
		//Uisng Arrays.equals() method
		boolean isArrayEqual = Arrays.equals(a, b);
		if (isArrayEqual) {
			System.out.println("Both arrays are equal");
		} else {
			System.out.println(" Both arrays are not equal");
		}
		
		System.out.println("8. Add two matrices using 2 dimensional array.");
		int x[][] = {{100, 200}, {300, 400}, {500, 600}};
		int y[][] = {{100,200}, {300, 400}, {500, 600}};
		int row = x.length, column = x[0].length;
		int[][] z = new int[row][column];
		/*for (int[] r : x) {
			for (int s : r) {
				System.out.print(s+" ");
			}
		}
		System.out.println();
		for (int[] u : y) {
			for (int v : u) {
				System.out.print(v+" ");
			}
		}*/
		System.out.println(x.length);
		System.out.println(x[0].length);
		/*for (int i = 0; i < x.length; i++) { //0<3 --> 1<3 --> 2<3 --> 3<3[false]
			for (int j = 0; j < x[i].length; j++) { //0<2 --> 1<2 --> 2<2 [false]
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
		}
		for (int i = 0; i < y.length; i++) { //0<3 --> 1<3 --> 2<3 --> 3<3[false]
			for (int j = 0; j < y[i].length; j++) { //0<2 --> 1<2 --> 2<2 [false]
				System.out.print(y[i][j]+" ");
			}
			System.out.println();
		}*/
		for (int i = 0; i < x.length; i++) { //0<3 --> 1<3 --> 2<3 --> 3<3[false]
			for (int j = 0; j < x[i].length; j++) { //0<2 --> 1<2 --> 2<2 [false]
				z[i][j] = x[i][j]+y[i][j];
				System.out.print(z[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("9. Declare array with few elements, then find out nagitve and postive numbers.");
		//0>=0
		int[] arr = {-30, -20, -10, 0, 10, 20, 30};
		System.out.println("Positive Numbers are: ");
		for (int i : arr) {
			if (i>=0) {
				System.out.println(i); 
			}
		}
		System.out.println("Negative Numbers are: ");
		for (int i : arr) {
			if (i<0) {
				System.out.println(i); 
			}
		}
		for (int i : arr) {
			if (i>0) {
				System.out.print("Positive Numbers: ");
				System.out.println(i);
			}else if(i<0){
				System.out.print("Negative Numbers: "); 
				System.out.println(i);
			}else {
				System.out.print("Neither Positive nor Negative Numbers: ");
				System.out.println(i);
			}
		}
		System.out.println("10. Search a string in an array.");
		String[] s = {"Welcome", "To", "Java", "With", "Selenium"};
		String str = "Java";
		System.out.println("Missing String to Find: "+str);
		for (String string : s) {
			if(str==string) {
				System.out.println("String Found");
				flag = true;
				break;
			}
		}
		if(flag==false)
		System.out.println("String Not Found");
	}

}
