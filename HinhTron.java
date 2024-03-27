
package HinhTron;
import java.util.Scanner;
public class HinhTron {

    private double banKinh;
    public HinhTron(double banKinh) {
        this.banKinh = banKinh;
    }
    public double tinhChuVi() {
        return (2 * Math.PI * banKinh);
    }

    public double tinhDienTich() {
        return (Math.PI * banKinh * banKinh);
    }
    public static void inTieuDe(){
        System.out.printf("%-5s%-10s%-10s%-10s\n", "STT", "Bán kính", "Chu vi", "Diện tích");

    }
    public void inThongTin() {
        System.out.printf("%-5d%-10.2f%-10.5f%-10.5f\n", 1, banKinh, tinhChuVi(), tinhDienTich());
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        System.out.print("Nhập số lượng hình tròn: ");
        n = scanner.nextInt();

        HinhTron[] hinhTrons = new HinhTron[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập bán kính hình tròn thứ %d: ", i + 1);
            double banKinh = scanner.nextDouble();
            hinhTrons[i] = new HinhTron(banKinh);
        }
        HinhTron.inTieuDe();
        for (int i = 0; i < n; i++) {
            hinhTrons[i].inThongTin();
        }
    }
}

