package Liczby;

public class Liczby {
    public static void main(String[] args) {
        int n = 90;
        int last = 0;
        int first = 0;
        for (int i = 1; i < n; i++) {
            if (n % i != 0) {
                if (first == 0) {
                    first = i;
                }
                last = i;
            }
        }
        System.out.println(first);
        System.out.println(last);
    }
}
