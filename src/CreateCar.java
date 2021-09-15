import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CreateCar {
    public static void electric(CarList list) {
        System.out.println("Please enter brand");
        Scanner in = new Scanner(System.in);
        String brand = "";
        try {
            brand = in.nextLine();
        } catch (InputMismatchException ime) {
            System.out.println("Wrong input in brand");
            electric(list);
        }
        brand = "ELECTRIC " + brand;


        String model = "";
        System.out.println("Please enter model");
        try {
            model = in.nextLine();
        } catch (InputMismatchException ime) {
            System.out.println("Wrong input in brand");
            electric(list);

        }

        double accTime=0;
        System.out.println("Please enter Acceleration time (0-100 kmph)");
        try {
            accTime = in.nextDouble();
        } catch (InputMismatchException ime) {
            System.out.println("Wrong input in Acceleration time (0-100 kmph)");
            electric(list);
        }

        double maxSpeed=0;
        System.out.println("Please enter Top speed (Kmph)");
        try {
            maxSpeed = in.nextDouble();
        } catch (InputMismatchException ime) {
            System.out.println("Wrong input in Top speed (Kmph)");
            electric(list);
        }

        int range=0;
        System.out.println("Please enter Range - the distance an electric" +
                " vehicle can travel before the battery needs to be recharged (km)");
        try {
            range = in.nextInt();
        } catch (InputMismatchException ime) {
            System.out.println("Wrong input in Range - the distance an electric " +
                    "vehicle can travel before the battery needs to be recharged (km)");
            electric(list);
        }

        double accCapacity=0;
        System.out.println("Please enter Battery capacity (kW)");
        try {
            accCapacity = in.nextDouble();
        } catch (InputMismatchException ime) {
            System.out.println("Wrong input in RangeBattery capacity (kW)");
            electric(list);
        }

        int guarantee=0;
        System.out.println("Please enter Battery warranty (years)");
        try {
            guarantee = in.nextInt();
        } catch (InputMismatchException ime) {
            System.out.println("Wrong input in Battery warranty (years)");
            electric(list);
        }

        ELECTRIC el=new ELECTRIC(brand,model,accTime,maxSpeed,range,accCapacity,guarantee);
        list.add(el);
        try {
            Start.startMenu(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void highspeed(CarList list) {
        System.out.println("Please enter brand");
        Scanner in = new Scanner(System.in);
        String brand = "";
        try {
            brand = in.nextLine();
        } catch (InputMismatchException ime) {
            System.out.println("Wrong input in brand");
            highspeed(list);
        }
        brand = "HIGHSPEED " + brand;


        String model = "";
        System.out.println("Please enter model");
        try {
            model = in.nextLine();
        } catch (InputMismatchException ime) {
            System.out.println("Wrong input in brand");
            highspeed(list);
        }

        double accTime=0;
        System.out.println("Please enter Acceleration time (0-100 kmph)");
        try {
            accTime = in.nextDouble();
        } catch (InputMismatchException ime) {
            System.out.println("Wrong input in Acceleration time (0-100 kmph)");
            highspeed(list);
        }

        double maxSpeed=0;
        System.out.println("Please enter Top speed (Kmph)");
        try {
            maxSpeed = in.nextDouble();
        } catch (InputMismatchException ime) {
            System.out.println("Wrong input in Top speed (Kmph)");
            highspeed(list);
        }

        String driveType = "FWD";
        String gearBox = "";
        System.out.println("Please enter Gear box");
        try {
            gearBox = in.nextLine();
        } catch (InputMismatchException ime) {
            System.out.println("Wrong input in Gear box");
            highspeed(list);
        }


        HIGHSPEED hs=new HIGHSPEED(brand,model,accTime,maxSpeed,driveType,gearBox);
        list.add(hs);
        try {
            Start.startMenu(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void pickup(CarList list){
        System.out.println("Please enter brand");
        Scanner in = new Scanner(System.in);
        String brand = "";
        try {
            brand = in.nextLine();
        } catch (InputMismatchException ime) {
            System.out.println("Wrong input in brand");
            pickup(list);
        }
        brand = "ELECTRIC " + brand;


        String model = "";
        System.out.println("Please enter model");
        try {
            model = in.nextLine();
        } catch (InputMismatchException ime) {
            System.out.println("Wrong input in brand");
            pickup(list);

        }

        double accTime=0;
        System.out.println("Please enter Acceleration time (0-100 kmph)");
        try {
            accTime = in.nextDouble();
        } catch (InputMismatchException ime) {
            System.out.println("Wrong input in Acceleration time (0-100 kmph)");
            pickup(list);
        }

        double maxSpeed=0;
        System.out.println("Please enter Top speed (Kmph)");
        try {
            maxSpeed = in.nextDouble();
        } catch (InputMismatchException ime) {
            System.out.println("Wrong input in Top speed (Kmph)");
            pickup(list);
        }

        double consumption=0;
        System.out.println("Please enter Fuel consumption (l/100 km)");
        try{
            consumption= in.nextDouble();
        }
        catch (InputMismatchException ime){
            System.out.println("Wrong input in Fuel consumption (l/100 km)");
            pickup(list);
        }
        PICKUP p=new PICKUP(brand,model,accTime,maxSpeed,consumption);
        list.add(p);
        try {
            Start.startMenu(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
