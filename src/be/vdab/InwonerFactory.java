package be.vdab;

/**
 *
 * @author marcdejonge
 */
public enum InwonerFactory {
    INSTANCE;
    public Inwoner create (String regel) {
        switch (regel.charAt(0)) {
            case 'V':
            case 'v':
                return new Vogel(regel.substring(1));
            case 'Z':
            case 'z':
                return new Zoogdier(regel.substring(1));
            default:
                throw new IllegalArgumentException();
        }
    }
}
