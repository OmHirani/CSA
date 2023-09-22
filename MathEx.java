public class MathEx {
    public static void main(String [] args){
        System.out.println(swap(123));
        System.out.println(swap(791));
        System.out.println(swap(932));
        timeLeft(4, 34, 10, 59);
        timeLeft(1, 21, 9, 33);
        timeLeft(7, 02, 8, 14);
    }
    public static int swap(int initial){
        int hundreds = initial/100;
        int tens = ((initial%100)/10);
        int ones = ((initial%100%10));
        int answer = 100*hundreds + 10*ones + tens;

        return answer;
    }

    public static void timeLeft(int curHour, int curMin, int depHour, int depMin){
        int TimeLeft = (depHour*60 + depMin) - (curHour*60 + curMin);
        int Hour = TimeLeft/60;
        int Minute = TimeLeft%60;

        System.out.println(Hour +" hours and " + Minute + " minutes left");
    }
        

}

