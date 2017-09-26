package mapatopicosespeciais;

public class Numero implements Elemento {
    
    double valor;
    
    public Numero(double valor) {
        this.valor = valor;
    }
    
    @Override
    public double getValor() {
        return this.valor;
    }
}
