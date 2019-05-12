package welcome.com;

public class ExceptionTestOne {
    public void countdown() throws ArithmeticException, InterruptedException {
        int i = 1;
        int n = 10;

            while (i <= 10) {
                int zero = 5/0;
                System.out.print(i + " ");
                i++;
                Thread.sleep(3000);
            }


        System.out.println();
        while (n >= 1) {
            System.out.print(n + " ");
            n--;
        }
    }
}
