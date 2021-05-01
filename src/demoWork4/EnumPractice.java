package demoWork4;

public class EnumPractice {
    public static void main(String[] args) {

        String str ="Friday";
        enamweek w1 =new enamweek(EnamDays.valueOf(str));
        w1.game();
    }
}
