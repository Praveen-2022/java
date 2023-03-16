// if,else 
// else if
// else

// switch




import java.util.*;

public class conditions {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        // if(button == 1){
        //     System.out.println("Hello Brother");
        // }else if(button ==2){
        //     System.out.println("Hello Praveen");
        // }else if(button == 3){
        //     System.out.println("I am Mad ");
        // }else{
        //     System.out.println("invalid key");
        // }
       

        switch(button){
            case 1 : System.out.println("1st button onn");
            break;
            case 2 : System.out.println("2nd button onn");
            break;
            case 3 : System.out.println("3rd button onn");
            break;
            case 4 : System.out.println("4th button onn");
            break;
            default : System.out.println("invalid button");
        }
   

    }
}
