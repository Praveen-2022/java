import java.util.*;

public class Functions{

//     public static void printMyName(String name){
//         System.out.println("your enterd name is " + name);
//         return;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//          String name = sc.next();

//          printMyName(name);
//     }

// find factorial number

public static void findFactorial(int n){
       if(n<1){
          System.out.print("invalid input number");
          return;
        }
        int factorial=1;
        for(int i=n; i>=1;i--){
            factorial = factorial*i;
        }
     System.out.println(factorial);
     return;
        }  
      public static void main(String args[]){
           Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();

    findFactorial(n);    
} 
}