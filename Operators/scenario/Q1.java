
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double originalPrice = sc.nextDouble();
        double discount = sc.nextDouble();
        double discountAmount = (originalPrice * discount) / 100.0;
        double finalPrice = originalPrice - discountAmount;
        System.out.println("Discount Amount: " + discountAmount);
        System.out.println("Final Price: " + finalPrice);
        sc.close();
    }

}
