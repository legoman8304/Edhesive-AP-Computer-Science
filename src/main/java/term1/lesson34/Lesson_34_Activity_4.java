package term1.lesson34;

/**
 * Lesson 34 Coding Activity 4
 *
 * For the Lesson 34 activities, you will be asked to write one or more methods.
 * Use the template to write a main method that tests each of your methods,
 * then paste everything into the code runner box. Your submission should
 * begin with the first import statement and end with the final }.
 *
 * Write a method that takes an array of ints
 * and returns the smallest value in the array.
 *
 * public static int findMin(int [] a)
 */

@SuppressWarnings("ALL")
class Lesson_34_Activity_4 {

    public static int findMin(int... ints) {
        int min = ints[0];
        for (int i : ints) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println(findMin(1, 2, 3, 4, 5, 6, 7));
        System.out.println(findMin(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    }
}
