import java.util.*;
class rectangle{
int length, breadth;
void accept()
{
Scanner t = new Scanner(System.in);
System.out.print("Enter the length of the rectangle:");
length = t.nextInt();
System.out.print("Enter the breadth of the rectangle:");
breadth = t.nextInt();
}
void area()
{
int a;
a = length*breadth;
System.out.println("Area is "+a);
}
}
class rectangle1{
public static void main(String args[]){
rectangle r1 = new rectangle();
rectangle r2 = new rectangle();
r1.accept();
r1.area();
r2.accept();
r2.area();
}
}