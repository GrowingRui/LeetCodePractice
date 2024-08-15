public class ListaCalificadaEntero {
    private NodoEntero inicio;
    private int numElementos;

    public ListaCalificadaEntero() {
        inicio = null;
        numElementos = 0;
    }

    public boolean vacia() {
        return inicio == null;
    }

    /**
     * Inserta el alumno en la posición que le corresponde según la clave
     */
    public void insertar(int clave, int dato) {
        NodoEntero anterior = null;
        NodoEntero actual = inicio;
        while ((actual != null) && (actual.getClave() < clave)) {  // Buscar posición de inserción
            anterior = actual;
            actual = actual.getSiguiente();
        }
        if ((actual == null) || (actual.getClave() > clave)) {  // Insertar antes de actual
            NodoEntero nuevo = new NodoEntero(clave, dato, actual);
            if (actual == inicio) {  // insertar al principio de la lista
                inicio = nuevo;
            } else {
                anterior.setSiguiente(nuevo);
            }
            numElementos++;
        } else {
            actual.setDato(dato);
        }
    }

    /**
     * Busca la clave en la lista. Si la encuentra devuelve el alumno asociado a dicha clave,
     * y si no la encuentra devuelve null.
     */
        public int getElemento(int clave) {
        NodoEntero actual = inicio;
        while ((actual != null) && (actual.getClave() < clave)) {  // Buscar clave
            actual = actual.getSiguiente();
        }
        if ((actual == null) || (actual.getClave() > clave)) {  // No existe clave
            return -9999;
        } else {   // Clave encontrada
            return actual.getDato();
        }
    }

    /**
     * Determina si la clave recibida como parámetro existe en la lista.
     */
    public boolean contiene(int clave) {
        return this.getElemento(clave) != -9999;
    }

    /**
     * Elimina de la lista el alumno con número de matrícula clave,
     * en caso de existir.
     */
    public boolean borrar(int clave) {
        NodoEntero actual = inicio;
        NodoEntero anterior = null;
        while ((actual != null) && (actual.getClave() < clave)) {  // Buscar clave
            anterior = actual;
            actual = actual.getSiguiente();
        }
        if ((actual == null) || (actual.getClave() > clave)) {  // No existe clave
            return false;
        } else {  // Clave encontrada
            if (actual == inicio) {    // eliminar el primero de la lista
                inicio = actual.getSiguiente();
            } else {
                anterior.setSiguiente(actual.getSiguiente());
            }
            numElementos--;
            return true;
        }
    }

    public int getNumElementos() {
        return numElementos;
    }

    public IteradorEntero getIterador() {
        return new IteradorEntero(inicio);
    }
    public void mostrarClaves(){
        if (inicio != null){
            NodoEntero actual = inicio;
            System.out.print("[ ");
            while (actual != null){
                System.out.print(actual.getClave()+" ");
                actual = actual.getSiguiente();
            }
            System.out.println("]");
        }
    }
    public void mostrarDatos(){
        if (inicio != null){
            NodoEntero actual = inicio;
            System.out.print("[ ");
            while (actual != null){
                System.out.print(actual.getDato()+" ");
                actual = actual.getSiguiente();
            }
            System.out.println("]");
        }
    }
    public void mostrarClaveDato(){
        if (inicio != null){
            NodoEntero actual = inicio;
            System.out.print("[ ");
            while (actual != null){
                System.out.print("("+actual.getClave()+","+actual.getDato()+") ");
                actual = actual.getSiguiente();
            }
            System.out.println("]");
        }
    }

    public static void main(String[] args) {

    }
}
