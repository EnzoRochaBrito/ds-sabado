package interfaces;

public class Cachorro implements Animal{

    @Override
    public String emitirSom() {
        return "Au Au";
    }

    @Override
    public String comer() {
        return "Ração";
    }
}
