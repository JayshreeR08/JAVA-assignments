class Distance {
    int m, cm, mm;

    Distance(int m, int cm, int mm) {
        this.m = m;
        this.cm = cm;
        this.mm = mm;
    }

    void add(Distance d2) {
        int totalMM = (this.m * 1000 + this.cm * 10 + this.mm) +
                      (d2.m * 1000 + d2.cm * 10 + d2.mm);

        int m = totalMM / 1000;
        int cm = (totalMM % 1000) / 10;
        int mm = totalMM % 10;

        System.out.println("Result: " + m + "m " + cm + "cm " + mm + "mm");
    }
}

public class Main {
    public static void main(String[] args) {
        Distance d1 = new Distance(2, 30, 5);
        Distance d2 = new Distance(1, 50, 4);

        d1.add(d2);
    }
}
