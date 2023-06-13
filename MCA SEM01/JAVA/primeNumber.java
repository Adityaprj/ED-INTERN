public class primeNumber{
    public static void main(String[] args) {
        int count = 0;

        for (int number = 2; number < 10; number++) {
            if (Primeno(number)) {
                System.out.println(number + " is a prime number.");
                count++;
            }
        }

        System.out.println("Total prime numbers: " + count);
    }

    public static boolean Primeno(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
