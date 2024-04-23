import java.math.BigDecimal;
import java.util.Objects;

public class FactorialOfN_Problem {
    public static void main(String[] args) {
        System.out.println(factorialOfN(65500));
    }
//    static long factorialOfN(int n){//Using Recursive   for return type int 0<n<17 and for long : 0<n<21, TC : O(n) , SC : O(n)
//        if (n==1) return 1;
//        return n* factorialOfN(n-1);
//    }
//    static BigDecimal factorialOfN(int n){ // For range 0<n<11490 , for big number it will through stack overflow runtime error, TC : O(n) , SC : O(n)
//        if (n==1) return new BigDecimal(1);
//        return new BigDecimal(n).multiply(factorialOfN(n-1));
//    }

//    static int factorialOfN(int n){ //TC : O(n) , SC : O(1)
//        int res = 1;
//        for (int i =2;i<=n;i++){
//            res = res*i;
//        }
//        return res;
//    }
    static BigDecimal factorialOfN(int n){ //TC : O(n) , SC : O(1), For up to Integer.MAX_VALUE
        BigDecimal res = new BigDecimal(1);
        for (int i =2;i<=n;i++){
            res = res.multiply(new BigDecimal(i));
        }
        return res;
    }


}