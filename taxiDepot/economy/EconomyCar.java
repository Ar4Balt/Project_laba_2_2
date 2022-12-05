package taxiDepot.economy;

import taxiDepot.Car;

import java.util.Objects;

/*
*   HyundaiSolaris;
    KIARio.
* */
public abstract class EconomyCar extends Car {
    private int maximumSpeed;
    private int numbersOfSeatsNotIncludingTheDriver;

    public EconomyCar() {
        super();
    }

    public EconomyCar(String brand, String nameBrand, int weight, double fuelConsumption, int maximumSpeed, int numbersOfSeatsNotIncludingTheDriver) {
        super("Economy", nameBrand, brand, weight, fuelConsumption);
        this.maximumSpeed = maximumSpeed;
        this.numbersOfSeatsNotIncludingTheDriver = numbersOfSeatsNotIncludingTheDriver;
    }

    public int getMaximumSpeed() {
        return maximumSpeed;
    }

    public void setMaximumSpeed(int maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }

    public int getNumbersOfSeatsNotIncludingTheDriver() {
        return numbersOfSeatsNotIncludingTheDriver;
    }

    public void setNumbersOfSeats(int numbersOfSeatsNotIncludingTheDriver) {
        this.numbersOfSeatsNotIncludingTheDriver = numbersOfSeatsNotIncludingTheDriver;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        EconomyCar that = (EconomyCar) o;
        return maximumSpeed == that.maximumSpeed && numbersOfSeatsNotIncludingTheDriver == that.numbersOfSeatsNotIncludingTheDriver;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), maximumSpeed, numbersOfSeatsNotIncludingTheDriver);
    }

    @Override
    public String toString() {
        return super.toString() +
                " maximumSpeed=" + maximumSpeed +
                ", numbersOfSeatsNotIncludingTheDriver=" + numbersOfSeatsNotIncludingTheDriver + '\n'
                ;
    }

}
