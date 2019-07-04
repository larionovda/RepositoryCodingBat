package String2;

public class CountCode {
    public static int countCode(String str) {
        int count = 0;
        String countStr = "";
        char[] charStr = str.toCharArray();
        for (int i = 0; i < charStr.length; i++) {
            if ("co".equals(countStr)) {
                countStr += charStr[i];
            } else if (charStr[i] == 'c') {
                if ("c".equals(countStr) || countStr.length() == 3) {
                    continue;
                } else {
                    countStr += charStr[i];
                }
            } else if (charStr[i] == 'o') {
                if (countStr.length() == 3) {
                    countStr = "co";
                    continue;
                } else {
                    countStr += charStr[i];
                }
            } else if (countStr.length() == 3 && charStr[i] == 'e') {
                count++;
                countStr = "";
            } else if (countStr.length() == 3 && charStr[i] != 'e'){
                countStr = "";
            }
        }
        return count;
    }
}


//        int count = 0;
//        String countStr = "";
//        char[] charStr = str.toCharArray();
//        for (int i = 0; i < charStr.length; i++) {
//            try {
//                if (charStr[i] == 'c' && charStr[i + 1] == 'o' && charStr[i + 3] == 'e') {
//                    count++;
//                }
//            } catch (IndexOutOfBoundsException e) {
//                return count;
//            }
//        }
//        return count;