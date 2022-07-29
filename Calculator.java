import java.util.Scanner;

class Main {
  public static void main(String[] args){
    int i;
    char operator;
    float a, b, result;

    Scanner input = new Scanner(System.in);
    System.out.println("\n");
    System.out.println("How many times you would like to do calculations?");
    int n = input.nextInt();
    for(i=0;i<n;i++)
{
    System.out.println("Choose an operator: +, -, *, or /");
    operator = input.next().charAt(0);

    System.out.println("Enter first number");
    a = input.nextFloat();

    System.out.println("Enter second number");
    b = input.nextFloat();
    

    switch (operator) {


      case '+':
        result = a + b;
        System.out.println(a + " + " + b + " = " + result);
        break;

      case '-':
        result = a - b;
        System.out.println(a + " - " + b + " = " + result);
        break;

      case '*':
        result = a * b;
        System.out.println(a + " * " + b + " = " + result);
        break;


      case '/':
        result = a / b;
        System.out.println(a + " / " + b + " = " + result);
        break;

      default:
        System.out.println("Invalid operator!");
        break;
    }
     System.out.println("\n");
}
    input.close();
  }
}