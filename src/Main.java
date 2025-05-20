import Interfaz.InterfazBiblioteca;
import Implementacion.GestorBiblioteca;
public class Main {
    public static void main(String[] args) {
        InterfazBiblioteca gestor  = new GestorBiblioteca();
        gestor.inicializarPila();
        gestor.inicializarCola();

        gestor.prestarLibro("El Quijote");
        gestor.prestarLibro("Cien Años de Soledad");
        gestor.prestarLibro("Odisea");
        gestor.prestarLibro("Farenheit 451");

        System.out.println("Libros Prestados: ");
        for(String libro: gestor.listarLibrosPrestados()){
            System.out.println ("-" + libro);
        }

        System.out.println("Libro mas antiguo por devolver: " + gestor.devolverLibro());

        System.out.println("Libros por devolver: ");
        for(String libro: gestor.listarLibrosPorDevolver()){
            System.out.println ("-" + libro);
        }


    }
}
