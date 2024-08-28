import interfaces.IVehicle;
import interfaces.IVehicleMaker;

public class Honda implements IVehicleMaker {

    @Override
    public IVehicle makeVehicle(String model) {
        
        if ("City".equalsIgnoreCase(model)) {
            return new City();
        } else if ("Civic".equalsIgnoreCase(model)) {
            return new Civic();
        } else if ("Fit".equalsIgnoreCase(model)) {
            return new Fit();
        } else {
            return null; // Modelo não suportado
        }
    }
}
