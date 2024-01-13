import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduceti cuvantul: ");
        String a = in.nextLine();
        String org_a = a;

        String rev = "";

        for (int i = a.length() - 1; i >= 0; i--) {
            rev = rev + a.charAt(i);
        }

        if (org_a.equals(rev)) {
            System.out.println("Cuvantul introdus este palindrom");
        } else {
            System.out.println("Cuvantul introdus nu este palindrom");
        }
    }
}