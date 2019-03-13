package welcome.com;

public class TypeConversion {

    public void divideNumbers(int q, int w) { //В переменных q и w хранятся два натуральных числа. Создайте программу, выводящую на экран результат деления q на w с остатком. Пример вывода программы (для случая, когда в q хранится 21, а в w хранится 8): 21 / 8 = 2 и 5 в остатке
        int digit = q / w;
        int remainder = q % w;
        System.out.println("Result of the division is: " + digit + ". Remainder from the division is: " + remainder);
    }

    public void sumOfDigits(int n) { //В переменной n хранится натуральное двузначное число. Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n.
        int sum = 0;
        int m = n;
      for (; m > 0; m/=10 ){
          sum += m % 10;
        }
        System.out.println("Sum of digits in number: " + n + ", are: " + sum);
    }

    public void numberRounding(double n){ //В переменной n хранится вещественное число с ненулевой дробной частью. Создайте программу, округляющую число n до ближайшего целого и выводящую результат на экран.
    int x = (int)(n + 0.5);
    System.out.println("Result of rounding is: " + x);
}
}
