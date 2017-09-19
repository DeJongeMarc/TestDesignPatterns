package be.vdab;

import java.beans.PropertyChangeEvent;
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
    public void propertyChange(PropertyChangeEvent evt) {
        if(evt.getPropertyName().equals(Eiland.ORKAAN)){
            System.out.println(getNaam() + " vlieg naar een ander eiland.");
        }else{
        System.out.println(getNaam() + " vlieg hoger.");
        }
    }
}
