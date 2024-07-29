import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Hello, World!");
        System.out.println("What is your name?");
        String name = in.nextLine();
        System.out.println("Hello, " + name);
        in.close();
    }
}
