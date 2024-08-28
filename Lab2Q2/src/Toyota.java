import interfaces.IVehicle;
import interfaces.IVehicleMaker;

public class Toyota implements IVehicleMaker {

    @Override
    public IVehicle makeVehicle(String model) {
        // Criação de veículos com base no modelo
        if ("Corolla".equalsIgnoreCase(model)) {
            return (IVehicle) new Corolla();
        } else if ("Hilux".equalsIgnoreCase(model)) {
            return (IVehicle) new Hilux();
        } else if ("Etios".equalsIgnoreCase(model)) {
            return (IVehicle) new Etios();
        } else {
            return null; // Modelo não suportado
        }
    }
}
