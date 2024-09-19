import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("nhap vao ten:");
        String ten= sc.nextLine();
        System.out.println("nhap tuoi");
        int tuoi= sc.nextInt();
        System.out.println("nhap chieu cao");
        double chCao= sc.nextDouble();
        System.out.println("ban co thich lap trinh khong");
        String trloi= new Scanner(System.in).nextLine();
        System.out.println("ten      : "+ten);
        System.out.println("tuoi     : "+tuoi);
        System.out.println("chieu cao: "+chCao);
        System.out.println(trloi+" thich lap trinh");
    }
}