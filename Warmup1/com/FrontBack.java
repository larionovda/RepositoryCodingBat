package Warmup1.com;

public class FrontBack {
    public static String fondBack(String str) {
        String str2 = "";
        if (str.length() == 1) {
            return str;
        } else if (str.length() == 2){
            str2 += str.charAt(str.length() - 1);
            str2 += str.charAt(0);
        } else {
            str2 += str.charAt(str.length() - 1);
            str2 += str.substring(1, str.length() - 1);
            str2 += str.charAt(0);
        }
        return str2;
    }
}
