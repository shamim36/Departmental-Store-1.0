package Welcoming_window;

public class Welcome_menu {
    private int choice;

    public int getChoice() {
        return choice;
    }

    public void setChoice(int choice) {
        this.choice = choice;
    }


    public void welcome() {
        System.out.println("============================================================");
        System.out.println("==                                                        ==");
        System.out.println("==              Welcome To Departmental Store             ==");
        System.out.println("==                                                        ==");
        System.out.println("============================================================");
    }

    public static void menu_option(){

        System.out.println("\t1. Product_type.Cloth For Boys");
        System.out.println("\t2. Product_type.Technology");
        System.out.println("\t3. Product_type.Grocery");
        System.out.println("\t4. Exit\n");
        System.out.println("-----------------------------------------------------------");
    }
}
