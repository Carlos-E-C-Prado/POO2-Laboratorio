import interfaces.IVehicleMaker;

public class Singleton {

        private static IVehicleMaker toyotaInstance;
        private static IVehicleMaker hondaInstance;
    
        public static IVehicleMaker getInstance(String tipo) {
            
            if (tipo.equals("toyota") && toyotaInstance == null) {
                toyotaInstance = new Toyota();
                return toyotaInstance;
    
            } else if (tipo.equals("honda") && hondaInstance == null) {
                hondaInstance = new Honda();
                return hondaInstance;
            }else{
                return null;
            }
            
            
        }
}
