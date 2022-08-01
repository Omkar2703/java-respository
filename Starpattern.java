import java.util.Scanner;
class Main{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of rows:");
int r = sc.nextInt();
int i, j;
for(i=1;i<=r;i++){
for(j=1;j<=i;j++){
System.out.print("* ");
}
System.out.println( );
}
}
}