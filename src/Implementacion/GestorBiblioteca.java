package Implementacion;
import Interfaz.InterfazBiblioteca;
public class GestorBiblioteca implements InterfazBiblioteca {
    private String[] PilaPrestados;
    private static int TamanioPilaCola = 100;
    private String[] ColaPrestados;
    private boolean pilaInicializada = false;
    private boolean colaInicializada = false;
    private int posicionPila = 0;
    private int posicionCola = 0;

    @Override
    public void inicializarPila() {
        PilaPrestados = new String[TamanioPilaCola];
        pilaInicializada = true;
    }

    @Override
    public void inicializarCola() {
        ColaPrestados = new String[TamanioPilaCola];
        colaInicializada = true;
    }

    @Override
    public boolean prestarLibro(String libro) {
        if (!pilaInicializada){
            return false;
        }

        PilaPrestados[posicionPila] = libro;
        posicionPila++;
        return true;
    }

    @Override
    public String devolverLibro() {

        if (posicionPila == 0) {
            return "La pila está vacía.";
        }
        for(int i = posicionPila-1; i >= 0; i--){
            String libro = PilaPrestados[i];
            ColaPrestados[posicionCola]=libro;
            posicionCola++;
        }
        return ColaPrestados[posicionPila-1];
    }

    @Override
    public String[] listarLibrosPrestados() {
        // creo lista del mismo tamaño que la pila actual
        String[] librosPrestados = new String[posicionPila];

        for (int i = posicionPila - 1, j = 0; i >= 0; i--, j++) {
            librosPrestados[j] = PilaPrestados[i];
        }
        return librosPrestados;
    }

    @Override
    public String[] listarLibrosPorDevolver() {
        String [] librosPorDevolver = new String[posicionPila];
        for (int i = posicionCola - 1, j=0; i >= 0; i--,j++){
            librosPorDevolver[j] = PilaPrestados[i];
        }
        return librosPorDevolver ;
    }
}
