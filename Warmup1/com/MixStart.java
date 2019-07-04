package Warmup1.com;

public class MixStart {
    public static boolean mixStart(String str){
        if(str.length() < 3){
            return false;
        } else if ("ix".equals(str.substring(1,3))) {
            return true;
        } else {
            return false;
        }
    }
}
