package Warmup1.com;

public class StringE {
    public static boolean stringE(String str){
        char[] charArray = str.toCharArray();
        int temp = 0;
        char e = 'e';

        for (char c : charArray) {
            if (e == c) {
                temp++;
            }
        }

        return temp >= 1 && temp <= 3;
    }
}
