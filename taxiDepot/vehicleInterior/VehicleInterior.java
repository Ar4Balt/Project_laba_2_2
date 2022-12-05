package taxiDepot.vehicleInterior;

public class VehicleInterior {
    boolean heatedSeats;
    boolean leatherInterior;
    boolean radio;
    boolean steeringWheelWithMultitool;
    boolean iconOfTheMotherOfGod;
    boolean subwoofers;
    String decorativeTrim;

    public VehicleInterior() {
    }

    public VehicleInterior(boolean heatedSeats,
                           boolean leatherInterior,
                           boolean radio,
                           boolean steeringWheelWithMultitool,
                           boolean iconOfTheMotherOfGod,
                           boolean subwoofers,
                           String decorativeTrim) {
        this.heatedSeats = heatedSeats;
        this.leatherInterior = leatherInterior;
        this.radio = radio;
        this.steeringWheelWithMultitool = steeringWheelWithMultitool;
        this.iconOfTheMotherOfGod = iconOfTheMotherOfGod;
        this.subwoofers = subwoofers;
        this.decorativeTrim = decorativeTrim;
    }

    public boolean isHeatedSeats() {
        return heatedSeats;
    }

    public void setHeatedSeats(boolean heatedSeats) {
        this.heatedSeats = heatedSeats;
    }

    public boolean isLeatherInterior() {
        return leatherInterior;
    }

    public void setLeatherInterior(boolean leatherInterior) {
        this.leatherInterior = leatherInterior;
    }

    public boolean isRadio() {
        return radio;
    }

    public void setRadio(boolean radio) {
        this.radio = radio;
    }

    public boolean isSteeringWheelWithMultitool() {
        return steeringWheelWithMultitool;
    }

    public void setSteeringWheelWithMultitool(boolean steeringWheelWithMultitool) {
        this.steeringWheelWithMultitool = steeringWheelWithMultitool;
    }

    public boolean isIconOfTheMotherOfGod() {
        return iconOfTheMotherOfGod;
    }

    public void setIconOfTheMotherOfGod(boolean iconOfTheMotherOfGod) {
        this.iconOfTheMotherOfGod = iconOfTheMotherOfGod;
    }

    public boolean isSubwoofers() {
        return subwoofers;
    }

    public void setSubwoofers(boolean subwoofers) {
        this.subwoofers = subwoofers;
    }

    public String getDecorativeTrim() {
        return decorativeTrim;
    }

    public void setDecorativeTrim(String decorativeTrim) {
        this.decorativeTrim = decorativeTrim;
    }

    @Override
    public String toString() {
        return " heatedSeats=" + heatedSeats +
                ", leatherInterior=" + leatherInterior +
                ", radio=" + radio +
                ", steeringWheelWithMultitool=" + steeringWheelWithMultitool +
                ", iconOfTheMotherOfGod=" + iconOfTheMotherOfGod +
                ", subwoofers=" + subwoofers +
                ", decorativeTrim='" + decorativeTrim + '\'' +
                '\n';
    }
}
