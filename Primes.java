/** Основной класс */
public class Primes {

    /** Основной метод */
    public static void main(String[] args) {
        /** Цикл, внутри которого проверяются натуральные числа от 2 до 100 на простоту */
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i))
                System.out.println(i);
        }
    }

    /** Метод, озволяющий проверить, является ли число простым */
    public static boolean isPrime(int n) {
        if (n <= 2)
            return true;
        int flag = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                flag += 1;
        }
        if (flag == 2)
            return true;
        else
            return false;
    }
}