class Time {
    int h, m, s;

    Time(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }

    void add(Time t2) {
        int totalSec = (h * 3600 + m * 60 + s) +
                       (t2.h * 3600 + t2.m * 60 + t2.s);

        int h = totalSec / 3600;
        int m = (totalSec % 3600) / 60;
        int s = totalSec % 60;

        System.out.println("Result: " + h + ":" + m + ":" + s);
    }
}
