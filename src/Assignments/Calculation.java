package Assignments;

public class Calculation {

	int a, b, c;
	
	public Calculation(int x, int y, int z) {
		a=x;
		b=y;
		c=z;
	}
	
	public void sum() {
		int add = 0;
		add = a + b + c;
		System.out.println("The Sum of All the Numbers "+add);
	}
}
