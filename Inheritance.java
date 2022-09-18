class A 
{
	int a, b;
	void showab()
	{
		System.out.println("a and b: "+a + " "+b);
	}
}
class B extends A 
{
	int c;
	void showc()
	{
		System.out.println("c: "+c);
	}
	void sum()
	{
		int d = a + b + c;
		System.out.println("Sum is "+d);
	}	
}
class Inheritance
{
	public static void main(String x[])
	{
		A SuperObj = new A();
		B SubObj = new B();
		
		SuperObj.a = 10;
		SuperObj.b = 20;
		System.out.println("Contents in Superclass is...");
		SuperObj.showab();
		System.out.println();
		
		SubObj.a = 7;
		SubObj.b = 8;
		SubObj.c = 9;
		System.out.println("Contents in Subclass is.....");
		SubObj.showab();
		SubObj.showc();
		System.out.println();
		System.out.println("Sum is....");		
		SubObj.sum();
		System.out.println();
	}
}