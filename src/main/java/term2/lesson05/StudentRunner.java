package term2.lesson05;

import java.io.IOException;

public class StudentRunner {
    public static void main(String str[]) throws IOException {
        Student s1 = new Student();
        System.out.println(s1);

        Student s2 = new Student();
        System.out.println(s2);

        Student s3 = new Student();
        System.out.println(s3);

        Student s4 = new Student("Mrs.", "Dovi", 7, 3.4);
        System.out.println(s4);
    }
}
