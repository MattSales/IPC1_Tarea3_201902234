
package tarea3;

public abstract class Figura {
    private int lado;

    public Figura(int lado) {
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
    
    public abstract double area();
    
    public abstract String nombreFigura();
    
}
