import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để đọc dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);
        
        // Nhập hai số nguyên từ người dùng
        System.out.print("Nhập số nguyên thứ nhất: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Nhập số nguyên thứ hai: ");
        int num2 = scanner.nextInt();
        
        // Tính toán tổng, hiệu, tích, thương và phần dư
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        double quotient = (double) num1 / num2; // Chuyển đổi để tính thương chính xác
        int remainder = num1 % num2;
        
        // In ra kết quả
        System.out.println("Tổng: " + sum);
        System.out.println("Hiệu: " + difference);
        System.out.println("Tích: " + product);
        
        // Kiểm tra nếu num2 khác 0 để tránh lỗi chia cho 0
        if (num2 != 0) {
            System.out.println("Thương: " + quotient);
            System.out.println("Phần dư: " + remainder);
        } else {
            System.out.println("Không thể chia cho 0!");
        }
        
        // Đóng đối tượng Scanner
        scanner.close();
    }
}