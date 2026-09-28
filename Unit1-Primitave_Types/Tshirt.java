import java.util.Scanner;

public class Tshirt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cost = 22;
        System.out.println("How many t-shirts you want?");
        int count = input.nextInt();
        System.out.println("The t-shirt $" + (count*cost) + ".");
        System.out.println("A personalized t-shirt $" + (count*cost + 1) + ".");
        System.out.println("Without personalization, the t-shirt $" + (count*cost) + ".");
        input.close();
    }
}