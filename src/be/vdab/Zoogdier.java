package be.vdab;

import java.util.Observable;
/**
 *
 * @author marcdejonge
 */
public class Zoogdier extends Inwoner {
    
    public Zoogdier(String naam) {
        super(naam);
    }
    
    @Override
    public void update(Observable observable, Object argument){
        System.out.println(getNaam() + " schuil in je hol");
    }
}
