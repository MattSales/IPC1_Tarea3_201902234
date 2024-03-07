
package tarea3;

public class Circulo extends Figura{
    
    private double radio;

    public Circulo(double radio, int lado) {
        super(lado);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double area() {
        return Math.PI*Math.pow(getRadio(),2);
    }

    @Override
    public String nombreFigura() {
        return "Circulo";
    }
    
    
}
