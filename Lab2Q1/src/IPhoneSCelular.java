public class IPhoneSCelular implements Celular {

    @Override
    public void fazLigacao() {
        System.out.println("IPhoneS faz ligação");
    }

    @Override
    public void tiraFoto() {
        System.out.println("IPhoneS tira foto");
    }
}