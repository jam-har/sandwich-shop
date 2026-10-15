import java.util.Scanner;

public class SandwichShopApp {

    public static void main(String[] args) {

        Scanner customerInfo = new Scanner(System.in);

        System.out.print("Enter sandwich size (1.Regular or 2.Large): ");
        int subSize = customerInfo.nextInt();

        System.out.print("What's your age?: ");
        int age = customerInfo.nextInt();

        double price = 0;
        double regularPrice = 5.45;
        double largePrice = 8.95;

        if (subSize == 1){
            if (age < 17) {
                price = regularPrice * 0.9;
            }else if (age >= 65) {
                price = regularPrice * 0.8;
            }else {
                price = regularPrice;
            }
        }
        if (subSize == 2){
            if (age < 17) {
                price = largePrice * 0.9;
            }else if (age >= 65) {
                price = largePrice * 0.8;
            }else {
                price = largePrice;
            }
        }

        System.out.printf("The cost of your sub is $%.2f", price);
        System.out.println(".");

       customerInfo.close();
    }

}
