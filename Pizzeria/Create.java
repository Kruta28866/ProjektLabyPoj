import java.util.Scanner;

public class Create implements Keys {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        Menu menu = new Menu();

        Pizza newpizza = new Pizza();

        System.out.println("Proszę o podanie nazwy pizzy.");
        String input = scan.nextLine();
        newpizza.setName(input);
        input = null;

        System.out.println("proszę o wprowadzenie ilości składników.");
        input = scan.nextLine();
        String[] array = new String[Integer.valueOf(input)];

        for(int i = 0; i < array.length; i++){
            System.out.println("Składnik numer " + (i + 1));
            input = scan.nextLine();
            array[i] = input;
        }
        input = null;

        newpizza.setIngri(array);

        System.out.println("Proszę o wprawadzenie Skali ostrości: ");
        input = scan.nextLine();
        newpizza.setScaleShu(Integer.parseInt(input));

        System.out.println("Proszę o wprowadzenie Cene małej pizzy");
        input = scan.nextLine();
        newpizza.setpSmall(Integer.parseInt(input));
        System.out.println("Proszę o wprowadzenie Cene średniej pizzy");
        input = scan.nextLine();
        newpizza.setpAvarage(Integer.parseInt(input));
        System.out.println("Proszę o wprowadzenie Cene Dużej pizzy");
        input = scan.nextLine();
        newpizza.setpBig(Integer.parseInt(input));

        System.out.println("Twoja pizza ");
        System.out.println(newpizza.toString());
        System.out.println("Zatwerdź zmiany 1-2.");
        System.out.println("1. Zatwierdzam");
        System.out.println("2. Odrzucam.");
        input = scan.nextLine();
        switch (Integer.valueOf(input)){
            case 1:
                System.out.println("Zmiany zostały zawierdzone");
                menu.cls();
                System.out.println("powrót do menu");
                break;
            case 2:
                System.out.println("Zmiany zostały odrzucone");
                menu.cls();
                System.out.println("powrót do menu");
                break;
            default:
                System.out.println("Błąd niepoprawna wartość");
                menu.cls();
                System.out.println("powrót do menu");
                break;
        }

    }




    }

