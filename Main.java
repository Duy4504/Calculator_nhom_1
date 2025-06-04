import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số a: ");
        int a = sc.nextInt();
        System.out.print("Nhập số b: ");
        int b = sc.nextInt();

        Calculator calc = new Calculator();

        System.out.println("Cộng: " + calc.cong(a, b));
        System.out.println("Trừ: " + calc.tru(a, b));
        System.out.println("Nhân: " + calc.nhan(a, b));
        System.out.println("Chia: " + calc.chia(a, b));
    }
}
