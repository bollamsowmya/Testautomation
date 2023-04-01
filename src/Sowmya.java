
import java.util.*;
public class Sowmya {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int n=sc.nextInt();
       if(n>5){
           System.out.println("Hello world");
       }
       else{
           System.out.println("Good evening");
       }
       int age=sc.nextInt();
       if(age<=10){
           System.out.println("child");
       }
       else if(age>=11 && age<=19){
           System.out.println("teen age");
       }
       else{
           System.out.println("man");
       }
    }
}
