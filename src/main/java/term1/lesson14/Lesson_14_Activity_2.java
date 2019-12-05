import java.util.Scanner;

class Main {
    public static void main(String[] args)
     {
     Scanner scan = new Scanner(System.in);
     
     System.out.println("Input two integers");
     int x = scan.nextInt();
     int y = scan.nextInt();
     
     if (x>=0 && y>=0)
      System.out.println("Both are positive or zero.");
    else
      System.out.println("One or both are negative.");
     
     
    }
}
