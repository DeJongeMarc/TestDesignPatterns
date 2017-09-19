package be.vdab;

import java.beans.PropertyChangeEvent;
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
    public void propertyChange(PropertyChangeEvent evt) {
        switch(evt.getPropertyName()){
            case Eiland.AARDBEVING:
                System.out.println(getNaam() + " kruip uit je hol en ga naar een open vlakte");
                break;
            case Eiland.VULKAANUITBARSTING:
            case Eiland.ORKAAN:
                System.out.println(getNaam() + " schuil in je hol");
                break;
        }
    }
}
