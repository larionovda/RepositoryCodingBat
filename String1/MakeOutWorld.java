package String1;

public class MakeOutWorld {
    public static String makeOutWord(String out, String word){
        String outCut = out.substring(0,2);
        outCut += word += out.substring(2);;
        return outCut;
    }
}
