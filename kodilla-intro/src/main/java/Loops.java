public class Loops {
    public static void main(String[] args) {
        /* FOR loop */

        /* counter */
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        /* printing names */
        String[] names = new String[] {
                "Zygfryd",
                "Gwidon",
                "Florentyna"
        };

        int namesLength = names.length;

        for (int i=0; i<namesLength; i++){
            System.out.println(names[i]);
        }

        /* print sum of numbers in array*/
        int[] numbers = new int[] {
                1,
                2,
                3
        };

        System.out.println(sumAllArrayElements(numbers));

        /* WHILE loop */

        /* counter */
        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    private static int sumAllArrayElements(int[] arrayOfNumbers) {
        int sumOfElements = 0;
        int arrayLength = arrayOfNumbers.length;

        for (int i=0; i<arrayLength; i++){
            sumOfElements += arrayOfNumbers[i];
        }

        return sumOfElements;
    }
}
