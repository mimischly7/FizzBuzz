public class Reduce {
    private static int stepsToZero(int n) {
        int numSteps = 0;

        while (n > 0) {

            numSteps++;

            if (n % 2 == 0) {
                n = n / 2;
            }
            else {
                n--;
            }

        }

        return numSteps;
    }

    public static void main(String[] args) {
        System.out.println(stepsToZero(100));
    }
}
