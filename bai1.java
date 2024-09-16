import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để đọc dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);
        
        // Hiển thị thông báo yêu cầu người dùng nhập tên
        System.out.print("Nhập tên của bạn: ");
        
        // Đọc tên người dùng từ bàn phím
        String name = scanner.nextLine();
        
        // Hiển thị lời chào với tên người dùng
        System.out.println("Hello " + name);
        
        // Đóng đối tượng Scanner
        scanner.close();
    }
}