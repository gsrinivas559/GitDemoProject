package Assignments;

public class ComputerTeacher extends Teacher{

	public static void main(String[] args) {

		Teacher t = new Teacher();
		System.out.println(t.designation);
		System.out.println(t.collegeName);
		t.does();
	}

}
