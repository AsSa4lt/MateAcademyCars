import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExitProgram {
    public static void exit(CarList list)throws IOException {
        System.out.println("Are you definitely want to leave the program?(1-Yes, 2-No)");
        Scanner in=new Scanner(System.in);
        int block=0;
        try {
            block = in.nextInt();
        } catch (InputMismatchException ime) {
            System.out.println("Wrong input in menu");
            exit(list);
        }
        switch (block) {
            case (1):
                System.exit(0);
            case (2):
                Start.startMenu(list);
            default:
                System.out.println("Wrong input in menu");
                exit(list);
        }

    }
}
