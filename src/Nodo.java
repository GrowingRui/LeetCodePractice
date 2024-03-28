public class Nodo {
    private int dato;
    private Nodo siguiente;
    public Nodo(int dato,Nodo siguiente){
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public int getDato() {
        return dato;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }
}
