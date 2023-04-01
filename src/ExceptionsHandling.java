//import java.util.*;
public class ExceptionsHandling {
    public static void main(String[] args){
       // Scanner sc = new Scanner(System.in);
       // System.out.println("Enter a number: ");try{
            /*int i=sc.nextInt();
            double result=1/i;
            System.out.println(3/0);
      }
        catch(ArithmeticException ae){
            System.out.println("Exception Handled");
        }
        catch(Exception e){
            System.out.println("Arithmetic Exception occured...!");
        }*/
        try {
            throw new UserDefinedExceptionHandling("Test EXception");
        }
        catch(Exception e){
            System.out.println("exception");
        }
    }
}
