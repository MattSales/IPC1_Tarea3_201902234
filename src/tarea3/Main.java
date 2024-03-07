
package tarea3;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
       
        
        List<Figura> lista = new LinkedList<>();
        //atributos cuadro longitudLado / noLados
        Cuadro cuadro = new Cuadro(15.6, 4);
        //atributos triangulo base / altura / noLados
        Triangulo triangulo = new Triangulo(4, 8, 3);
        //atributos ciruclo radio / noLados
        Circulo circulo = new Circulo(3.5, 0);
        
        lista.add(cuadro);
        lista.add(triangulo);
        lista.add(circulo);
        
        for(Figura figura : lista){
            System.out.println("Figura: " + figura.nombreFigura() + " Area: " + figura.area());
        }

    }
    
}
