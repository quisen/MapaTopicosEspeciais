package mapatopicosespeciais;

public class Multiplicacao extends Operacao {

    public Multiplicacao(Elemento elemento1, Elemento elemento2) {
        super(elemento1, elemento2);
    }

    @Override
    public double getValor() {
        return (this.elemento1.getValor() * this.elemento2.getValor());
    }

}
