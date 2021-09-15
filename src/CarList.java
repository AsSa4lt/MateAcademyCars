import java.util.ArrayList;

public class CarList {
    public ArrayList<HIGHSPEED> hCarsList=new ArrayList<HIGHSPEED>();
    public ArrayList<ELECTRIC> eCarsList=new ArrayList<ELECTRIC>();
    public ArrayList<PICKUP> pCarsList=new ArrayList<PICKUP>();

    public ArrayList<HIGHSPEED> gethCarsList() {
        return hCarsList;
    }

    public ArrayList<ELECTRIC> geteCarsList() {
        return eCarsList;
    }

    public ArrayList<PICKUP> getpCarsList() {
        return pCarsList;
    }

    public void add(ELECTRIC e){
        this.eCarsList.add(e);
    }
    public void add(HIGHSPEED h){
        this.hCarsList.add(h);
    }

    public void add(PICKUP p){
        this.pCarsList.add(p);
    }
    public void showCatalog() {
        for (int i = 0; i < eCarsList.size(); i++) {
            System.out.println(eCarsList.get(i).toString());
        }

        for (int i = 0; i < hCarsList.size(); i++) {
            System.out.println(hCarsList.get(i).toString());
        }

        for (int i = 0; i < pCarsList.size(); i++) {
            System.out.println(pCarsList.get(i).toString());
        }
    }

}
