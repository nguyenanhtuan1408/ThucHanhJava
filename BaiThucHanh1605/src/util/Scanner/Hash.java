package util.Scanner;
import java.util.HashSet;
import java.util.Scanner;
public class Hash {
public static void main(String[] args) {
        String name;
        HashSet<String> hashSetString = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        // thêm các phần tử vào hashSetstring
        hashSetString.add("Wilson");
        hashSetString.add("Nike");
        hashSetString.add("Volvo");
        hashSetString.add("Kia");
        hashSetString.add("Lenovo");
        hashSetString.add("Lenovo");

        // hiến thị các phần tử trong hashSetString
        System.out.println("Các phần tử trong hashSetstring: ");
        System.out.println(hashSetString);
        System.out.println("Nhập phần từ cần xóa: ");
        name = scanner.nextLine();
    // nếu phần tử cần xóa có tồn tại hashSetString thì sẽ thông báo xóa thành công
    // và hiến thị các phần tử còn lại ngược lại thông báo xóa không thành công
        if (hashSetString.contains(name)){
            hashSetString.remove(name);
            System.out.println("Xóa thành công!");
            System.out.println("Các phần tử còn lại trong hashsetString: ");
            System.out.println(hashSetString);
        } else {
            System.out.println("Xóa không thành công!");
        }
    }
}
