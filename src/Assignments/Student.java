package Assignments;

public class Student {

	int SID, Sub1, Sub2, Sub3;
	String Sname;
	
	public void getStuData(int id, String name) {
		SID = id;
		Sname = name;
	}
	
	public void getStuMarks(int sub1, int sub2, int sub3) {
		Sub1 = sub1;
		Sub2 = sub2;
		Sub3 = sub3;
	}
	
	public void totalMarks() {
		int sum = 0;
		sum = Sub1 + Sub2 + Sub3;
		System.out.println("The Student "+Sname+" with "+SID+" have scored total marks: " +sum);
	}
	
}
