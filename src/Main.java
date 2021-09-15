import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        CarList list =new CarList();
        list=Start.startReading(list);
        Start.startMenu(list);

    }


}
