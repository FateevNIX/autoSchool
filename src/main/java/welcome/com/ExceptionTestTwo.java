package welcome.com;

public class ExceptionTestTwo {
    public void countdown() {
        int i = 1;
        int n = 10;
        try {
            while (i <= 10) {
                int zero = 5/0;
                System.out.print(i + " ");
                i++;
                Thread.sleep(3000);
            }

        }
        catch( ArithmeticException ex ) {
            System.out.println("You shall not fall!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println();
                while (n >= 1) {
                    System.out.print(n + " ");
                    n--;
                }
            }
        }

