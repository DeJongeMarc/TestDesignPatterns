package be.vdab;

import java.util.Observer;

/**
 *
 * @author marcdejonge
 */
public abstract class Inwoner implements Observer {

    private String naam;
    
    public Inwoner (String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }
    
    @Override
    public String toString(){
        return naam;
    }
}
