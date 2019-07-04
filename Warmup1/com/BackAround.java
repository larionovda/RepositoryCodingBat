package Warmup1.com;

public class BackAround {
    public static String backAround(String str){
        String newString = str.substring(str.length() - 1);
        newString += str += str.substring(str.length() - 1);
        return newString;
    }
}
