package mapatopicosespeciais;

public class Soma extends Operacao {
    
    public Soma(Elemento elemento1, Elemento elemento2) {
        super(elemento1, elemento2);
    }
    
    @Override
    public double getValor() {
        return (this.elemento1.getValor() + this.elemento2.getValor());
    }
    
}
