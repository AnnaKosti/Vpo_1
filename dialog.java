import java.util.Scanner;

public class dialog {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        int age;

        System.out.println(x:"Hello");
        System.out.println(x:"What's your name?");
        name = scanner.nextLine();
        System.out.println(x:"How old are you?");
        age = scanner.nextInt();

         System.out.println(x:"Nice to meet you, " + name "!");
          System.out.println(x:"I know, you're " + age);
    }
}