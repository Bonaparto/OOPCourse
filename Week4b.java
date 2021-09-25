class Student{
	public String name;
	public String id;
	private double gpa;
	String specialty;

	Student(){}

	public double getGPA(){return gpa;}
	public void setGPA(double g){gpa = g;}

	static void changeNumber(int a){ // a = x = 5
		a = 10;
	}

	static void changeName(Student s){ // s = s1
		s.name = "Almas";
	}

}

public class Week4b{
	public static void main(String[] args) {
		Student s1 = new Student();
		//System.out.println(s1.name);
		//System.out.println(s1.specialty);
		//System.out.println(s1.gpa);
		//System.out.println(s1.getGPA());

		//double d = s1.getGPA();

		//s1.gpa = 4.0;
		s1.setGPA(3.5);
		//System.out.println(s1.gpa);
		//System.out.println(s1.getGPA());

		int x = 5;
		System.out.println(x);
		Student.changeNumber(x);
		System.out.println(x);

		System.out.println(s1.name);
		Student.changeName(s1);
		System.out.println(s1.name);
	}
}

/*
TASK-1: Add at least 2 more data fields with different access modifiers
TASK-2: Add at least 2 more methods with different access modifiers
TASK-3: Create a class University that includes Student as a data field (group of students, if possible)
*/