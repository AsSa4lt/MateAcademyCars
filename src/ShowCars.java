import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ShowCars {
    public static void partBrand(CarList list){
        System.out.println("Please, enter necessary brand");
        Scanner in=new Scanner(System.in);
        String brand=in.nextLine();
        boolean sp=false;
        for (int i = 0; i < list.eCarsList.size(); i++) {
            String find =list.eCarsList.get(i).getBrand().split(" ")[1];
            if(brand.compareTo(find)==0){
                System.out.println(list.eCarsList.get(i).toString());
                sp=true;
            }
        }

        for (int i = 0; i < list.hCarsList.size(); i++) {
            String find =list.hCarsList.get(i).getBrand().split(" ")[1];
            if(brand.compareTo(find)==0){
                System.out.println(list.hCarsList.get(i).toString());
                sp=true;
            }
        }

        for (int i = 0; i < list.pCarsList.size(); i++) {
            String find =list.pCarsList.get(i).getBrand().split(" ")[1];
            if(brand.compareTo(find)==0){
                System.out.println(list.pCarsList.get(i).toString());
                sp=true;
            }
        }
        if(sp==false){
            System.out.println("No cars of this brand");
        }
        try {
            Start.startMenu(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void partType(CarList list){
        System.out.println("Please, enter necessary Type(1-HIGHSPEED, 2-ELECTRIC, 3-PICKUP)");
        Scanner in=new Scanner(System.in);
        int block=0;
        boolean sp=false;
        try {
            block = in.nextInt();
        } catch (InputMismatchException ime) {
            System.out.println("Wrong input in menu");
            partType(list);
        }

        if(block>3 || block<1){
            System.out.println("Wrong input in menu");
            partType(list);
        }
        if(block==1){
            for (int i = 0; i < list.hCarsList.size(); i++) {
                System.out.println(list.hCarsList.get(i).toString());
                sp=true;
            }
        }
        if(block==2){
            for (int i = 0; i < list.eCarsList.size(); i++) {
                System.out.println(list.eCarsList.get(i).toString());
                sp=true;
            }
        }

        if(block==3){
            for (int i = 0; i < list.pCarsList.size(); i++) {
                System.out.println(list.pCarsList.get(i).toString());
                sp=true;
            }
        }

        if(sp==false){
            System.out.println("No cars of this type");
        }

        try {
            Start.startMenu(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
