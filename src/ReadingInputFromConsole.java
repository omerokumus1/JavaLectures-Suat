import java.util.Scanner;

public class ReadingInputFromConsole {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Reading input in a wrong way
//        System.out.println("Enter an integer: ");
//        int i = input.nextInt();
//        System.out.println("Enter a string: ");
//        String s = input.nextLine();

        // Reading input in a correct way - 1
//        System.out.println("Enter an integer: ");
//        int i = input.nextInt();
//        input.nextLine();
//        System.out.println("Enter a string: ");
//        String s = input.nextLine();
//
//
        // Reading input in a correct way - 2 (preferred)
//        System.out.println("Enter an integer: ");
//        int i = Integer.parseInt(input.nextLine());
//        System.out.println("Enter a double: ");
//        double d = Double.parseDouble(input.nextLine());
//        System.out.println("Enter a string: ");
//        String s = input.nextLine();


        // Reading character
//        System.out.println("Enter a character: ");
//        char c = input.nextLine().charAt(0);
//        System.out.println("Entered character: " + c);

        // Reading character in a secure way
//        System.out.println("Enter a character: ");
//        String str = input.nextLine();
//        char c;
//        if (str.length() != 1)
//            System.out.println("Wrong input.");
//
//        else {
//            c = str.charAt(0);
//            System.out.println("Entered character: " + c);
//        }

        // FX Framework

        // Reading input in one line
        // Ex; 5 4 3 2 [Enter]
        // Örn; Read 4 integers in one line
        System.out.print("Enter 4 integers in one line: ");
        int a, b, e, d;
        a = input.nextInt();
        b = input.nextInt();
        e = input.nextInt();
        d = input.nextInt();
        input.nextLine();
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("e: " + e);
        System.out.println("d: " + d);

    }
}
