import java.util.*;
class Person{
    Scanner t = new Scanner(System.in);
    int id;
    String name;
    Person(){
        System.out.print("Enter the name:");
        name=t.next();
        System.out.print("Enter the ID:");
        id=t.nextInt();
    }
    void display(){
        System.out.println("\nName is "+name+"\n"+"ID is "+id);
    }
}
class Account extends Person{
    Scanner t = new Scanner(System.in);
    int acc_no;
    Account(){
        System.out.print("Enter the account number:");
        acc_no=t.nextInt();
    }
    void display(){
        super.display();
        System.out.println("Account number is "+acc_no);
    }
}
class Customer extends Account{
    Scanner t = new Scanner(System.in);
    long balance;
    Customer(){
        System.out.print("Enter the balance:");
        balance=t.nextLong();
    }
    void display(){
        super.display();
        System.out.println("Balance is "+balance);
    }
}
class Person1{
    public static void main(String x[]) {
        Customer C = new Customer();
        System.out.println("\nDetails are.....\n");
        C.display();
    }
}
