import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose a number between 1 and 4:");
        int choice = sc.nextInt();

        switch(choice) {
            case 1:
                System.out.println("You selected Option 1");
                break;

            case 2:
                System.out.println("You selected Option 2");
                break;

            case 3:
                System.out.println("You selected Option 3");
                break;

            case 4:
                System.out.println("You selected Option 4");
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}