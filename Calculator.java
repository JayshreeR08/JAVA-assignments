class Calculator {
    int a, b;

    Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void add() {
        System.out.println("Addition: " + (a + b));
    }

    void sub() {
        System.out.println("Subtraction: " + (a - b));
    }

    void mul() {
        System.out.println("Multiplication: " + (a * b));
    }

    void div() {
        if (b != 0)
            System.out.println("Division: " + (a / b));
        else
            System.out.println("Division by zero not allowed");
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator(10, 5);
        c.add();
        c.sub();
        c.mul();
        c.div();
    }
}
