import java.util.Objects;

public class PICKUP extends Car{
    public double consumption;

    public PICKUP(String brand, String model, double accTime, double maxSpeed, double consumption) {
        super(brand, model, accTime, maxSpeed);
        this.consumption = consumption;
    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PICKUP pickup = (PICKUP) o;
        return Double.compare(pickup.consumption, consumption) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), consumption);
    }

    @Override
    public String toString() {
        return "PICKUP{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", accTime='" + getAccTime() + '\'' +
                ", maxSpeed=" + getMaxSpeed() +
                " consumption=" + consumption +
                '}';
    }
}
