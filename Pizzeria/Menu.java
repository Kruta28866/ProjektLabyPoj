import java.io.Console;
import java.util.Scanner;

public class Menu implements Keys{

    public static void main(String[] args) {

        Menu menu = new Menu();

        Scanner scan = new Scanner(System.in);

        System.out.println("1. Zamów Pizze.");
        System.out.println("2. Stwórz pizze.");
        System.out.println("3. Koniec.");

        int input = scan.nextInt();

        System.out.println("Wybór: " + input);

        menu.cls();

        if(input == 1){
            Order order = new Order();
            System.out.println("Tworzę nowe zamówienie");
            menu.cls();
            order.main(args);
            menu.main(args);



        }
        if(input == 2){
            Create create = new Create();
            System.out.println("Tworzę nową pizze");
            menu.cls();
            create.main(args);
            menu.main(args);
        }
        if (input == 3){
            System.exit(0);
        }







    }



}

    


