import java.util.Scanner;

public class pizza {
    public int price;
    public boolean veg;

    public int base;
    public int tomato;
    public int onion;
    public int takeAway;

    public pizza() {
        System.out.println("Do you want a veg pizza?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        System.out.print("Choice: ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        if(choice == 1) {
            this.veg = true;
        }
        else if(choice == 2) {
            this.veg = false;
        }
        else {
            System.out.println("Invalid Choice! Pizza set to veg");
            this.veg = true;
        }

        if(this.veg){
            price = 100;
        }
        else{
            price = 200;
        }
        base = price;
    }

    public void priceOfPizza(){
        System.out.println(price);
    }

    public void addTomato(){
        price+=50;
        tomato = 50;
    }

    public void addOnion(){
        price+=50;
        onion = 50;
    }

    public void askForExtraTopings(){
        System.out.println("Do you want to add extra topings?: ");
        System.out.println("1. Yes");
        System.out.println("2. No");
        Scanner sc = new Scanner(System.in);
        System.out.print("Choice: ");
        int choice = sc.nextInt();

        switch(choice){
            case 1:
                addExtraTopings();
                break;
            case 2:
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }
    }

    public void addExtraTopings(){
        System.out.println("What topings do you want?: ");
        System.out.println("1. Tomato");
        System.out.println("2. Onion");
        System.out.println("3. Both");
        Scanner sc = new Scanner(System.in);
        System.out.print("Choice: ");
        int choice = sc.nextInt();

        switch(choice){
            case 1:
                addTomato();
                break;
            case 2:
                addOnion();
                break;
            case 3:
                addTomato();
                addOnion();
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }
    }

    public void takeAway(){
        System.out.println("Do you want take away?: ");
        System.out.println("1. Yes");
        System.out.println("2. No");
        Scanner sc = new Scanner(System.in);
        System.out.print("Choice: ");
        int choice = sc.nextInt();

        switch(choice){
            case 1:
                price += 20;
                takeAway = 20;
                break;
            case 2:
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }
    }

    public void finalBill(){
        System.out.println("\nFINAL BILL");
        System.out.println("Base Price: " + base + "Rs");
        System.out.println("Tomato Price: " + tomato + "Rs");
        System.out.println("Onion Price: " + onion + "Rs");
        System.out.println("Take Away Price: " + takeAway + "Rs");
        System.out.println("Total Price: " + price + "Rs" + "\n");
    }
}
