package Interfaz;

public interface InterfazBiblioteca {
    boolean prestarLibro (String libro);
    String devolverLibro ();
    String [] listarLibrosPrestados ();
    String [] listarLibrosPorDevolver ();
    void inicializarPila();
    void inicializarCola();
}
