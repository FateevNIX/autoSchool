package welcome.com;

public class TypeConversion {

    public void divideNumbers(int q, int w) {
        int digit = q / w;
        int remainder = q % w;
        System.out.println("Result of the division is: " + digit + ". Remainder from the division is: " + remainder);
    }

    public void sumOfDigits(int n) {
        int sum = 0;
        int m = n;
      for (; m > 0; m/=10 ){
          sum += m % 10;
        }
        System.out.println("Sum of digits in number: " + n + ", are: " + sum);
    }

    public void numberRounding(double d){
    int x = (int)(d + 0.5);
    System.out.println("Result of rounding is: " + x);
}
}
