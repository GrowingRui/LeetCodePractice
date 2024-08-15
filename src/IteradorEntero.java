public class IteradorEntero {
    private NodoEntero actual;

    public IteradorEntero(NodoEntero actual) {
        this.actual = actual;
    }

    public boolean hasNext() {
        return actual != null;
    }

    public int next() {
        int resultado = actual.getDato();
        actual = actual.getSiguiente();
        return resultado;
    }
}
