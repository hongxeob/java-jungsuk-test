package practice.EX7;

class Time {
    private int hour;
    private int minute;
    private int second;

    public void setHour(int hour) {
        if (isNotValidHour(hour)) {
            return;
        }
        this.hour = hour;
    }

    private static boolean isNotValidHour(int hour) {
        return hour < 0 || hour > 23;
    }

    public int getHour() {
        return hour;
    }
}

public class TimeTest {
    public static void main(String[] args) {
        Time t = new Time();
        t.setHour(22);
        System.out.println(t.getHour());

    }
}
