import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("--Welcome to Pizza Palace--");
            System.out.println("1. Order Pizza");
            System.out.println("2. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    pizza p = new pizza();
                    p.askForExtraTopings();
                    p.takeAway();
                    p.finalBill();
                    break;
                case 2:
                    System.out.println("Thanks for visiting...");
                    return;
                default:
                    System.out.println("Invalid!");
                    break;
            }
        }
    }
}