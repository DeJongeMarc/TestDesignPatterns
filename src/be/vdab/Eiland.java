package be.vdab;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 *
 * @author marcdejonge
 */
public class Eiland {
    
    private static Eiland INSTANCE = null;
    
    private PropertyChangeSupport propertyChangeSupport = null;
    public static final String VULKAANUITBARSTING="Vulkaanuitbarsting";
    public static final String AARDBEVING="Aardbeving";
    public static final String ORKAAN="Orkaan";
    
    private Eiland(){
        propertyChangeSupport =new PropertyChangeSupport(this);
    }
   
    public static synchronized Eiland getInstance(){
        if( INSTANCE==null){
            INSTANCE=new Eiland();
        }
        return INSTANCE;
    }
    
    public void vulkaanuitbarsting() {
//        setChanged();
//        notifyObservers();
        propertyChangeSupport.firePropertyChange(VULKAANUITBARSTING, false, true);
    }
    
    public void aardbeving() {
//        setChanged();
//        notifyObservers();
        propertyChangeSupport.firePropertyChange(AARDBEVING, false, true);
    }
    
    public void orkaan(){
        propertyChangeSupport.firePropertyChange(ORKAAN, false, true);
    }
    
    public void addPropertyChangeListener(String event, PropertyChangeListener listener){
        propertyChangeSupport.addPropertyChangeListener(event, listener);
    }
    
    public void removePropertyChangeListener(String event, PropertyChangeListener listener){
        propertyChangeSupport.removePropertyChangeListener(event, listener);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener){
        propertyChangeSupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener){
        propertyChangeSupport.removePropertyChangeListener(listener);
    }
}
