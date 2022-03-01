import java.util.Scanner;
public class App35{
public static void main(String[] args) {
    double a,b;
    Scanner scanner = new Scanner(System.in);
         
    System.out.println("Nhap 2 so can so sanh: ");
    a = scanner.nextDouble();
    b = scanner.nextDouble();
    if (a > b) {
        System.out.println("So nho nhat trong hai so la: " + b);
    }
    else  {
        System.out.println("So nho nhat trong hai so la: " + a);
    }
    }
}