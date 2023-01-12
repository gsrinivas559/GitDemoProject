package Assignments.MultipleInheritance;

interface A {
	int a = 100, b = 200;
	void add();
}

interface B{
	int x = 300, y = 400;
	void mul();
}

public class Calculation implements A,B{

	@Override
	public void mul() {

		System.out.println(x*y);
	}

	@Override
	public void add() {

		System.out.println(a+b);
	}

	public static void main(String[] args) {

		Calculation cal = new Calculation();
		cal.add();
		cal.mul();
	}
}
