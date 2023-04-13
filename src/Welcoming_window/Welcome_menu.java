package Welcoming_window;



public class Welcome_menu{
    public int choice;

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

        System.out.println("\t1. Cloth For Boys");
        System.out.println("\t2. Technology");
        System.out.println("\t3. Grocery");
        System.out.println("\t4. Exit\n");
        System.out.println("-----------------------------------------------------------");
    }
}
