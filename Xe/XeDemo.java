
package Xe;
import java.util.Scanner;
public class XeDemo {
    Scanner s=new Scanner(System.in);
    static Xe dsXe[];
    static int n;
    
    static void nhap(){
        System.out.print("nhập số lượng xe");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        s.nextLine();
        dsXe=new Xe[n];
        for (int i=0;i<n;i++){
            dsXe[i]=new Xe();
            dsXe[i].nhap();
        }
    }
    static void inDSXe(){
        Xe.xuatTieuDe();
        for (Xe x:dsXe)
        x.xuatDL();
    }
    public static void main(String[] args) {
        int chon;
        Scanner s=new Scanner(System.in);
        do {
            System.out.println("1.Nhap thong tin xe");
            System.out.println("2.Xuất bảng kê thuế trước bạn");
            System.out.println("3.Thoát" );
            System.out.println("Lựa chọn");
            chon=s.nextInt();
            switch (chon){
            case 1:
                nhap();
                break;
            case 2:
                inDSXe();
                break;
            case 3:
                System.exit(0);
            }
        } while (chon !=3);
 }
}
