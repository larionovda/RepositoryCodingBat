package Warmup1.com;

public class PosNeg {
    public static boolean posNeg(int a, int b, boolean negative) {
        if (a < 0 && b > 0 && !negative || a > 0 && b < 0 && !negative || a < 0 && b < 0 && negative){
            return true;
        } else {
            return false;
        }
    }
}
