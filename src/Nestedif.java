import java.util.*;
public class Nestedif {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        if(n>10){
            if(n%2==0){
                if(n%3==1){
                    System.out.println("i love my family");
                }
                /*else{
                    System.out.println("i hate my family");
                }*/
            }
            /*else{
                System.out.println("i love my self");
            }*/
        }
        /*else{
            System.out.println("i love u");
        }*/
    }
}
