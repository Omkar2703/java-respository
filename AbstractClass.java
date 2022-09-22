import java.util.*;
/*"abstract" is the keyword, it is written when we call only method in superclass(Syntax: abstract method();) and implement in the subclass. */
/*Write class as well as method as abstract*/
abstract class Man{
    
    abstract void name();
}
class Boy extends Man{
    Scanner t = new Scanner(System.in);
    String name;
    void name(){
        
        System.out.println("Enter the name:");
        name=t.next();
        System.out.println("His name is "+name);
    }
}
class Man1{
    public static void main(String[] args) {
        Boy B = new Boy();
        /*making the object of that subclass which can access its superclass */
        B.name();
    }
}