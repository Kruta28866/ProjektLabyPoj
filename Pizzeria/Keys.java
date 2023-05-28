import java.util.Scanner;

public interface Keys {
    default void cls()
        {


            try {
                Thread.sleep(400);
                System.out.print(".");
                Thread.sleep(400);
                System.out.print(".");
                Thread.sleep(400);
                System.out.print(".");
                System.out.println();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            for (int i = 0; i < 50; i++) {
                System.out.println();
            }


    }
    default void Create(){
    }

}
