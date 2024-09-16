import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để đọc dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);
        
        // Nhập số tiền gửi
        System.out.print("Nhập số tiền gửi (VND): ");
        double principal = scanner.nextDouble();
        
        // Nhập lãi suất hàng năm (theo phần trăm)
        System.out.print("Nhập lãi suất hàng năm (theo phần trăm): ");
        double annualInterestRate = scanner.nextDouble();
        
        // Nhập số tháng gửi
        System.out.print("Nhập số tháng gửi: ");
        int months = scanner.nextInt();
        
        // Chuyển đổi lãi suất hàng năm từ phần trăm sang tỷ lệ thập phân
        double monthlyInterestRate = annualInterestRate / 100 / 12;
        
        // Tính số tiền lãi
        double interest = principal * monthlyInterestRate * months;
        
        // Tính số tiền gốc cuối kỳ
        double finalAmount = principal + interest;
        
        // In kết quả
        System.out.println("Số tiền lãi: " + interest + " VND");
        System.out.println("Số tiền gốc cuối kỳ: " + finalAmount + " VND");
        
        // Đóng đối tượng Scanner
        scanner.close();
    }
}