import java.util.HashMap;
import java.util.Map;

public class ManagementSystem {
    private Map<String, Vehicle> vehicleRegistry = new HashMap<>();

    public void registerVehicle(String licensePlate, Vehicle vehicle) {
        vehicleRegistry.put(licensePlate, vehicle);
    }

    public Vehicle getVehicle(String licensePlate) {
        return vehicleRegistry.get(licensePlate);
    }

    //store user profiles or vehicle availability
}
