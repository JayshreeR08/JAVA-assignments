import java.util.*;

class ArrayOps {
    int[] arr = new int[5];

    void input() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
    }

    void output() {
        for (int i : arr)
            System.out.print(i + " ");
    }

    void reverse() {
        for (int i = arr.length - 1; i >= 0; i--)
            System.out.print(arr[i] + " ");
    }
}
