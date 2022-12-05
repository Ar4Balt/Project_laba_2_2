package taxiDepot;

import static javax.swing.JOptionPane.showInputDialog;

import java.util.Objects;

public class Car {
    private String type;
    private String brand;
    private String nameBrand;
    private int weight;
    private double fuelConsumption;
    private static int carNumber;

    public Car() {
        showInputDialog(null);
    }

    public Car(String type) {
        this.type = type;
    }

    public Car(String type, String brand) {
        this.type = type;
        this.brand = brand;
    }

    public Car(String brand, int weight, double fuelConsumption) {
        this.brand = brand;
        this.weight = weight;
        this.fuelConsumption = fuelConsumption;
    }

    public Car(String type, String brand, String nameBrand, int weight, double fuelConsumption) {
        this(brand, weight, fuelConsumption);
        this.type = type;
        this.nameBrand = nameBrand;

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getNameBrand() {
        return nameBrand;
    }

    public void setNameBrand(String nameBrand) {
        this.nameBrand = nameBrand;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public static int getCarNumber() {
        return carNumber++;
    }

    public static void setCarNumber(int carNumber) {
        Car.carNumber = carNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return weight == car.weight && Double.compare(car.fuelConsumption, fuelConsumption) == 0 && Objects.equals(type, car.type) && Objects.equals(brand, car.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, brand, weight, fuelConsumption);
    }

    @Override
    public String toString() {
        return "Car №" + getCarNumber() + ":\n" +
                "type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                ", weight=" + weight +
                ", fuelConsumption=" + fuelConsumption + '\n'
                ;
    }

    public String info() {
        return "Информация о машине: \n" +
                toString();
    }


}
