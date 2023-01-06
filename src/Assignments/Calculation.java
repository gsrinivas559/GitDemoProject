package Assignments;

public class Calculation {

	int a, b, c;
	
	public Calculation(int x, int y, int z) {
		a=x;
		b=y;
		c=z;
	}
	
	public int sum(int x, int y) {
		return (x+y);
	}
	public int sum(int x, int y, int z) {
		return (x+y+z);
	}
	public double sum(double x, double y) {
		return (x+y);
	}
	public double sum(double x, double y, double z) {
		return (x+y+z);
	}
	public void sum() {
		int add = 0;
		add = a + b + c;
		System.out.println("The Sum of All the Numbers "+add);
	}
}
