package Warmup1.com;

public class ParrotTrouble {
    public static boolean parrotTrouble(boolean talking, int hour){
        if (talking && (hour < 7 || hour > 20)){
            return true;
        } else if (talking && hour <= 7 && hour >= 20){
            return  false;
        } else if (!talking && hour > 7 && hour < 20){
            return false;
        } else if (!talking && hour <= 7 && hour >= 20){
            return true;
        } else {
            return false;
        }
    }
}
