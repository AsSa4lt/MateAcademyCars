import java.util.Objects;

public class HIGHSPEED extends Car{
    private String driveType;
    private String gearBox;

    public HIGHSPEED(String brand, String model, double accTime, double maxSpeed, String driveType, String gearBox) {
        super(brand, model, accTime, maxSpeed);
        this.driveType = driveType;
        this.gearBox = gearBox;
    }

    public String getDriveType() {
        return driveType;
    }

    public void setDriveType(String driveType) {
        this.driveType = driveType;
    }

    public String getGearBox() {
        return gearBox;
    }

    public void setGearBox(String gearBox) {
        this.gearBox = gearBox;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        HIGHSPEED highspeed = (HIGHSPEED) o;
        return Objects.equals(driveType, highspeed.driveType) && Objects.equals(gearBox, highspeed.gearBox);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), driveType, gearBox);
    }

    @Override
    public String toString() {
        return "HIGHSPEED{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", accTime='" + getAccTime() + '\'' +
                ", maxSpeed=" + getMaxSpeed() +
                " driveType='" + driveType + '\'' +
                ", gearBox='" + gearBox + '\'' +
                '}';
    }
}
