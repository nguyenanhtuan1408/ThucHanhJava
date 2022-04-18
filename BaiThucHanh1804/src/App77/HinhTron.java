package App77;

public class HinhTron extends HinhHoc {
    
    protected float banKinh;
    private Scanner scanner;
    
    // Constructor
    public HinhTron() {
        super();
        scanner = new Scanner(System.in);
    }
    
    public void nhapBanKinh() {
        // Nhập đơn vị tính là centimet hay inch
        System.out.println("Bạn dùng đơn vị tính nào: ");
        System.out.println("\t1 - Centimet");
        System.out.println("\t2 - inch");
        Configs.donVi = scanner.nextInt();
        
        // Sau đó nhập bán kính
        System.out.println("Hãy nhập vào Bán kính Hình tròn: ");
        banKinh = scanner.nextFloat();
    }
    
    public void inThongTin() {
        if (Configs.donVi == Configs.DON_VI_CM) {
            System.out.println("Hình tròn có bán kính " + banKinh + " cm");
            System.out.println("Tương đương " + Configs.ChuyenCentimetSangInch(banKinh) + " inch");
        } else {
            System.out.println("Hình tròn có bán kính " + banKinh + " inch");
            System.out.println("Tương đương " + Configs.ChuyenInchSangCentimet(banKinh) + " cm");
        }
    }

}
