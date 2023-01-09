package MultipleInheritance;

interface I
{
	int a = 100;
	int b = 200;
	void sum();
}
public class J implements I{

	@Override
	public void sum() {

		System.out.println(a+b);
	}
	public static void main(String[] args) {

		J j = new J();
		j.sum();
	}

}
