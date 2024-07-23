package gt.edu.miumg.ejercicio;

public abstract class Personaje {
    private String nombre;
    private String descripcion;
    private long tamano;
    private int poder;
    private int vida;

    public abstract void desplazarse ();
    public abstract int mostrarVida ();
    public abstract void mostrarPoder();
}
