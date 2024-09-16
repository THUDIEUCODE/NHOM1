public class bai2 {
    public static void main(String[] args) {
        // Khai báo các biến
        String name = "Quý Bửu"; // Tên (kiểu String)
        int age = 18;             // Tuổi (kiểu int)
        double height = 1.6;     // Chiều cao (kiểu double, ví dụ: 1.75 mét)
        boolean likesProgramming = true; // Có thích lập trình không (kiểu boolean)

        // In ra các giá trị đã lưu
        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Chiều cao: " + height + " mét");
        System.out.println("Có thích lập trình không: " + (likesProgramming ? "Có" : "Không"));
    }
}