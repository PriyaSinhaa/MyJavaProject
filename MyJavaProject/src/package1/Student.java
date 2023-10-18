package package1;
//{}indicate this is the body of the class


public class Student { //pillar 1 is class creation 
 int a;
 
 public void display() //this is method name
 {
	 //boundary of the method 
	 System.out.println("Welcome to all of you guys ");
	 
 }
	public static void main(String[] args) //pillar 2
	{
	Student obj1=new Student(); //pillar 3
	obj1.display();//pillar 4
	obj1.a=233;//pillar 4 
	System.out.println("Value of a "+"is"+" "+obj1.a);
	
	}

}
