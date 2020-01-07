import java.util.Scanner;
class Lesson_17_Activity_One {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
            int count = 0;
            double total = 0;
            while (true) {
                int i = scanner.nextInt();
                if (i == -1) {
                    break;
                }
                count += 1;
                total += i;
            }
            System.out.println("The average is: " + (count == 0 ? "undefined" : total / count));
        }
    }