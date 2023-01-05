package Assignments;

public class StudentMain {

	public static void main(String[] args) {

		Student stu1 = new Student();
		Student stu2 = new Student();
		
		stu1.getStuData(0, "Srinivas");
		stu1.getStuMarks(10, 20, 30);
		stu1.totalMarks();
		
		stu2.getStuData(1, "Venkatesh");
		stu2.getStuMarks(50, 70, 90);
		stu2.totalMarks();
	}

}
