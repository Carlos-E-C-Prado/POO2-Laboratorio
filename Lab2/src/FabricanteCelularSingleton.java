
public class FabricanteCelularSingleton {

    private static FabricarCelular appleInstance;
    private static FabricarCelular samsungInstance;

    public static FabricarCelular getInstance(String tipo) {
        
        if (tipo.equals("apple") && appleInstance == null) {
            appleInstance = new AppleFabricante();
            return appleInstance;

        } else if (tipo.equals("samsung") && samsungInstance == null) {
            samsungInstance = new SamsungFabricante();
            return samsungInstance;
        }
        return null;
        
    }




}