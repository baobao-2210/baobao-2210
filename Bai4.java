import java.util.Scanner;

public class Bai4 {

    public static void main(String[] args) {
        
        try (Scanner Nhap = new Scanner(System.in)) {
            
            int tien, sthang;
            double lsuat, tongtien;

            System.out.println("Nhap so tien gui: ");
            tien = Nhap.nextInt();
            System.out.println("Nhap lai suat hang nam (vi du: 0.05 cho 5%): ");
            lsuat = Nhap.nextDouble();
            System.out.println("Nhap so thang gui tien: ");
            sthang = Nhap.nextInt();

            // Tính lãi suất cho số tháng gửi không phải là bội số của 12
            tongtien = tien * Math.pow((1 + lsuat / 12), sthang);

            System.out.printf("So tien lai nhan duoc la: %.2f%n", tongtien - tien);
            System.out.printf("Tong so tien nhan duoc la: %.2f%n", tongtien);
        }

    }
}
