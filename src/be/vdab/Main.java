package be.vdab;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author marcdejonge
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String bestandsnaam = "H:/Eiland.txt";
        Eiland eiland = Eiland.getInstance();
        List<Inwoner> inwoners = new ArrayList<>();
        
        try (BufferedReader reader = new BufferedReader(new FileReader(bestandsnaam));) {
            String regel = reader.readLine();
            while (regel != null) {
                Inwoner eenInwoner = InwonerFactory.INSTANCE.create(regel);
                inwoners.add(eenInwoner);
                eiland.addObserver(eenInwoner);
                regel = reader.readLine();
            }
        } catch (IOException e) {
            System.out.println("File niet gevonden");
        }
        eiland.vulkaanuitbarsting();
    } 
}
