public class SamsungFabricante implements FabricarCelular {


    @Override
    public Celular constroiCelular(String modelo) {
        return new Galaxy8Celular();
    }
}