import java.util.*;
class Human
{
	int age;
	String name;
	void accept()
	{
		Scanner t = new Scanner(System.in);
		System.out.print("\nEnter the name:");
		name=t.next();
		System.out.print("\nEnter the age:");
		age=t.nextInt();
		
	}
	void display()
	{
		System.out.println("Name: "+name +"\n"+"Age= "+age);
	}
}
class Student extends Human
{
	Scanner t = new Scanner(System.in);
	String Institute, field;
	void accept()
	{
	super.accept();
	
	System.out.print("\nEnter the Institute name:");
	Institute=t.next();
	System.out.print("\nEnter the Field:");
	field=t.next();
	}
	
	void display()
	{
		super.display();
		System.out.println("Institute name: "+Institute +"\n"+"Field= "+field);
	}
	
}
class Worker extends Human
{
	Scanner t = new Scanner(System.in);
	Double salary;
	void accept()
	{
	super.accept();
	
	System.out.print("\nEnter the Salary:");
	salary=t.nextDouble();
	}
	
	void display()
	{
		super.display();
		System.out.println("\nSalary: "+salary);
	}
}

class Human1
{
	public static void main(String x[])
	{
		Student A = new Student();
		Worker B = new Worker();
		A.accept();
		A.display();
		B.accept();
		B.display();
	}
}