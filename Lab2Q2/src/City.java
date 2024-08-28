import interfaces.IVehicle;

public class City implements IVehicle  {

    @Override
    public void start() {
        // TODO Auto-generated method stub
        System.out.println("City 'start'");
    }

    @Override
    public void drive() {
        // TODO Auto-generated method stub
        System.out.println("City 'drive'");
    }

    @Override
    public void stop() {
        // TODO Auto-generated method stub
        System.out.println("City 'stop'");
    }

}
