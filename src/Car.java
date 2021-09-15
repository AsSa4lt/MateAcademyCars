import java.util.Objects;

public class Car {
    private String brand;
    private String model;
    private double accTime;
    private double maxSpeed;

    public Car(String brand, String model, double accTime, double maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.accTime = accTime;
        this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getAccTime() {
        return accTime;
    }

    public void setAccTime(double accTime) {
        this.accTime = accTime;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", accTime='" + accTime + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.maxSpeed, maxSpeed) == 0 && Objects.equals(brand, car.brand) && Objects.equals(model, car.model) && Objects.equals(accTime, car.accTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, accTime, maxSpeed);
    }
}
