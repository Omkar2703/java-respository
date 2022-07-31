import java.util.Scanner;
class multiplytable{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("\nEnter the number:");
int n = sc.nextInt();

for(int i=1; i<=12; i++){
int R = n * i;
System.out.printf("%d * %d = %d\n",n, i, R);
}
}
}