package Warmup1.com;

public class EveryNth {
    public static String everyNth(String str, int n){
        String str2 = "";
        str2 += str.charAt(0);
        for (int i = n; i < str.length(); i += n){
            str2 += str.charAt(i);
        }
        return str2;
    }
}
