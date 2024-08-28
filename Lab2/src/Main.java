public class Main {
    public static void main(String[] args) throws Exception {        

        FabricarCelular apple = FabricanteCelularSingleton.getInstance("apple");
        FabricarCelular samsung = FabricanteCelularSingleton.getInstance("samsung");

        Celular iphoneS = apple.constroiCelular(null);
        Celular galaxy8 = samsung.constroiCelular(null);
        
        
        iphoneS.tiraFoto();
        iphoneS.fazLigacao();
        System.out.println("IPhoneS");

        galaxy8.tiraFoto();
        galaxy8.fazLigacao();
        System.out.println("Galaxy8");

    }
}
