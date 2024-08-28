import interfaces.IVehicle;
import interfaces.IVehicleMaker;

public class Main {
        
        public static void main(String[] args) {
            // obter instância da fábrica
            IVehicleMaker toyota = Singleton.getInstance("toyota");
            IVehicleMaker honda = Singleton.getInstance("honda");
            

            //criar veículos
            IVehicle corolla = toyota.makeVehicle("Corolla");
            IVehicle hilux = toyota.makeVehicle("Hilux");
            IVehicle etios = toyota.makeVehicle("Etios");

            IVehicle city = honda.makeVehicle("City");
            IVehicle civic = honda.makeVehicle("Civic");
            IVehicle fit = honda.makeVehicle("Fit");
    
            // Demonstrando o funcionamento dos veículos
            corolla.start();
            corolla.drive();
            corolla.stop();
            System.out.println("\n");
            hilux.start();
            hilux.drive();
            hilux.stop();
            System.out.println("\n");
            etios.start();
            etios.drive();
            etios.stop();
            System.out.println("\n");
            city.start();
            city.drive();
            city.stop();
            System.out.println("\n");
            civic.start();
            civic.drive();
            civic.stop();
            System.out.println("\n");
            fit.start();
            fit.drive();
            fit.stop();
        }




    }

