import java.time.LocalDateTime;
import java.util.Scanner;

public class Ticket {
    private String tenChuyen;
    private int giaVe;
    private LocalDateTime ngayBay;


    public Ticket(String tenChuyen, int giaVe, LocalDateTime ngayBay) {
        this.tenChuyen = tenChuyen;
        this.giaVe = giaVe;
        this.ngayBay = ngayBay;
    }

    public Ticket() {
    }

    //Nhap thong tin 1 ve
    public static void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten chuyen: ");
        String tenChuyen = sc.nextLine();
        System.out.print("Nhap gia ve: ");
        int giaVe = sc.nextInt();

        System.out.print("----Nhap ngay bay---- \nNhap nam:");
        int year = sc.nextInt();
        System.out.print("Nhap thang: ");
        int month = sc.nextInt();
        System.out.print("Nhap ngay: ");
        int day = sc.nextInt();
        System.out.print("Nhap gio bay: ");
        int hour = sc.nextInt();
        System.out.print("Nhap phut: ");
        int minu = sc.nextInt();

        LocalDateTime ngayBay = LocalDateTime.of(year, month, day, hour, minu);
        Ticket tk = new Ticket(tenChuyen, giaVe, ngayBay);
    }

    //in ra thong tin 1 ve
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Ticket{");
        sb.append("tenChuyen='").append(tenChuyen).append('\'');
        sb.append(", giaVe=").append(giaVe);
        sb.append(", ngayBay=").append(ngayBay);
        sb.append('}');
        return sb.toString();
    }

    //lay gia ve
    public int getGiaVe() {
        return giaVe;
    }
}
