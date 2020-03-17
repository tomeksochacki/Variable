import java.util.Scanner;

public class Variable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter to variable 1:");
        int variable1 = scanner.nextInt();
        System.out.println("Enter to variable 2:");
        int variable2 = scanner.nextInt();
        System.out.println("Enter to variable 3:");
        int variable3 = scanner.nextInt();

        if (variable1 < variable2 && variable1 < variable3) {
            System.out.println("Least variable is:" + variable1);
        }
        if (variable2 < variable1 && variable2 < variable3) {
            System.out.println("Least variable is:" + variable2);
        }
        if (variable3 < variable2 && variable3 < variable1) {
            System.out.println("Least variable is:" + variable3);
        }
    }
}
