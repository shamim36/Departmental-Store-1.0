import Product_type.Cloth;
import Product_type.Grocery;
import Product_type.Technology;
import Welcoming_window.Welcome_menu;



import java.util.Scanner;

public class Main extends Welcome_menu {
    public static void main(String[] args) throws Exception {


        double price = 0.00;
        double total_price = 0.00;
        Scanner in = new Scanner(System.in);



        Cloth cloth = new Cloth();
        Technology technology = new Technology();
        Grocery grocery = new Grocery();
        Welcome_menu welcome_menu = new Welcome_menu();



        while(true) {
            welcome_menu.welcome();
            menu_option();
            System.out.print("Enter your choice: ");
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    cloth.welcome();

                    System.out.print("Enter your choice: ");
                    cloth.setChoice(in.nextInt());
                    cloth.cloth_option_menu(cloth.getChoice());

                    if(cloth.getChoice()==4){
                        System.out.println();

                        System.out.println("\t---------------------------------------");
                        System.out.println("\t| You have spent " + total_price + "tk|");
                        System.out.println("\t---------------------------------------");
                        break;
                    }

                    //already called cloth_size_menu() in cloth class
                    System.out.print("Enter your choice: ");
                    cloth.setChoice(in.nextInt());
                    price = cloth.cloth_size_menu(cloth.getChoice());
                    if(price>0.00){
                        total_price += price;
                        price = 0.00;
                    }
                    System.out.println();

                    System.out.println("\t---------------------------------------");
                    System.out.println("\t| You have spent " + total_price + "tk|");
                    System.out.println("\t---------------------------------------");
                    break;

                case 2:
                    technology.welcome();
                    System.out.print("Enter your choice: ");
                    technology.setChoice(in.nextInt());
                    technology.technology_option_menu(technology.getChoice());

                    if(technology.getChoice()==4){
                        System.out.println();

                        System.out.println("\t---------------------------------------");
                        System.out.println("\t| You have spent " + total_price + "tk|");
                        System.out.println("\t---------------------------------------");
                        break;
                    }

                    System.out.print("Enter your choice: ");
                    technology.setChoice(in.nextInt());
                    price = technology.mobile_brand_menu(technology.getChoice());

                    if(price>0.00){
                        total_price += price;
                        price = 0.00;
                    }
                    System.out.println();

                    System.out.println("\t---------------------------------------");
                    System.out.println("\t| You have spent " + total_price + "tk|");
                    System.out.println("\t---------------------------------------");

                    break;



                case 3:
                    grocery.grocery_option_menu();
                    price = grocery.total_price;

                    if(price>0.00){
                        total_price += price;
                        price = 0.00;
                    }


                    System.out.println();

                    System.out.println("\t---------------------------------------");
                    System.out.println("\t| You have spent " + total_price + "tk|");
                    System.out.println("\t---------------------------------------");
                    break;


                case 4:
                    System.out.println("\t\t#Thank you for shopping with us#");

                    return;



                default:
                    System.out.println("Invalid choice");
            }
            System.out.print("***Press 1 to continue Shopping or 0 to exit : ");
            int a = in.nextInt();
            if(a==0){
                System.out.println("\t\t##Thank you for shopping with us##");
                break;
            }
        }

    }



}
