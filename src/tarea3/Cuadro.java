
package tarea3;

public class Cuadro extends Figura{
    
    private double longitudLado;

    public Cuadro(double longitudLado, int lado) {
        super(lado);
        this.longitudLado = longitudLado;
    }

    public double getLongitudLado() {
        return longitudLado;
    }

    public void setLongitudLado(double longitudLado) {
        this.longitudLado = longitudLado;
    }
    
    @Override
    public double area() {
        double area = getLongitudLado()*getLongitudLado();
        return area;
    }

    @Override
    public String nombreFigura() {
        return "Cuadro";
    }
    
}
