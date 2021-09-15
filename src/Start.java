import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Start {
    public static void startMenu(CarList list) throws IOException {
        int block=0;
        System.out.println("Please make your choice:\n" +
                "1. Show the entire cars catalog\n" +
                "2. Add a new high-speed car\n"+
                "3. Add a new electric car\n"+
                "4. Add a new pickup car\n"+
                "5. Show all cars of a particular brand\n"+
                "7. Show all cars of a particular type\n"+
                "8. Stop the program");
        Scanner in=new Scanner(System.in);
        try {
            block = in.nextInt();
        } catch (InputMismatchException ime) {
            System.out.println("Wrong input in menu");
            startMenu(list);
        }

        switch (block) {
            case (1):
                list.showCatalog();
                Start.startMenu(list);
                break;
            case (2):
                CreateCar.highspeed(list);
                break;
            case (3):
                CreateCar.electric(list);
                break;
            case (4):
                CreateCar.pickup(list);
                break;
            case (5):
                ShowCars.partBrand(list);
                break;
            case (7):
                ShowCars.partType(list);
                break;
            case (8):
                ExitProgram.exit(list);
                break;
            default:
                System.out.println("Wrong input in menu");
                startMenu(list);
        }
    }

    public static CarList startReading(CarList list){
        try {
            File file = new File("cars.txt");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                String[] spl = line.split("; ");
                int i=0;
                String type="";
                while(spl[0].charAt(i)!=' '){
                    type=type+spl[0].charAt(i);
                    i++;
                }
                if(type.compareTo("HIGH-SPEED")==0){
                    try{
                        HIGHSPEED h=new HIGHSPEED(spl[0],spl[1],Double.parseDouble(spl[2]),Double.parseDouble(spl[3]),spl[4],spl[5]);
                        list.add(h);
                    }
                    catch (NumberFormatException e){
                        System.out.println("Error of reading HIGHSPEED car");
                    }

                }

                if(type.compareTo("ELECTRIC")==0){
                    try{
                        ELECTRIC e=new ELECTRIC(spl[0],spl[1],Double.parseDouble(spl[2]),Double.parseDouble(spl[3]),
                                Integer.parseInt(spl[4]), Double.parseDouble(spl[5]),Integer.parseInt(spl[6]));
                        list.add(e);
                    }
                    catch (NumberFormatException e){
                        System.out.println("Error of reading ELECTRIC car");
                    }

                }

                if(type.compareTo("PICKUP")==0){
                    try{
                        PICKUP p=new PICKUP(spl[0],spl[1],Double.parseDouble(spl[2]),Double.parseDouble(spl[3]),
                                Double.parseDouble(spl[4]));
                        list.add(p);
                    }
                    catch (NumberFormatException e){
                        System.out.println("Error of reading PICKUP car");
                    }

                }

                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }


}
