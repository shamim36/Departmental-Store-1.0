package Product_type;

import Welcoming_window.Welcome_menu;

public class Cloth extends Welcome_menu {


    @Override
    public void welcome(){
        System.out.println("-----------------------------------------------------------");
        System.out.println("--                      Cloth Menu                       --");
        System.out.println("-----------------------------------------------------------");
        System.out.println("\t1. T-Shirt");
        System.out.println("\t2. Jeans");
        System.out.println("\t3. Shirt");
        System.out.println("\t4. Exit this shopping Cataqory\n");
        System.out.println("-----------------------------------------------------------");
    }

    public void cloth_size(){
        System.out.println("-----------------------------------------------------------");
        System.out.println("\t1. Small --> Price: 1000.00tk");
        System.out.println("\t2. Medium --> Price: 1500.00tk");
        System.out.println("\t3. Large --> Price: 2000.00tk");
        System.out.println("\t4. Extra Large --> Price: 2500.00tk");
        System.out.println("\t5. Exit\n");
        System.out.println("-----------------------------------------------------------");
    }

    public double cloth_size_menu(int choice){

        switch (choice) {
            case 1:
                System.out.println("You have selected Small --> Price: 1000.00tk");
                return 1000.00;
            case 2:
                System.out.println("You hava Selected Medium --> Price: 1500.00tk");
                return 1500.00;
            case 3:
                System.out.println("You have selected Large --> Price: 2000.00tk");
                return 2000.00;
            case 4:
                System.out.println("You have selected Extra Large --> Price: 2500.00tk");
                return 2500.00;
            default:
                System.out.println("You did not buy anything");
        }

        return 0.00;

    }

    public void cloth_option_menu(int choice){



        switch (choice) {
            case 1:
                System.out.println("You have selected T-Shirt");
                cloth_size();
                break;
            case 2:
                System.out.println("You have selected Jeans");
                cloth_size();
                break;
            case 3:
                System.out.println("You have selected Shirt");
                cloth_size();
                break;
            case 4:
                System.out.println("You have selected Exit from Cloth Menu");
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }



    }
}
