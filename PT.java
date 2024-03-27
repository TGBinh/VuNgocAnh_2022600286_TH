
package PTb2;
import java.util.Scanner;
public class PT {

    private double a;
    private double b;
    private double c;
    private double delta;
    private double x1;
    private double x2;
    
    public void tinhDelta() {
        delta = b * b - 4 * a * c;
    }
    public PT(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        tinhDelta();
        giaiPhuongTrinh();
    }
    public void giaiPhuongTrinh() {
    if (a == 0) {
        if (b == 0) {
            if (c == 0) {
                System.out.println("Phương trình vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        } else {
            x1 = x2 = -c / b;
        }
    } else {
        if (delta < 0) {
            System.out.println("PT vo nghiem");
        } else if (delta == 0) {
            x1 = x2 = -b / (2 * a);
        } else {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
        }
        }
    }
    public void inThongTin() {
        System.out.printf("%-5s%-10s%-10s%-10s%-10s%-10s%-10s\n", "STT", "a", "b", "c", "Delta", "Nghiệm 1", "Nghiệm 2");
        System.out.printf("%-5d%-10.2f%-10.2f%-10.2f%-10.2f%-10.2f%-10.2f\n", 1, a, b, c, delta, x1, x2);
    }
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phương trình: ");
        n = scanner.nextInt();

        PT[] phuongTrinhs = new PT[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập hệ số a, b, c của phương trình thứ %d: ", i + 1);
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double c = scanner.nextDouble();
            phuongTrinhs[i] = new PT(a, b, c);
        }
        
        System.out.println("\n---------------------------------------------------------");
        System.out.printf("%-5s%-10s%-10s%-10s%-10s%-10s%-10s\n", "STT", "a", "b", "c", "Delta", "Nghiệm 1", "Nghiệm 2");
        for (int i = 0; i < n; i++) {
            phuongTrinhs[i].inThongTin();
        }
    }
}

