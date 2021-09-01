import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        /*
          Nhập vào 1 danh sách n hành khách (n nhập từ bàn phím).
          Hiển thị danh sách hành khách và số tiền phải trả tương ứng của mỗi khách hàng.
          Sắp xếp danh sách hành khách theo chiều giảm dần của Tổng tiền.
          Hiển thị lại danh sách hành khách và số tiền phải trả tương ứng của mỗi khách hàng.*/

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so hanh khach: ");
        int soHK = sc.nextInt();
        //Nhap danh sach hanh khach
        Passenger[] listPassenger = Passenger.inputListPassenger(soHK);
        //Xuat danh sach hanh khach
        Passenger.printListPassenger(listPassenger);
        System.out.println("--------------------------\nSap xep theo gia ve giam dan");
        //Sắp xếp danh sach theo chieu giam dan tong tien
        Passenger[] sortDecsListPassenger =Passenger.sortDecsListPassenger(listPassenger);
        //Xuat lai danh sach hanh khach
        Passenger.printListPassenger(sortDecsListPassenger);

    }


}
