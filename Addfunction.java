import java.util.Scanner;
class Main{
public int Add(int a, int b){
int sum = a + b;
return sum;
}
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the first number:");
int n1 = sc.nextInt();
System.out.println("Enter the second number:");
int n2 = sc.nextInt();
Main obj = new Main();
int result = obj.Add(n1, n2);
System.out.println("Sum is "+result);
}
}