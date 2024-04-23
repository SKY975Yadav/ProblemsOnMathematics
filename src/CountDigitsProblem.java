
public class CountDigitsProblem {
    public static void main(String[] args) {
        System.out.println(countDigits(3012));
    }
//    static int countDigits(int num){//using iterative ,TC: O(digits), ASC : O(1)
//        int res = 0;
//        while(num > 0){
//            num = num/10;
//            res++;
//        }
//        return res;
//    }
    static int countDigits(int num){ //Using Recursion , TC: O(digits), ASC : O(digits)
        if (num<10) return 1;
        return 1 + countDigits(num/10);
    }
}
