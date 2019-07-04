package Warmup1.com;

public class MissingChar {
    public static String missingChar(String str, int n){
        String newS;
        newS = str.substring(0, n);
        newS += str.substring(n + 1);
        return newS;
    }
}
