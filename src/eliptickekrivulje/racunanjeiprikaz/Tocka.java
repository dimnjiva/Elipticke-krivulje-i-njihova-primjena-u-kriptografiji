
package eliptickekrivulje.racunanjeiprikaz;

public class Tocka {
    public int x;
    public int y;
    public boolean beskTocka; 
    
    /* KONSTRUKTORI */
    
    public Tocka(){
        x = 0;
        y = 0;
        beskTocka = false;
    }
    
    public Tocka(int X, int Y){
        x = X;
        y = Y;
        beskTocka = false;
    }
    
    public Tocka(Tocka t){
        x = t.x;
        y = t.y;
        beskTocka = t.beskTocka;
    }
    
    /* funkcija beskonacnaTocka() oznacava tocku kao beskonacnu */
    
    public Tocka beskonacnaTocka(){
        Tocka t = new Tocka();
        t.beskTocka = true;
        return t;
    }
    
    /* provjera jesu li dvije tocke jednake */
    
    public boolean jednako(Tocka t){
        if(t == null) return false;
        if(this.beskTocka == t.beskTocka) return true;
        if (this.x == t.x && this.y == t.y) return true;
        return false;
    }
    
    /* Ispis tocke */
    
    @Override public String toString(){
        if(this.beskTocka) return "Tocka je beskonacna.";
        else{
            return "(" + x + ", " + y + ")";
        }
    }
}
