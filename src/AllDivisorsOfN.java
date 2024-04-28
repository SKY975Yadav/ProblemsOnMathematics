import javax.swing.*;

public class AllDivisorsOfN {
    public static void main(String[] args) {
        printAllDivisorsOfN(100);
    }
//    static void printAllDivisorsOfN(int n){ //not in order
//        for (int i =1;i*i<=n;i++){
//            if (n % i ==0){
//                System.out.print(i+" ");
//                if (i != n/i){
//                    System.out.print((n/i)+" ");
//                }
//            }
//        }
//    }
    // for in order traverse two times
    static void printAllDivisorsOfN(int n){
        int i;
        for (i = 1;i*i<=n;i++){
            if (n%i==0) System.out.print(i + " ");
        }
        while (i>1) {
            i--;
            if ( i!=n/i && n%i==0) System.out.print((n / i) + " ");
        }
    }
}
