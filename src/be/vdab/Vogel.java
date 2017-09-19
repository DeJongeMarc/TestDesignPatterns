package be.vdab;

import java.util.Observable;
/**
 *
 * @author marcdejonge
 */
public class Vogel extends Inwoner {
    
    public Vogel(String naam) {
        super(naam);
    }
    
    @Override
    public void update(Observable observable, Object argument){
        System.out.println(getNaam() + " vlieg hoger.");
    }
}
