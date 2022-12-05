package taxiDepot.economy;

import taxiDepot.vehicleInterior.VehicleInterior;

public class HyundaiSolaris extends EconomyCar {
    VehicleInterior vehicleInterior = new VehicleInterior(false,
            false,
            true,
            true,
            true,
            false,
            "plastic");

    public HyundaiSolaris() {
        super("Hyundai",
                "Solaris",
                1110,
                5.3,
                114,
                4);

    }

    @Override
    public String info() {
        return super.info() +
                vehicleInterior.toString();
    }


}
