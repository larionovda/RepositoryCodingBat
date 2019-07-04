package Logic1;

public class CaughtSpeeding {
    public static int caughtSpeeding(int speed, boolean isBirthday) {
        int sale = 0;
        if (isBirthday){
            sale = 5;
        }
        if (speed <= 60 + sale) {
            return 0;
        } else if (speed <= 80 + sale) {
            return 1;
        } else {
            return 2;
        }
    }
}
