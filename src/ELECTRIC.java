import java.util.Objects;

public class ELECTRIC extends Car{
    private int range;
    private double accCapacity;
    private int guarantee;

    public ELECTRIC(String brand, String model, double accTime, double maxSpeed, int range, double accCapacity, int guarantee) {
        super(brand, model, accTime, maxSpeed);
        this.range = range;
        this.accCapacity = accCapacity;
        this.guarantee = guarantee;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public double getAccCapacity() {
        return accCapacity;
    }

    public void setAccCapacity(double accCapacity) {
        this.accCapacity = accCapacity;
    }

    public int getGuarantee() {
        return guarantee;
    }

    public void setGuarantee(int guarantee) {
        this.guarantee = guarantee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ELECTRIC that = (ELECTRIC) o;
        return range == that.range && Double.compare(that.accCapacity, accCapacity) == 0 && guarantee == that.guarantee;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), range, accCapacity, guarantee);
    }

    @Override
    public String toString() {
        return "ELECTRIC{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", accTime='" + getAccTime() + '\'' +
                ", maxSpeed=" + getMaxSpeed() +
                " diapason=" + range +
                ", accCapacity=" + accCapacity +
                ", garanty=" + guarantee +
                '}';
    }
}
