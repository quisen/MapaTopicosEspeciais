package mapatopicosespeciais;

public abstract class Operacao implements Elemento {
    
    Elemento elemento1;
    Elemento elemento2;
   
    public Operacao(Elemento elemento1, Elemento elemento2) {
        this.elemento1 = elemento1;
        this.elemento2 = elemento2;
    }
    
}
