package mapatopicosespeciais;

/**
 *
 * @author Rodrigo Quisen
 */
public class Numero implements Elemento {

    private double valor;

    @Override
    public double getValor() {
        return this.valor;
    }

    public void Numero(double valor) {
        this.valor = valor;
    }

}
