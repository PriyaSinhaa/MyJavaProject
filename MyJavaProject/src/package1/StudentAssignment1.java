package package1;

public class StudentAssignment1 {

	int rollNo,age;
	
	void display1()
	{
		System.out.println("Welcome to all of you");
	}
	void display2()
	{
		System.out.println("Automation is very easy");
	}
	public static void main(String[] args)
	{
		//object creation
		StudentAssignment1 obj123=new StudentAssignment1();
		obj123.rollNo=28;
		obj123.age=16;
		System.out.println("Rollno="+obj123.rollNo);
		System.out.println("Age="+obj123.age);
		obj123.display1();
		obj123.display2();
			
	}

}
