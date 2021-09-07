import java.util.Scanner;

public class Passenger {
    private String _hoTen;
    private boolean _gioiTinh;
    private int _tuoi;
    private Ticket[] danhSachVe;

    public Passenger(String hoTen, boolean gioiTinh, int tuoi, Ticket[] danhSachVe) {
        this._hoTen = hoTen;
        this._gioiTinh = gioiTinh;
        this._tuoi = tuoi;
        this.danhSachVe = danhSachVe;
    }

    public Passenger() {
    }

    //Nhap vao 1 hanh khach
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho va ten: ");
        this._hoTen = sc.nextLine();
        System.out.print("Neu gioi tinh là nam nhap 'True', là nu nhap 'False': ");
        this._gioiTinh = sc.nextBoolean();
        System.out.print("Nhap tuoi: ");
        this._tuoi = sc.nextInt();
        System.out.print("So ve can mua");
        int soVe = sc.nextInt();
        Ticket[] tickets = new Ticket[soVe];
        for (int i = 0; i < soVe; i++) {
            System.out.println("Ticket " + (i + 1) + ":");
//            tickets[i] = new Ticket();// nên viết thanh static
            tickets[i].input();
        }
        this.danhSachVe = tickets;
    }

    //In 1 hanh khach va danh sach ve
    @Override
    public String toString() {
        String ouput = "";
        ouput += "Ho va ten: " + this._hoTen + "\tNam: " + this._gioiTinh +
                "\tTuoi: " + this._tuoi + "\t";
        for (int i = 0; i < this.danhSachVe.length; i++) {
            ouput += "\nVe " + (i + 1) + ": " + this.danhSachVe[i].toString();
        }
        return ouput;
    }

    //Tinh tong tien
    public double sumMoney() {//tinh tong tien
        double sum = 0;
        if (this.danhSachVe == null) {
            return 0;
        } else {
            for (int i = 0; i < this.danhSachVe.length; i++) {
                sum += danhSachVe[i].getGiaVe();
            }
        }
        return sum;
    }

    //Nhap danh sach hanh khach
    public static Passenger[] inputListPassenger(int n) {
        Passenger[] listPassengers = new Passenger[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Passenger " + (i + 1) + ": ");
            listPassengers[i] = new Passenger();
            listPassengers[i].input();
        }
        return listPassengers;
    }

    //In danh sach hanh khach
    public static void printListPassenger(Passenger[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.println("Passenger " + (i + 1));
            System.out.println(list[i].toString());
            System.out.println("So tien phai tra: " + list[i].sumMoney());
        }
    }

    //Sap xep theo tong tien giam dan
    public static Passenger[] sortDecsListPassenger(Passenger[] list) {
        for (int i = 0; i < list.length-1; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[j].sumMoney() > list[i].sumMoney()) {
                    Passenger tmp = list[i];
                    list[i] = list[j];// đổi luôn ô nhớ khi gán & k đổi giá trị

                    list[j] = tmp;
                }
            }
        }
        return list;
    }
}
