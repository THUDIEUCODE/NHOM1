package tuan2;

import java.util.Scanner;
public class bai2{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("nhap vao ho va ten ");
        String ten = sc.nextLine();
        System.out.print("nhap vao tuoi ");
        int tuoi = sc.nextInt();
        System.out.print("nhap vao chieu cao ");
        double ccao = sc.nextDouble();
        System.out.print("ban co thich lap trinh k ");
        boolean ltrinh = sc.nextBoolean();
        
        System.out.println("..............");
        System.out.println(ten);
        System.out.println(tuoi);
        System.out.println(ccao);
        System.out.println(ltrinh);
    }
}