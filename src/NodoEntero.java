public class NodoEntero {
    private int clave;
    private int dato;
    private NodoEntero siguiente;

    public NodoEntero(int clave, int dato, NodoEntero siguiente) {
        this.clave = clave;
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public NodoEntero getSiguiente() {
        return siguiente;
    }
    public int getDato() {
        return dato;
    }
    public int getClave() {
        return clave;
    }
    public void setSiguiente(NodoEntero siguiente) {
        this.siguiente = siguiente;
    }
    public void setDato(int dato) {
        this.dato = dato;
    }
    public void setClave(int clave) {
        this.clave = clave;
    }
}
