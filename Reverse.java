import java.util.Scanner;
class Main{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number:");
int n = sc.nextInt();
System.out.println("You Entered "+n);
int r = 0;
while(n!=0)
{
int d = n%10;
r = r * 10 + d;
n = n / 10;
}
System.out.println("Reverse of the number is " + r); 
}
}