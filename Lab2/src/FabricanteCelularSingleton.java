
public class FabricanteCelularSingleton {

    private static FabricarCelular appleInstance = new AppleFabricante();
    private static FabricarCelular samsungInstance = new SamsungFabricante();

    public static FabricarCelular getInstance(String tipo) {

        if (tipo.equals("apple")) {
            return appleInstance;

        } else if (tipo.equals("samsung")) {

            return samsungInstance;

        }else{
            return null;
        }
        
    }




}