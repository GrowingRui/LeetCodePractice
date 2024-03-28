public class ListaOrdinal {
    private Nodo inicio, fin;
    private int numElementos;
    public ListaOrdinal(){
        inicio = null;
        fin = null;
        numElementos = 0;
    }
    public boolean vacia(){
        return inicio == null;
    }
    public void insertar(int dato){
        Nodo nuevo = new Nodo(dato,null);
        if (inicio == null){
            inicio = nuevo;
        }else {
            fin.setSiguiente(nuevo);
        }
        fin = nuevo;
        numElementos++;
    }
    public void mostrar(){
        System.out.print("[");
        Nodo actual = inicio;
        while (actual != null){
            System.out.print(actual.getDato()+" ");
            actual = actual.getSiguiente();
        }
        System.out.println("]");
    }
    public int getElemento(int posicion){
        if (posicion < 0 || posicion >= numElementos){
            System.out.println("Error, posición incorrecta");
            return -99999;
        }else {
            Nodo actual = inicio;
            for (int i = 0; i < posicion; i++){
                actual = actual.getSiguiente();
            }
            return actual.getDato();
        }
    }
    public int getNumElementos() {
        return numElementos;
    }
    public boolean borrar(int dato){
        Nodo actual = inicio;
        Nodo anterior = null;
        while (actual != null && actual.getDato() != dato){
            anterior = actual;
            actual = actual.getSiguiente();
        }
        if (actual != null){
            if (actual == inicio){
                inicio = actual.getSiguiente();
            }else {
                anterior.setSiguiente(actual.getSiguiente());
            }
            if (actual == fin){
                fin = anterior;
            }
            numElementos--;
            return true;
        }else {
            return false;
        }
    }
    public int posicion(int dato){
        Nodo actual = inicio;
        int posicion = 0;
        while (actual != null && actual.getDato() != dato){
            actual = actual.getSiguiente();
            posicion++;
        }
        if (actual != null){
            return posicion;
        }else {
            return -1;
        }
    }
    public boolean contiene(int dato){
        return this.posicion(dato) >= 0;
    }

    public Iterador getIterador(){
        return new Iterador(inicio);
    }
}
