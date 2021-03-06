package term1.lesson33;

/**
 * Lesson 33 Coding Activity 5
 *
 * For the Lesson 33 activities, you will be asked to write one or more methods.
 * Use the template to write a main method that tests each of your methods,
 * then paste everything into the code runner box. Your submission should
 * begin with the first import statement and end with the final }.
 *
 * For questions 2-5, you may want to start with the printIt method
 * and use it to test the other three.
 *
 * Write a method that takes an array of ints, an integer value,
 * and an integer index.The method should insert the value at the given
 * index and move the values afterwards by one.
 *
 * This method must be called insertValue() and must have the following
 * parameter types: int[], integer, integer.
 *
 * Calling insertValue(a, 100, 2) would change the array {1, 2, 3, 4, 5}
 * to {1, 2, 100, 3, 4}.
 */

@SuppressWarnings("ALL")
class Lesson_33_Activity_5 {

    static void insertValue(int[] ints, int value, int index) {
        for (int i = ints.length - 1; i > index; --i) {
            ints[i] = ints[i - 1];
        }
        ints[index] = value;
    }

    private static void printIt(int... ints) {
        for (int i = 0; i < ints.length; ++i) {
            System.out.print(ints[i] + (i == ints.length - 1 ? "\n" : " "));
        }
    }

    private static void testIt(int value, int index, int...ints) {
        printIt(ints);
        insertValue(ints, value, index);
        printIt(ints);
    }

    public static void main(String[] args) {
        testIt(100, 0, 1, 2, 3, 4, 5);
        testIt(100, 1, 1, 2, 3, 4, 5);
        testIt(100, 2, 1, 2, 3, 4, 5);
        testIt(100, 3, 1, 2, 3, 4, 5);
        testIt(100, 4, 1, 2, 3, 4, 5);
    }
}
