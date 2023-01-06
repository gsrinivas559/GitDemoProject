package Assignments;

public class CalculationMain {

	public static void main(String[] args) {

		Calculation cal = new Calculation(10, 20, 30);
		cal.sum();
		int a = cal.sum(10, 20);
		double b = cal.sum(100, 200);
		int c = cal.sum(10, 20, 30);
		double d = cal.sum(100, 200, 300);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

}
