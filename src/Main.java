public class Main {

    private static String str = "StarTrooper";

    public static void main(String[] args) {

        fibonacci(8);
    }

    /**
     * should have rename given to numberOfFabonacciSequence
     **/
    static void fibonacci(int numberOfFabonacciSequence) {
        /**
         *notes from JPMC interview
         *ppn = pn
         *pn = currentNumer;
         *currentnumber = ppn + pn
         **/
        /**
         * have last and the current number be printed
         * because they are at the start of the sequence
         */
            //First Number          Second Number       CurrentNumber
        int previousPreviousNumber, previousNumber = 0, currentNumber = 1;

        System.out.println(previousNumber);
        System.out.println(currentNumber);
        for (int j = 1; j <= numberOfFabonacciSequence; j++) {
            previousPreviousNumber = previousNumber;

            previousNumber = currentNumber;

            currentNumber = previousPreviousNumber + previousNumber;

            System.out.println(currentNumber);
        }
        //System.out.println(Math.pow((1+ 5 % 2),numberOfFabonacciSequence));
    }
}
