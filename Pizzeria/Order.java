import java.util.Scanner;

public class Order extends Pizza{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Menu menu = new Menu();

        int Allcost = 0;


        System.out.println("Proszę o wybór opcji");
        System.out.println("1. Dowóz");
        System.out.println("2. Odbiór własny");
        int input = scan.nextInt();
        if (input == 1) {
            System.out.println("Proszę o wprowadzenie odległości w km");
            int distance = scan.nextInt();
            Allcost += (distance);
        }
        System.out.println("proszę o wybór ilośći pizz");
        int input2 = scan.nextInt();
        for (int i = 1; i <= input2; i++) {
            System.out.println("Koszt:" + Allcost);
            System.out.println("proszę o wybór pizzy od 1-3.");
            System.out.println("Menu:");
            System.out.println(vege.toString());
            System.out.println(capri.toString());
            System.out.println(pepe.toString());


            input = scan.nextInt();


            switch (input) {
                case 1:
                    System.out.println("wybrałeś pizze" + vege.getName());
                    System.out.println("Proszę o wybór wielkości pizzy " + vege.getName());
                    System.out.println("mała " + vege.getpSmall());
                    System.out.println("średnia " + vege.getpAvarage());
                    System.out.println("duża " + vege.getpBig());
                    input = scan.nextInt();
                    if (input == 1) {
                        Allcost += vege.getpSmall();
                    }
                    if (input == 2) {
                        Allcost += vege.getpAvarage();
                    }
                    if (input == 3) {
                        Allcost += vege.getpBig();
                    }
                    break;
                case 2:
                    System.out.println("wybrałeś pizze" + capri.getName());
                    System.out.println("Proszę o wybór wielkości pizzy " + capri.getName());
                    System.out.println("mała " + capri.getpSmall());
                    System.out.println("średnia " + capri.getpAvarage());
                    System.out.println("duża " + capri.getpBig());
                    input = scan.nextInt();
                    if (input == 1) {
                        Allcost += capri.getpSmall();
                    }
                    if (input == 2) {
                        Allcost += capri.getpAvarage();
                    }
                    if (input == 3) {
                        Allcost += capri.getpBig();
                    }
                    break;
                case 3:
                    System.out.println("wybrałeś pizze" + pepe.getName());
                    System.out.println("Proszę o wybór wielkości pizzy " + pepe.getName());
                    System.out.println("mała " + pepe.getpSmall());
                    System.out.println("średnia " + pepe.getpAvarage());
                    System.out.println("duża " + pepe.getpBig());
                    input = scan.nextInt();
                    if (input == 1) {
                        Allcost += pepe.getpSmall();
                    }
                    if (input == 2) {
                        Allcost += pepe.getpAvarage();
                    }
                    if (input == 3) {
                        Allcost += pepe.getpBig();
                    }
                    break;
                default:
                    System.out.println("Błąd - nieprawidłowy wybór");
                    menu.main(args);
                    break;


            }
        }

            System.out.println("Czy chciałbyś kontynuwać zakupy?");
            System.out.println("1. Tak");
            System.out.println("2. Nie");
            input = scan.nextInt();
            if (input == 1) {
                Order.main(args);
            }
            if (input == 2) {
                System.out.println("Do zapłaty: " + Allcost);
                System.out.println("powrót do Strony głównej");
                menu.cls();
                menu.main(args);
            }
        }



}


