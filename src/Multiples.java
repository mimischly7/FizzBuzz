public class Multiples {

    private static boolean validMultiple(int n) {
        return (n % 3 == 0) || (n % 5 ==0);
    }

    private static int MultiplesBefore(int n) {

        int counter = 0;

        for (int i = 1; i < n; i++) {
            if (validMultiple(i)) {
                counter++;
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        int number = 1000;
        System.out.println("The number of non-negative integers smaller than " +
                number + " that are divisible by either 3 or 5 is: " + MultiplesBefore(number));
    }
}
