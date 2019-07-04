package Warmup1.com;

public class startHi {
    public static boolean startHi(String str){
        if (str.length() < 2){
            return false;
        } else return "hi".equals(str.substring(0, 2));
    }
}
