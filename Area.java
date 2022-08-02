import java.util.*;
class rectangle{
public static void main(String args[]){
Scanner t = new Scanner(System.in);
int i, length, breadth;
int n;
System.out.print("How many times do you want to calculate:");
n = t.nextInt();
for(i=1;i<=n;i++){
System.out.print("Enter the length:");
length = t.nextInt();
System.out.print("Enter the breadth:");
breadth = t.nextInt();
int a;
a= length * breadth;
System.out.println("Area is "+a);
}
}
}