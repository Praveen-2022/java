public class Advpatterns {
    // butterfly patterns 
    //   *             *
    //   * *         * *
    //   * * *     * * *
    //   * * * * * * * *
    //   * * * * * * * *
    //   * * *     * * *
    //   * *         * *
    //   *             *

//     public static void main(String args[]){
//         int n =5;
//         // upper half 
//    for (int i=1;i<=n;i++){
//     // 1st part
//     for( int j=1; j<=i;j++){
//         System.out.print("* ");
//     }
//     // Spaces
//     int spaces = 2 * (n-i);
//     for(int j=1; j<=spaces;j++){
//         System.out.print("  ");
//     }
//     //2nd part
//     for(int j=1;j<=i;j++){
//         System.out.print("* ");
//     }
//     System.out.println();
//    }

// //    // lower half

//    for (int i=n;i>=1;i--){
//     // 1st part
//     for( int j=1; j<=i;j++){
//         System.out.print("* ");
//     }
//     // Spaces
//     int spaces = 2 * (n-i);
//     for(int j=1; j<=spaces;j++){
//         System.out.print("  ");
//     }
//     //2nd part
//     for(int j=1;j<=i;j++){
//         System.out.print("* ");
//     }
//     System.out.println();
//    }
// }
//     * * * * *
//    * * * * *
//   * * * * *
//  * * * * *
// * * * * *
//   public static void main (String args[]){
//     int n=5;
//     for(int i=1; i<=n;i++){
//         // for spaces
//         for(int j=1; j<=n-i;j++){
//             System.out.print(" ");
//         }
//         // for *'s'
//         for(int j=1;j<=5;j++){
//             System.out.print("*");
//         }
// // for next line
//         System.out.println();
//     }
//   }

//  public static void main(String args[]){
//     //     1
//     //    2 2
//     //   3 3 3 
//     //  4 4 4 4
//     // 5 5 5 5 5

//     int n=5;
//     for(int i=1;i<=5;i++){
//         // for spacs
//         for(int j=1;j<=n-i;j++){
//             System.out.print(" ");
//         }
//         for(int j=1;j<=i;j++){
//             System.out.print(i + " ");
//         }
//         System.out.println();
//     }
//  }

//palindromic pyramid
//         1
//       2 1 2 
//     3 2 1 2 3
//   4 3 2 1 2 3 4 
// 5 4 3 2 1 2 3 4 5

// tough pattern
// public static void main(String args[]){
//     int n=5;

//     for(int i=1;i<=n;i++){

//         // for spaces
//         for(int j=1;j<=n-i;j++){
//             System.out.print(" ");
//          }
//          // for 1st half numbers
//         for(int j=i;j>=1;j--){
//             System.out.print(j);
//         }
//         // for second half number
//        for(int j=2;j<=i;j++){
//         System.out.print(j);
//        }
//        // for next line
//        System.out.println();
//     }
// }


// diamond pattern
//        *
//      * * *
//    * * * * *
//  * * * * * * * 
//  * * * * * * *
//    * * * * *
//      * * *
//        *
public static void main(String args[]){
  int n=4;
  // for upper half
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
    }
         for(int j=1;j<=2*i-1;j++){
              System.out.print("*");
      }
         System.out.println();
    }
    // for lower half

    for(int i=n;i>=1;i--){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
    }
         for(int j=1;j<=2*i-1;j++){
              System.out.print("*");
      }
         System.out.println();
    }
  }
}
