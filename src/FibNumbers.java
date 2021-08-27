public class FibNumbers {
    public static void main(String[] args) {
        FibNumbers fibNumbers = new FibNumbers();
        fibNumbers.fib(100);
    }

    public void fib(int n) {
        int a = 1;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        int c = 0;
        while (c < n) {
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }
    }
}
