package Product_type;

import Welcoming_window.Welcome_menu;

import java.util.Scanner;

public class Grocery extends Welcome_menu {
    @Override
    public void welcome(){
        System.out.println("-----------------------------------------------------------");
        System.out.println("--                     Grocery Menu                      --");
        System.out.println("-----------------------------------------------------------");
        System.out.println("\t1. Fish & Meat");
        System.out.println("\t2. Dairy & Eggs");
        System.out.println("\t3. Oil & Fat");
        System.out.println("\t4. Exit this shopping Catagory\n");
        System.out.println("-----------------------------------------------------------");
    }
    public void fish_meat(){
        System.out.println("-----------------------------------------------------------");
        System.out.println("\t1. Beef --> Price: 500.00tk");
        System.out.println("\t2. Chicken --> Price: 200.00tk");
        System.out.println("\t3. Mutton --> Price: 1000.00tk");
        System.out.println("\t4. Exit\n");
        System.out.println("-----------------------------------------------------------");
    }
    public double fish_meat_menu(int choice){
        switch (choice) {
            case 1:
                System.out.println("You have selected Beef --> Price: 500.00tk");
                return 500.00;
            case 2:
                System.out.println("You have selected Chicken --> Price: 200.00tk");
                return 200.00;
            case 3:
                System.out.println("You have selected Mutton --> Price: 1000.00tk");
                return 1000.00;
            default:
                System.out.println("You did not buy anything");
        }
        return 0.00;
    }
    public void dairy_eggs(){
        System.out.println("-----------------------------------------------------------");
        System.out.println("\t1. Milk --> Price: 50.00tk");
        System.out.println("\t2. Cheese --> Price: 100.00tk");
        System.out.println("\t3. Butter --> Price: 200.00tk");
        System.out.println("\t4. Exit\n");
        System.out.println("-----------------------------------------------------------");
    }
    public double dairy_eggs_menu(int choice){
        switch (choice) {
            case 1:
                System.out.println("You have selected Milk --> Price: 50.00tk");
                return 50.00;
            case 2:
                System.out.println("You have selected Cheese --> Price: 100.00tk");
                return 100.00;
            case 3:
                System.out.println("You have selected Butter --> Price: 200.00tk");
                return 200.00;
            default:
                System.out.println("You did not buy anything");
        }
        return 0.00;
    }
    public void oil_fat(){
        System.out.println("-----------------------------------------------------------");
        System.out.println("\t1. Sunflower Oil --> Price: 100.00tk");
        System.out.println("\t2. Mustard Oil --> Price: 80.00tk");
        System.out.println("\t3. Coconut Oil --> Price: 120.00tk");
        System.out.println("\t4. Exit\n");
        System.out.println("-----------------------------------------------------------");
    }
    public double oil_fat_menu(int choice){
        switch (choice) {
            case 1:
                System.out.println("You have selected Sunflower Oil --> Price: 100.00tk");
                return 100.00;
            case 2:
                System.out.println("You have selected Mustard Oil --> Price: 80.00tk");
                return 80.00;
            case 3:
                System.out.println("You have selected Coconut Oil --> Price: 120.00tk");
                return 120.00;
            default:
                System.out.println("You did not buy anything");
        }
        return 0.00;
    }
    public double total_price = 0.00;
    public void grocery_option_menu(){
        Scanner input = new Scanner(System.in);
        Grocery grocery = new Grocery();

        int choice;
        do {
            grocery.welcome();
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    grocery.fish_meat();
                    System.out.print("Enter your choice: ");
                    choice = input.nextInt();
                    total_price += grocery.fish_meat_menu(choice);
                    break;
                case 2:
                    grocery.dairy_eggs();
                    System.out.print("Enter your choice: ");
                    choice = input.nextInt();
                    total_price += grocery.dairy_eggs_menu(choice);
                    break;
                case 3:
                    grocery.oil_fat();
                    System.out.print("Enter your choice: ");
                    choice = input.nextInt();
                    total_price += grocery.oil_fat_menu(choice);
                    break;
                case 4:
                    System.out.println("You have selected to exit from Grocery Menu");
                    break;
                default:
                    System.out.println("You have selected an invalid option");
            }
        } while (choice != 4);

    }

}
