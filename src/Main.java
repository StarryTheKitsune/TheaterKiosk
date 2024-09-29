import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        int age = 0;

        System.out.println("Please enter your age: ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        if (age >= 21) {
            System.out.println("You get a paper wristband!");
        }
    }
}