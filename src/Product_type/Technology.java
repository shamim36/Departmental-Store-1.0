package Product_type;

import Welcoming_window.Welcome_menu;

public class Technology extends Welcome_menu {



    @Override
    public void welcome(){
        System.out.println("------------------------------------------------------------");
        System.out.println("--                         IT Menu                        --");
        System.out.println("------------------------------------------------------------");
        System.out.println("\t1. Mobile Phone");
        System.out.println("\t2. Desktop Computer (PC)");
        System.out.println("\t3. Laptop");
        System.out.println("\t4. Exit this shopping Catagory\n");
        System.out.println("-----------------------------------------------------------");
    }

    public void desktop_brand(){
        System.out.println("-----------------------------------------------------------");
        System.out.println("\t1. HP --> Price: 50000.00tk");
        System.out.println("\t2. Dell --> Price: 60000.00tk");
        System.out.println("\t3. Lenovo --> Price: 70000.00tk");
        System.out.println("\t4. Exit\n");
        System.out.println("-----------------------------------------------------------");
    }
    public double desktop_brand_menu(int choice){

        switch (choice) {
            case 1:
                System.out.println("You have selected HP --> Price: 50000.00tk");
                return 50000.00;
            case 2:
                System.out.println("You have selected Dell --> Price: 60000.00tk");
                return 60000.00;
            case 3:
                System.out.println("You have selected Lenovo --> Price: 70000.00tk");
                return 70000.00;
            default:
                System.out.println("You did not buy anything");
        }

        return 0.00;

    }

    public void laptop_brand(){
        System.out.println("-----------------------------------------------------------");
        System.out.println("\t1. HP --> Price: 70000.00tk");
        System.out.println("\t2. Dell --> Price: 80000.00tk");
        System.out.println("\t3. Lenovo --> Price: 90000.00tk");
        System.out.println("\t4. Exit\n");
        System.out.println("-----------------------------------------------------------");
    }
    public double laptop_brand_menu(int choice){

        switch (choice) {
            case 1:
                System.out.println("You have selected HP --> Price: 70000.00tk");
                return 70000.00;
            case 2:
                System.out.println("You have selected Dell --> Price: 80000.00tk");
                return 80000.00;
            case 3:
                System.out.println("You have selected Lenovo --> Price: 90000.00tk");
                return 90000.00;
            default:
                System.out.println("You did not buy anything");
        }

        return 0.00;

    }

    public void mobile_brand(){
        System.out.println("-----------------------------------------------------------");
        System.out.println("\t1. Samsung --> Price: 20000.00tk");
        System.out.println("\t2. Nokia --> Price: 15000.00tk");
        System.out.println("\t3. Apple --> Price: 50000.00tk");
        System.out.println("\t4. Xiaomi --> Price: 10000.00tk");
        System.out.println("\t5. Exit\n");
        System.out.println("-----------------------------------------------------------");
    }

    public double mobile_brand_menu(int choice){

        switch (choice) {
            case 1:
                System.out.println("You have selected Samsung --> Price: 20000.00tk");
                return 20000.00;
            case 2:
                System.out.println("You hava Selected Nokia --> Price: 15000.00tk");
                return 15000.00;
            case 3:
                System.out.println("You have selected Apple --> Price: 50000.00tk");
                return 50000.00;
            case 4:
                System.out.println("You have selected Xiaomi --> Price: 10000.00tk");
                return 10000.00;
            default:
                System.out.println("You did not buy anything");
        }

        return 0.00;

    }

    public void technology_option_menu(int choice){

        switch (choice) {
            case 1:
                System.out.println("You have selected Mobile Phone");
                mobile_brand();
                break;
            case 2:
                System.out.println("You have selected Desktop Computer (PC)");
                desktop_brand();
                break;
            case 3:
                System.out.println("You have selected Laptop");
                laptop_brand();
                break;
            default:
                System.out.println("You did not buy anything");
        }

    }




}
