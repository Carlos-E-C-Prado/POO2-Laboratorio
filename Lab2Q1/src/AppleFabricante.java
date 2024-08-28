public class AppleFabricante implements FabricarCelular {

    @Override
    public Celular constroiCelular(String modelo) {
        
        return new IPhoneSCelular();
    }
}