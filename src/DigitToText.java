import java.util.Scanner;

public class DigitToText {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int digit = in.nextInt();
        switch (digit) {
            case 1:
                System.out.println("Раз");
                break;
            case 2:
                System.out.println("Два");
                break;
            case 3:
                System.out.println("Трыыыыы");
                break;
        }
    }
}
