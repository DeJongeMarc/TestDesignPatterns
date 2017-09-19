package be.vdab;

import java.util.Observable;

/**
 *
 * @author marcdejonge
 */
public class Eiland extends Observable {
    
    private static final Eiland INSTANCE = new Eiland();
    
    private Eiland(){
    }
   
    public static Eiland getInstance(){
        return INSTANCE;
    }
    
    public void vulkaanuitbarsting() {
        setChanged();
        notifyObservers();
    }
}
