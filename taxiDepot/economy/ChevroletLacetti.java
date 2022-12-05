package taxiDepot.economy;

import taxiDepot.vehicleInterior.VehicleInterior;

public class ChevroletLacetti extends EconomyCar {
    VehicleInterior vehicleInterior = new VehicleInterior(false,
            false,
            true,
            true,
            true,
            true,
            "plastic");
    public ChevroletLacetti() {
        super("Chevrolet", "Lacetti", 1145, 8.1, 175, 4);
    }

    @Override
    public String info() {
        return super.info() +
                vehicleInterior.toString();
    }


}
